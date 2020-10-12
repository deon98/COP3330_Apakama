import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static boolean moreInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input? Y or N");
        String answer = scanner.nextLine();
        if (answer.equals("Y"))
            return true;
        return false;
    }

    public static double getUserHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in inches");
        double height = scanner.nextDouble();
        while (height <= 0) {
            System.out.println("Invalid input: Enter height in inches");
            height = scanner.nextDouble();
        }
        scanner.nextLine();
        return height;
    }

    public static double getUserWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds");
        double weight = scanner.nextDouble();
        while (weight <= 0) {
            System.out.println("Invalid input: Enter weight in pounds");
            weight = scanner.nextDouble();
        }
        scanner.nextLine();
        return weight;
    }

    public static void displayBmiInfo(BodyMassIndex bmi) {
        System.out.println("BMI score: " + bmi.score());
        System.out.println("BMI category: " + bmi.category());
    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double sum = 0;
        for (int i = 0; i < bmiData.size(); i++)
            sum += bmiData.get(i).score();
        double average = sum / bmiData.size();
        System.out.println("Average BMI score: " + average);
    }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }
}
