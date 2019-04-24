public class Main {
    public static void main(String[] args) {

        Parkable c1=new Car();
        ParkingLot parkingLot=new ParkingLot(2);
        c1.park(parkingLot);
        Parkable c2=new Car();
        c2.park(parkingLot);
        Parkable c3=new Car();
        c3.park(parkingLot);


        parkingLot.isFull();
        Parkable J1=new Jeep();
        J1.park(parkingLot);
        J1.unpark(parkingLot);




     //   parkingLot.unpark();



    }
}
