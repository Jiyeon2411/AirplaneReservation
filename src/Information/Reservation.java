package Information;

public class Reservation {
	String psgName;
	int rsvNum;
	int flightTime;
	String startPoint; //출발지
	String dest; //도착지
	String flightNum; //편명
	
	public Reservation(String psgName, int rsvNum, int flightTime, String startPoint, String dest, String flightNum) {
		this.psgName = psgName;
		this.rsvNum = rsvNum;
		this.flightTime = flightTime;
		this.startPoint = startPoint;
		this.dest = dest;
		this.flightNum = flightNum;
	}

	@Override
	public String toString() {
		return "";
	}
	
	
}
