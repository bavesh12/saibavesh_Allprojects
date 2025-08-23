package Assignment26;

import java.util.Scanner;

enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class DaysOfWeekEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String input = scanner.nextLine().toUpperCase();

        try {
            DaysOfWeek day = DaysOfWeek.valueOf(input);
            System.out.println("Position: " + day.ordinal());

            // Check if it's a weekend day
            boolean isWeekend = day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY;
            System.out.println("Is weekend? " + isWeekend);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day: " + input);
        }

        scanner.close();
    }
}