package Main;

public class Main {
	
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("이지연", "0618");
        Passenger passenger2 = new Passenger("윤정한", "1004");
        Passenger passenger3 = new Passenger("장원영", "0831");
        Passenger passenger4 = new Passenger("성준수", "1224");
        
        Schedule schedule1 = new Schedule("7C1408", "인천", "LA", "2019-07-01 07:00");
        int fare = 20;
        
        Schedule schedule2 = new Schedule("AB1234", "인천", "오사카", "2023-05-15 09:00");
        int fare2 = 100;
        
        Schedule schedule3 = new Schedule("CD5678", "인천", "파리", "2022-12-31 03:00");
        int fare3 = 300;
        
        Schedule schedule4 = new Schedule("SG3131", "부산", "나트랑", "2013-02-02 10:00");
        int fare4 = 40;
        
        System.out.println("--------------------------예약 내역--------------------------");
        System.out.println("이름  |  예약번호  |  편명  |  출발지  |  도착지  |  출발시각 ");
        System.out.println("----------------------------------------------------------");
        
        Reservation reservation1 = new Reservation(passenger1, schedule1, fare);
        reservation1.getReservationDetails();
        
        Reservation reservation2 = new Reservation(passenger2, schedule2, fare2);
        reservation2.getReservationDetails();
        
        Reservation reservation3 = new Reservation(passenger3, schedule3, fare3);
        reservation3.getReservationDetails();
        
        Reservation reservation4 = new Reservation(passenger4, schedule4, fare4);
        reservation4.getReservationDetails();
    }
}