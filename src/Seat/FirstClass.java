package Seat;

public class FirstClass implements SeatClass {
	
    @Override
    public String getSeatClass(int fare) {
        return "First";
    }
}