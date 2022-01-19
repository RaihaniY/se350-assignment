import java.util.Objects;

public class Airline {
    private String airlineName;
    Airline(String aLineName) throws BadParameterException, NullParameterException {
        setName(aLineName);
    }
    private void setName(String lineName) throws NullParameterException, BadParameterException {
        if (lineName == null){
            throw new NullParameterException("Null value passed in for name");
        }
        if (lineName.length()>8){
            throw new BadParameterException("Bad value passed in for name");
        }
        airlineName=lineName;
    }
    public String getAirlineName(){
        return airlineName;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport Name:", getAirlineName()));
        return sb.toString();
    }
    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())){
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirlineName().equals(other.getAirportName())){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return Objects.hash(airlineName);
    }
}
