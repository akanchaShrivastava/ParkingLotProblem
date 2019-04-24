public class Car implements Parkable {


    public Car() {
    }


        @Override
        public boolean park (ParkingLot parkingLot){
        System.out.println("Car parking");
           return parkingLot.add();


        }

        @Override
        public void unpark (ParkingLot parkingLot) {
        System.out.println("Car Unparking");
        parkingLot.unpark();

        }
    }

