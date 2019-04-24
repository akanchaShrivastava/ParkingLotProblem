public class ParkingLot {
    private int capacity;
    private int NumberOfCars = 0;


    public ParkingLot(int i) {
        this.capacity = i;

    }

    public void add() {
        if (isFull()) {
            System.out.println("Parking lot is full");

        } else {
            NumberOfCars++;
            System.out.println("Parking lot is not full");
            System.out.println(NumberOfCars);

        }


    }

    public Boolean isFull() {
        if (capacity == NumberOfCars) {
            return true;
        } else
            return false;


    }

  /*  public void unpark() {
        System.out.println("Car is unparking");
        NumberOfCars--;
        System.out.println(NumberOfCars);


    }
    */



}
