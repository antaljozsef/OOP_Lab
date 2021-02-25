package date;

public class DateUtil {
    public int year;
    public int month;
    public int day;

    public DateUtil(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 0 && month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            return true;
        } else return false;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    @Override
    public String toString() {
        return "Year: " + this.year + " Month: " + this.month + " Day " + this.day;
    }
}
