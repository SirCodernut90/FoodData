public class Price {
    private double price;
    private double usdPrice;

    public Price(double price, double usd) {
        this.price = price;
        this.usdPrice = usd;
    }

    public double getPrice() {
        return this.price;
    }

    public double getUSDPrice() {
        return this.usdPrice;
    }

    public String toString() {
        return ", Price: " + this.price + ", USD Price: " + this.usdPrice;
    }
}
