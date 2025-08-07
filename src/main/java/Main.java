import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        LocalDate today =LocalDate.of(2025,8,21);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println("Default format: " + today);
        System.out.println("Custom format 1: " + today.format(dtf1));
        System.out.println("Custom format 2: " + today.format(dtf2));

        System.out.println();

        LocalTime now = LocalTime.of(14, 30, 0);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println("Default Format: " + now);
        System.out.println("24 Hour Format: " + now.format(timeFormatter));
        System.out.println("12 Hour Format: " + now.format(timeFormatter2));

        System.out.println();

        LocalDateTime event = LocalDateTime.of(2025, 11, 27, 19, 0, 0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm a");

        System.out.println("Default format: " + event);
        System.out.println("Custom format: " + event.format(dtf));
        System.out.println();
        LocalDate startDate = LocalDate.of(2025,9,1);
        System.out.println("Start date after trying to modify it: " + startDate);
        startDate.plusDays(10);
        LocalDate endDate = startDate.plusDays(10); // This will not change startDate, as LocalDate is immutable
        System.out.println("The original start date is still: " + startDate);
        System.out.println("The new end date is: " + endDate);

        System.out.println();

        LocalDateTime baseTime = LocalDateTime.of(2025, 10, 15, 10, 30, 0);

        LocalDateTime futureTime = baseTime.plusYears(1).plusMonths(2).plusHours(5);
        LocalDateTime pastTime = baseTime.minusWeeks(3).minusDays(3);

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("Base time:   " + baseTime.format(dtf4));
        System.out.println("Future time: " + futureTime.format(dtf4));
        System.out.println("Past time:   " + pastTime.format(dtf4));

        System.out.println();

        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2026, 7, 20);

        Period period = Period.between(date1, date2);

        System.out.print("The period between the two dates is: ");
        System.out.print(period.getYears() + " years, ");
        System.out.print(period.getMonths() + " months, and ");
        System.out.println(period.getDays() + " days.");


    }
}
