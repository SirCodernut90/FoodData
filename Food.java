public class Food {
    private String category;
    private String commodity;

    public Food(String cat, String com) {
        this.category = cat;
        this.commodity = com;
    }

    public String getCategory() {
        return this.category;
    }

    public String getCommodity() {
        return this.commodity;
    }

    public String toString() {
        return ", Category: " + this.category + ", Commodity: " + this.commodity;
    }
}
