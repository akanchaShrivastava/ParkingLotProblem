public class Car implements Parkable {


    public Car() {
    }


        @Override
        public void park (ParkingLot parkingLot){
        System.out.println("Car parking");
            parkingLot.add();


        }

        @Override
        public void unpark (ParkingLot parkingLot) {
        System.out.println("Car Unparking");
parkingLot.unpark();

        }
    }

