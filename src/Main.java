public class Main {
    public static void main(String[] args) {

        Parkable car1=new Car();
        ParkingLot parkingLot=new ParkingLot(5);
        car1.park(parkingLot);
        Parkable car2=new Car();
        car2.park(parkingLot);

        System.out.println(parkingLot.isFull());

        Parkable car3=new Car();
        car3.park(parkingLot);




        Parkable J1=new Jeep();
        if (J1.park(parkingLot))
            J1.unpark(parkingLot);




     //   parkingLot.unpark();



    }
}
