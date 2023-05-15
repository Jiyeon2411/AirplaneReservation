package Main;

public class Passenger {
	
    private String name;
    private String rsvNum;
    public Passenger(String name, String rsvNum) {
        this.name = name;
        this.rsvNum = rsvNum;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getrsvNum() {
        return rsvNum;
    }
    public void setrsvNum(String rsvNum) {
        this.rsvNum = rsvNum;
    }
}