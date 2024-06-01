public class Bicyle {

    private int cadence;
    private int speed;
    private int gear;

    public void changeGear(int gearValue){
         gear = gearValue;
    }

    public void changeSpeed(int increment){
        speed = speed + increment;
    }
    public void cadence(int cadenceValue){
        cadence = cadenceValue;
    }
    public void applyBreak(int decrement){
        speed = speed-decrement;
    }

    public void printStatement(){
        System.out.println("cadence: " + cadence + "\ngear: " + gear + "\nspeed " + speed);
    }

}