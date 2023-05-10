package AirplaneReservation.project;

public class Passenger {
	String psgName;
	int psgId;
	int rsvNum;
	
	public Passenger(String psgName, int psgId, int rsvNum) {
		this.psgName = psgName;
		this.psgId = psgId;
		this.rsvNum = rsvNum;
	}

	public String getPsgName() {
		return psgName;
	}

	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}

	public int getPsgId() {
		return psgId;
	}

	public void setPsgId(int psgId) {
		this.psgId = psgId;
	}

	public int getRsvNum() {
		return rsvNum;
	}

	public void setRsvNum(int rsvNum) {
		this.rsvNum = rsvNum;
	}
	
	
}
