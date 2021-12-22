package PhoneBook;

import org.jetbrains.annotations.NotNull;

public class Contact implements Comparable<Contact> {

    String name;
    String phoneNumber;
    String operator;
    boolean isMobile;
    Contact[] contacts;

    public Contact(String name, String phoneNumber, String operator, boolean isMobile, int numberOfContacts) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.operator = operator;
        this.isMobile = isMobile;
        this.contacts = new Contact[numberOfContacts];
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull Contact o) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", operator=" + operator +
                ", isMobile=" + isMobile +
                '}';
    }
}
