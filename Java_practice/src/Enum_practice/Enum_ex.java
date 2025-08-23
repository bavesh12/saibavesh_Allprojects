package Enum_practice;

public class Enum_ex {
    enum Day { sun, mon, tue, wed, thu, fri, sat }

    public static void main(String[] args) {
        Day today = Day.sat;

        if (today == Day.sun || today == Day.sat) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        switch (today) {
            case sun:
                System.out.println("Sunday");
                break;
            case mon:
                System.out.println("Monday");
                break;
            case tue:
                System.out.println("Tuesday");
                break;
            case wed:
                System.out.println("Wednesday");
                break;
            case thu:
                System.out.println("Thursday");
                break;
            case fri:
                System.out.println("Friday");
                break;
            case sat:
                System.out.println("Saturday");
                break;
        }
    }
}

