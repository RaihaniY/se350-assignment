import java.util.Objects;

public class Airport {
    private String airportName;
    public Airport(String name) throws BadParameterException, NullParameterException {
        setAirportName(name);
    }
    private void setAirportName(String aName) throws BadParameterException, NullParameterException {
        if (aName == null){
            throw new NullParameterException("Null value passed for name");
        }
        if (aName.length() !=3){
            throw new BadParameterException("Bad value passed in for name");
        }
        for(int i=0; i<aName.length(); i++){
            if (!Character.isLetter(aName.charAt(i)) || aName.charAt(i)!=aName.toUpperCase().charAt(i)){
                throw new BadParameterException("Bad value passed in for name");
            }
        }
        airportName=aName;

    }
    public String getAirportName(){
        return airportName;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airport Name:", getAirportName()));
        return sb.toString();
    }
    public boolean equals(Object obj){
        if (obj == null || (getClass() != obj.getClass())){
            return false;
        }
        final Airport other = (Airport) obj;
        if (!getAirportName().equals(other.getAirportName())){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        return Objects.hash(airportName);
    }
}
