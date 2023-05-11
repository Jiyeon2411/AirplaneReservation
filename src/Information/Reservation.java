package Information;

public class Reservation {
	String psgName;
	int rsvNum;
	int flightTime;
	String startPoint; //출발지
	String dest; //도착지
	String flightNum; //편명
	int fare; //항공값
	
	public Reservation(String psgName, int rsvNum, int flightTime, String startPoint, String dest, String flightNum, int fare) {
		this.psgName = psgName;
		this.rsvNum = rsvNum;
		this.flightTime = flightTime;
		this.startPoint = startPoint;
		this.dest = dest;
		this.flightNum = flightNum;
		this.fare = fare;
	}

	@Override
	public String toString() {
		return psgName + rsvNum + "출발지: " + startPoint + "도착지: " + dest + flightNum + flightTime;
	}

	public String getPsgName() {
		return psgName;
	}

	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}

	public int getRsvNum() {
		return rsvNum;
	}

	public void setRsvNum(int rsvNum) {
		this.rsvNum = rsvNum;
	}

	public int getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	
	
}
