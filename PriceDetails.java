public class PriceDetails {
    private String unit;
    private String priceFlag;
    private String priceType;

    public PriceDetails(String u, String pf, String pt) {
        this.unit = u;
        this.priceFlag = pf;
        this.priceType = pt;
    }

    public String getUnit() {
        return this.unit;
    }

    public String priceFlag() {
        return this.priceFlag;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public String toString() {
        return ", Unit: " + this.unit + ", Price Flag: " + this.priceFlag + ", Price Type: " + this.priceType;
    }
}
