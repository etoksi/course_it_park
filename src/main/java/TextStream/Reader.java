package TextStream;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {

    public static void main(String[] args) {

        sortWordsByFrequency(getStringList(getText()));

    }

    @NotNull
    private static List<String> getStringList(String s) {
        return List.of(s.toLowerCase(Locale.ROOT).split("[ \n\\-.,:;\"+]+"));
    }

    private static void sortWordsByFrequency(List<String> list) {
        Map<Object, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        frequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .flatMap(obj -> Stream.of(obj.getKey()))
                .forEachOrdered(System.out::println);
    }

    public static String getText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text to see all words sorted by number of appearance from most to least frequent " +
                "or enter d to test program on default text");
        while (!scanner.hasNextLine()) {
            scanner.next();
        }
        String input = scanner.nextLine();
        if (input.equals("d")) {
            return readFromFile();
        }
        return input;
    }

    public static String readFromFile() {
        Path path = Path.of("src/main/java/TextStream/test_text.txt");
        StringBuilder stringBuilder = new StringBuilder();
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(stringBuilder::append);
        } catch (IOException ex) {
            ex.getMessage();
        }
        return stringBuilder.toString();
    }
}

