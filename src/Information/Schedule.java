package Information;

public class Schedule {
	int flightTime;
	String startPoint; //출발지
	String dest; //도착지
	String flightNum; //편명
	
	public Schedule(int flightTime, String startPoint, String dest, String flightNum) {
		this.flightTime = flightTime;
		this.startPoint = startPoint;
		this.dest = dest;
		this.flightNum = flightNum;
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
