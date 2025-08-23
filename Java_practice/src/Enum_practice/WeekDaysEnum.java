package Enum_practice;


public class WeekDaysEnum {
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Second day of work.");
                break;
            case WEDNESDAY:
                System.out.println("Midweek already!");
                break;
            case THURSDAY:
                System.out.println("Almost Friday!");
                break;
            case FRIDAY:
                System.out.println("Last working day!");
                break;
            case SATURDAY:
                System.out.println("Weekend fun starts!");
                break;
            case SUNDAY:
                System.out.println("Rest and recharge!");
                break;
        }
    }
}
