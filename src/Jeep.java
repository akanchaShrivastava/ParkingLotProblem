public class Jeep implements Parkable {
    @Override
    public boolean park(ParkingLot parkingLot) {

        System.out.println("Jeep Parking in Progress!");
        return parkingLot.add();


    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        System.out.println("Jeep Unparking");
        parkingLot.unpark();

    }
}
