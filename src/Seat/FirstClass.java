package Seat;

public class FirstClass implements SeatClass {

	@Override
	public String getClass(int fare) {
		if(fare <= 500) {
			return "Economy";
		} else if(fare >= 100 && fare <= 500) {
			return "Business";
		} else {
			return "First";
		}
		
	}

}
