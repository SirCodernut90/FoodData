public class Location {
    private String admin1;
    private String admin2;
    private String market;

    public Location(String a1, String a2, String m) {
        this.admin1 = a1;
        this.admin2 = a2;
        this.market = m;
    }

    public String getAdmin1() {
        return this.admin1;
    }

    public String getAdmin2() {
        return this.admin2;
    }

    public String getMarket() {
        return this.market;
    }

    public String toString() {
        return "Admin1: " + this.admin1 + ", Admin2: " + this.admin2 + ", Market: " + this.market; 
    }
}
