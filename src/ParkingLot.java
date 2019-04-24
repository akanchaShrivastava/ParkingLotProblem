public class ParkingLot {
    private int capacity;
    private int NumberOfVehicles = 0;


    public ParkingLot(int i) {
        this.capacity = i;

    }

    public boolean add() {
        if (isFull()) {
            System.out.println("Parking lot is full");
            return false;

        } else {
            NumberOfVehicles++;
            System.out.println("Parking lot is not full");
            System.out.println(NumberOfVehicles);

            return true;
        }


    }

    public Boolean isFull() {
        if (capacity == NumberOfVehicles) {
            return true;
        } else
            return false;


    }

   public void unpark() {
        System.out.println("Car is unparking");
        NumberOfVehicles--;
        System.out.println(NumberOfVehicles);


    }




}
