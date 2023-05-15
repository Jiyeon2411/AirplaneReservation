package Main;

public class Schedule {

    private String flightNumber;
    private String startPoint;
    private String destination;
    private String departureTime;
    
    public Schedule(String flightNumber, String startPoint, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.startPoint = startPoint;
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getStartPoint() {
        return startPoint;
    }
    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}