package Main;

import Seat.BusinessClass;

import Seat.EconomyClass;

import Seat.FirstClass;

import Seat.SeatClass;

public class Reservation {
    private Passenger passenger;
    private Schedule schedule;
    private int fare;
    
    public Reservation(Passenger passenger, Schedule schedule, int fare) {
        this.passenger = passenger;
        this.schedule = schedule;
        this.fare = fare;
    }
    public void getReservationDetails() {
        
        System.out.println(passenger.getName() + "\t" + passenger.getrsvNum() + "\t" + schedule.getFlightNumber() + "\t" +
        schedule.getStartPoint() + "\t" + schedule.getDestination() + "\t" + schedule.getDepartureTime());
        
        SeatClass seatClass = getSeatClass(fare);
        if (seatClass != null) {
            System.out.println("좌석등급: " + seatClass.getSeatClass(fare));
        } else {
            System.out.println("좌석등급: 해당하는 등급이 없습니다.");
        }
    }
    private SeatClass getSeatClass(int fare) {
        SeatClass seatClass = null;
        if (fare >= 300) {
            seatClass = new FirstClass();
        } else if (fare >= 50 && fare <= 300) {
            seatClass = new BusinessClass();
        } else if (fare <= 50) {
            seatClass = new EconomyClass();
        }
        return seatClass;
    }
}