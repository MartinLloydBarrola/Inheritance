public class Main {

    public static void main(String[] args) {
        
        Bicyle bike = new Bicyle();
        bike.changeGear(2);
        bike.cadence(2);
        bike.changeSpeed(5);
        bike.printStatement();
        bike.changeSpeed(10);
        bike.printStatement();
        bike.applyBreak(5);
        bike.printStatement();

        System.out.println("-".repeat(30));

        MountainBike sunSpeed = new MountainBike();
        sunSpeed.changeSpeed(10);
        sunSpeed.printStatement();
      
    }
}