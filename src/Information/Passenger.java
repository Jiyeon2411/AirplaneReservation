package Information;

public class Passenger {
	String psgName;
	int psgId;
	
	public Passenger(String psgName, int psgId) {
		this.psgName = psgName;
		this.psgId = psgId;
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
}
