public class Main {
    public static void main(String[] args) {

        Car c1=new Car();
        ParkingLot parkingLot=new ParkingLot(2);
        c1.park(parkingLot);
        Car c2=new Car();
        c2.park(parkingLot);
        Car c3=new Car();
        c3.park(parkingLot);
        parkingLot.isFull();
        Car c4=new Car();


     //   parkingLot.unpark();



    }
}
