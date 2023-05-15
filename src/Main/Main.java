package Main;

import Seat.SeatClass;

public class Main {
	
    public static void main(String[] args) {
        Passenger passenger = new Passenger("이지연", "0618");
        Schedule schedule = new Schedule("7C1408", "인천", "오사카", "2019-07-01 07:00");
        int fare = 20;
        Reservation reservation = new Reservation(passenger, schedule, fare);
        reservation.getReservationDetails();
    }
}