package Seat;

public class EconomyClass implements SeatClass {
	
	@Override
    public String getSeatClass(int fare) {
        return "Economy";
    }
}