package Information;

public class Schedule {
	int flightTime;
	String startPoint; //출발지
	String dest; //도착지
	
	public Schedule(int flightTime, String startPoint, String dest) {
		this.flightTime = flightTime;
		this.startPoint = startPoint;
		this.dest = dest;
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
}
