public class Record {
    DateCategorizer date;
    Location location;
    Coordinates coord;
    Food food;
    PriceDetails pd;
    final String currency = "INR";
    Price price;

    public Record() { }
    
    public Record(int month, int year, String a1, String a2, String m, double lat, double lon,
                  String cat, String com, String upf, String pt, double price, double usd ) {
        this.date = new DateCategorizer(month, year);
        location = new Location(a1, a2, m);
        coord = new Coordinates(lon, lat);
        food = new Food(cat, com);
        pd = new PriceDetails(upf, pt);
        this.price = new Price(price, usd);
    }
}