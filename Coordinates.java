public class Coordinates {
    private double longitude;
    private double latitude;
    private double[] coord = {longitude, latitude};

    public Coordinates(double lon, double lat) {
        longitude = lon;
        latitude = lat;
    }

    public double[] getCoordinates() {
        return coord;
    }
}
