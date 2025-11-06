package lang.immutable.test;

public class ImmutableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate whitYear(int newYear) {
        return new ImmutableMyDate(newYear,month,day);
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public ImmutableMyDate whitMonth(int newMonth) {
        return new ImmutableMyDate(year,newMonth,day);
    }

    public ImmutableMyDate whitDay(int newDay) {
        return new ImmutableMyDate(year,month,newDay);
    }

}
