package Interface;

public class mountainPeak implements Bicyle1{


    private int cadence;
    private int speed;
    private int gear;

    public void changeGear(int gearValue){
        gear = gearValue;
    }
    public void changeSpeed(int incrementSpeed){
        speed = speed + incrementSpeed;
    }
    public void applyBreak(int decrementSpeed){
        speed = speed - decrementSpeed;
    }
    public void changeCadence(int cadence){
        cadence = speed;
    }
    
    public void printStatement(){
        System.out.println("cadence: " + cadence + "\ngear: " + gear + "\nspeed " + speed);
    }
}
