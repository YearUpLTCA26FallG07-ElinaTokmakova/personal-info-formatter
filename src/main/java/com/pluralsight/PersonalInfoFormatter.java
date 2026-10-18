package com.pluralsight;

public class PersonalInfoFormatter {
    public static void main(String[] args) {
        String firstName = "Sarah";
        String lastName = "Johnson";
        int age = 28;
        double annualSalary = 67543.789;

        double roundDollarSalary = Math.round(annualSalary);
        double roundThousandSalary = Math.floor(annualSalary / 1000) * 1000;
        double roundCentSalary = Math.round(annualSalary * 100) / 100.0;

        System.out.println("\n===== Sarah Johnson, 28 years old =====" +
                "\nSenior accountant, has CPA." +
                "\nBeen with a company since 2020." +
                "\n\nExact annual salary: $" + annualSalary +
                "\nRounded-to-dollar annual salary (use for quick display): $" + roundDollarSalary +
                "\nRounded-to-thousand annual salary (use for reports): $" + roundThousandSalary +
                "\nRounded-to-cent annual salary (use for formal documents): $" + roundCentSalary);

        System.out.println("\nMessage from " + firstName + " " + lastName + ": " +
                "\nHello! I'm a senior accountant with CPA license." +
                "\nI am 28 years old. My current annual salary is $" + String.format("%.0f", roundThousandSalary) + ".");
    }
}