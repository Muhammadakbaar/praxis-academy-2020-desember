package ClassesAndObject;
public class BicycleMain {
    public static void main(String[] args) {
        MountainBike myBike = new MountainBike(0, 30, 0, 8);
                MountainBike myBike2 = new MountainBike(0, 40, 5, 20);
                System.out.println("Objek sepeda 1\n");
                System.out.println("Id = "+myBike.getID());
                System.out.println("Cadence = "+myBike.getCadence());
                System.out.println("Gear = "+myBike.getGear());
                System.out.println("Speed = "+myBike.getSpeed()+"\n");
                System.out.println("Objek sepeda 2\n");
                System.out.println("Id = "+myBike2.getID());
                System.out.println("Cadence = "+myBike2.getCadence());
                System.out.println("Gear = "+myBike2.getGear());
                System.out.println("Speed = "+myBike2.getSpeed()+"\n");
                System.out.println("Jumlah objek sepeda = "+myBike.getNumberOfBicycles());
    }
}