package PhoneBook;

import java.util.*;

public class PhoneBookRunner {

    protected static Contact[] arrayOfContacts;
    protected static List<Contact> listOfContacts = new ArrayList<>();
    protected static Set<Contact> setOfContacts = new HashSet<>();
    protected static Map<Integer, Contact> mapOfContacts = new HashMap<>();
    static Random random = new Random();

    public static void run() {
        initializeContacts(10000); // Add generated objects to arrayOfContacts
        fillPhoneBooksWithContacts(); // Randomly adds 100 contacts to list of contacts of each contact
        copyListOfContacts(); // Creates ArrayList, HashSet and HashMap from arrayOfContacts
        //Search through different structures for most frequent contact(s)
        findMostFrequentUsingArray();
        findMostFrequentUsingList();
        findMostFrequentUsingSet();
        findMostFrequentUsingMap();
    }

    public static void initializeContacts(int amount) {
        arrayOfContacts = new Contact[amount];
        for (int i = 0; i < amount; i++) {
            String name = generateName();
            String number = generateNumber();
            String operator = Operators.getOperator(random.nextInt(4));
            boolean isMobile = random.nextBoolean();
            arrayOfContacts[i] = new Contact(name, number, operator, isMobile, random.nextInt(100));
        }
    }

    public static String generateName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = random.nextInt(12);
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private static String generateNumber() {
        int leftLimit = 48; // 0
        int rightLimit = 57; // 9
        int targetStringLength = 10;
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void fillPhoneBooksWithContacts() {
        int size = arrayOfContacts.length;
        for (Contact contact : arrayOfContacts) {
            for (int i = 0; i < contact.contacts.length; i++) {
                contact.contacts[i] = arrayOfContacts[random.nextInt(size)];

            }
        }
    }

    public static void copyListOfContacts() {
        try {
            listOfContacts = List.of(arrayOfContacts);
            setOfContacts = Set.of(arrayOfContacts);
            for (int i = 0; i < arrayOfContacts.length; i++) {
                mapOfContacts.put(i, arrayOfContacts[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findMostFrequentUsingArray() {
        System.out.println("\n***************Searching for most frequent contacts in array***************");
        long start = System.currentTimeMillis();
        HashMap<Contact, Integer> frequencyMap = new HashMap<>();
        for (Contact contact : arrayOfContacts) {
            for (int i = 0; i < contact.contacts.length; i++) {
                if (frequencyMap.containsKey(contact.contacts[i])) {
                    frequencyMap.put(contact.contacts[i], frequencyMap.get(contact.contacts[i]) + 1);
                } else {
                    frequencyMap.put(contact.contacts[i], 1);
                }
            }
        }
        findMostFrequent(frequencyMap);
        System.out.println("Time of execution for array equals " + (System.currentTimeMillis() - start) + " ms.");
    }

    private static void findMostFrequentUsingList() {
        System.out.println("\n***************Searching for most frequent contacts in ArrayList***************");
        long start = System.currentTimeMillis();
        HashMap<Contact, Integer> frequencyMap = new HashMap<>();
        for (Contact contact : listOfContacts) {
            for (int i = 0; i < contact.contacts.length; i++) {
                if (frequencyMap.containsKey(contact.contacts[i])) {
                    frequencyMap.put(contact.contacts[i], frequencyMap.get(contact.contacts[i]) + 1);
                } else {
                    frequencyMap.put(contact.contacts[i], 1);
                }
            }
        }
        findMostFrequent(frequencyMap);
        System.out.println("Time of execution for ArrayList equals " + (System.currentTimeMillis() - start) + " ms.");
    }

    private static void findMostFrequentUsingSet() {
        System.out.println("\n***************Searching for most frequent contacts in HashSet***************");
        long start = System.currentTimeMillis();
        HashMap<Contact, Integer> frequencyMap = new HashMap<>();
        for (Contact contact : setOfContacts) {
            for (int i = 0; i < contact.contacts.length; i++) {
                if (frequencyMap.containsKey(contact.contacts[i])) {
                    frequencyMap.put(contact.contacts[i], frequencyMap.get(contact.contacts[i]) + 1);
                } else {
                    frequencyMap.put(contact.contacts[i], 1);
                }
            }
        }
        findMostFrequent(frequencyMap);
        System.out.println("Time of execution for HashSet equals " + (System.currentTimeMillis() - start) + " ms.");
    }

    public static void findMostFrequentUsingMap() {
        System.out.println("\n***************Searching for most frequent contacts in HashMap***************");
        long start = System.currentTimeMillis();
        HashMap<Contact, Integer> frequencyMap = new HashMap<>();
        for (Contact contact : mapOfContacts.values()) {
            for (int i = 0; i < contact.contacts.length; i++) {
                if (frequencyMap.containsKey(contact.contacts[i])) {
                    frequencyMap.put(contact.contacts[i], frequencyMap.get(contact.contacts[i]) + 1);
                } else {
                    frequencyMap.put(contact.contacts[i], 1);
                }
            }
        }
        findMostFrequent(frequencyMap);
        System.out.println("Time of execution for HashMap equals " + (System.currentTimeMillis() - start) + " ms.");
    }

    public static void findMostFrequent(Map<Contact, Integer> frequencyMap) {
        int maxValue = Collections.max(frequencyMap.values());
        ArrayList<String> mostFrequentList = new ArrayList<>();
        for (Map.Entry<Contact, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue().equals(maxValue)) {
                mostFrequentList.add(entry.getKey().name);
            }
        }
        System.out.println("Following contacts appeared " + maxValue + " times: ");
        System.out.println(mostFrequentList);
    }
}

