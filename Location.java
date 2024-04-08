public class Location {
    private String admin1;
    private String admin2;
    private String market;

    public Location(String a1, String a2, String m) {
        admin1 = a1;
        admin2 = a2;
        market = m;
    }

    public String getAdmin1() {
        return admin1;
    }

    public String getAdmin2() {
        return admin2;
    }

    public String getMarket() {
        return market;
    }
}
