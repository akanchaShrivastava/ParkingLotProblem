public class Main {
    public static void main(String[] args) {

        Parkable car1=new Car();
        ParkingLot parkingLot=new ParkingLot(2);
        car1.park(parkingLot);
        Parkable c2=new Car();
        c2.park(parkingLot);

        System.out.println(parkingLot.isFull());

        Parkable c3=new Car();
        c3.park(parkingLot);




        Parkable J1=new Jeep();
        if (J1.park(parkingLot))
            J1.unpark(parkingLot);




     //   parkingLot.unpark();



    }
}
