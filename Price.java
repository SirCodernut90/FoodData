public class Price {
    private double price;
    private double usdPrice;

    public Price(double price, double usd) {
        this.price = price;
        usdPrice = usd;
    }

    public double getPrice() {
        return price;
    }

    public double getUSDPrice() {
        return usdPrice;
    }
}
