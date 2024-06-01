package Interface;

public class Main {
    public static void main(String[] args) {
        mountainPeak chPeak = new mountainPeak();
        chPeak.changeCadence(2);
        chPeak.changeGear(2);
        chPeak.changeSpeed(10);
        chPeak.printStatement();
        chPeak.applyBreak(5);
        chPeak.printStatement();
    }
    
}
