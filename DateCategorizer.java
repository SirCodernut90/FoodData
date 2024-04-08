public class DateCategorizer {
    public int month;
    public int year;

    public DateCategorizer(int m, int y) {
        this.month = m;
        this.year = y;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.month + "/" + this.year;
    }
}