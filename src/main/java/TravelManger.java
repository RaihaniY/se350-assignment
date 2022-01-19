import java.util.Date;
public class TravelManger {
    public static void main(String args[]) throws BadParameterException, NullParameterException {
        Airport LAX = new Airport("LAX");
        Airline United = new Airline("United");
        Date airDate = new Date(2022, 1, 26, 6, 30);
        Flight flight = new Flight(United, LAX, LAX, "c3af8e70", airDate);
        System.out.println(flight);
    }
}
