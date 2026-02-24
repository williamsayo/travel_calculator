import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelCalculator travelCalc = new  TravelCalculator();
        System.out.println("Enter distance: ");
        double distance = sc.nextDouble();
        System.out.println("Enter time: ");
        double time = sc.nextDouble();
        double speed = travelCalc.calculateSpeed(distance,time);

        System.out.printf("Your speed is %sm/s",speed);
    }
}
