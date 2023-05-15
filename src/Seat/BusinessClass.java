package Seat;

public class BusinessClass implements SeatClass {
	
	@Override
    public String getSeatClass(int fare) {
        return "Business";
    }
}