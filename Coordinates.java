import java.util.Arrays;

public class Coordinates {
    private double longitude;
    private double latitude;
    private double[] coord = {this.longitude, this.latitude};

    public Coordinates(double lon, double lat) {
        this.longitude = lon;
        this.latitude = lat;
        coord[0] = this.longitude;
        coord[1] = this.latitude;
    }

    public double[] getCoordinates() {
        return this.coord;
    }
    public String toString(){
        return ", [Lat, Lon]: " + Arrays.toString(getCoordinates());
    }
}
