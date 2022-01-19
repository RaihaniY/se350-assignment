import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Flight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private String flightNumber;
    private Date depatureTime;
    public Flight(Airline aline, Airport origin, Airport dest, String fNumber, Date deparTime) throws NullParameterException {
        setAirline(aline);
        setOrigine(origin);
        setDestination(dest);
        setFlightNumber(fNumber);
        setDepartureTime(deparTime);
    }
    private void setAirline(Airline aline) throws NullParameterException {
        if (aline == null){
            throw new NullParameterException("null value passed in for setAirline");
        }
        airline=aline;
    }
    public Airline getAirline(){
        return airline;
    }
    private void setOrigine(Airport aPort) throws NullParameterException {
        if (aPort == null){
            throw new NullParameterException("null value passed in for setOrigine");
        }
        origine=aPort;
    }
    public Airport getOrigine(){
        return origine;
    }
    private void setDestination(Airport aPort) throws NullParameterException {
        if (aPort == null){
            throw new NullParameterException("null value passed in for setOrigine");
        }
        destination=aPort;
    }
    public Airport getDestination(){
        return destination;
    }

    private void setFlightNumber(String fNumber) throws NullParameterException {
        if (fNumber == null ){
            throw new NullParameterException("null value passed in for setFlightNumber");
        }
        flightNumber=fNumber;
    }
    public String getFlightNumber(){
        return flightNumber;
    }
    private void setDepartureTime(Date time) throws NullParameterException {
        if(time == null){
            throw new NullParameterException("null value passed in for setDepartureTime");
        }
        depatureTime=time;
    }
    public Date getDepartureTime(){
        return depatureTime;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline Name:", getAirline().getAirlineName()));
        sb.append(String.format("%-20s %s%n", "Origin airport:", getOrigine().getAirportName()));
        sb.append(String.format("%-20s %s%n", "Destination airport:", getDestination().getAirportName()));
        sb.append(String.format("%-20s %s%n", "Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure Date:", getDepartureTime()));

        return sb.toString();
    }
    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())){
            return false;
        }
        final Flight other = (Flight) obj;
        if (!getOrigine().equals(other.getOrigine())){
            return false;
        }
        if (!getDestination().equals(other.getDestination())){
            return false;
        }
        if (!getDepartureTime().equals(other.getDepartureTime())){
            return false;
        }
        if (!getAirline().equals(other.getAirline())){
            return false;
        }
        if (!getFlightNumber().equals(other.getFlightNumber())){
            return false;
        }
            return true;
    }
    @Override
    public int hashCode(){
        return Objects.hash(getFlightNumber(), getAirline().getAirlineName(), getDestination().getAirportName(),
                getDepartureTime(), getOrigine().getAirportName());
    }
}
