public class PriceDetails {
    private String unitPriceFlag;
    private String priceType;

    public PriceDetails(String upf, String pt) {
        unitPriceFlag = upf;
        priceType = pt;
    }

    public String getUnitPriceFlag() {
        return unitPriceFlag;
    }

    public String getPriceType() {
        return priceType;
    }
}
