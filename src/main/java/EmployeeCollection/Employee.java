package EmployeeCollection;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Employee {

    private int id;
    private static int idCounter = 1;
    String name;
    String surname;
    LocalDate enrollmentDate;

    public Employee(String name, String surname, int date, int month, int year) {
        this.id = idCounter;
        this.name = name;
        this.surname = surname;
        this.enrollmentDate = LocalDate.of(year, month, date);
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public double getExperience() {
        return ChronoUnit.YEARS.between(this.enrollmentDate, LocalDate.now());
    }

    public String printExperience() {
        return "\nid " + getId() + " Name: " + getName() + " " + getSurname() + " Works for: " + Math.round(getExperience()) + " years";
    }

    @Override
    public String toString() {
        return "\nid " + getId() + " Name: " + getName() + " " + getSurname() + " Date of enrollment:  " + getEnrollmentDate().format(DateTimeFormatter.ofPattern("dd MMMM YYYY"));

    }
}
