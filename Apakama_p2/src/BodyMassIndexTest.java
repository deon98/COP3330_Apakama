public class BodyMassIndexTest {

    public static boolean testUnderweight() {
        BodyMassIndex bmi = new BodyMassIndex(65, 90);
        bmi.score();
        if (bmi.category().equals("Underweight"))
            return true;
        return false;
    }

    public static boolean testNormalWeight() {
        BodyMassIndex bmi = new BodyMassIndex(65, 120);
        bmi.score();
        if (bmi.category().equals("Normal weight"))
            return true;
        return false;
    }

    public static boolean testOverweight() {
        BodyMassIndex bmi = new BodyMassIndex(65, 160);
        bmi.score();
        if (bmi.category().equals("Overweight"))
            return true;
        return false;
    }

    public static boolean testObesity() {
        BodyMassIndex bmi = new BodyMassIndex(65, 200);
        bmi.score();
        if (bmi.category().equals("Obesity"))
            return true;
        return false;
    }

    public static boolean testScore() {
        BodyMassIndex bmi = new BodyMassIndex(65, 200);
        if (bmi.score() == 33.28)
            return true;
        return false;
    }

    public static boolean testCategory() {
        BodyMassIndex bmi = new BodyMassIndex(65, 200);
        bmi.score();
        if (bmi.category().equals("Obesity"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean allPass = true;
        if (testUnderweight())
            System.out.println("Test underweight: passed");
        else {
            System.out.println("Test underweight: failed");
            allPass = false;
        }
        if (testNormalWeight())
            System.out.println("Test normal weight: passed");
        else {
            System.out.println("Test normal weight: failed");
            allPass = false;
        }
        if (testOverweight())
            System.out.println("Test overweight: passed");
        else {
            System.out.println("Test overweight: failed");
            allPass = false;
        }
        if (testObesity())
            System.out.println("Test obesity: passed");
        else {
            System.out.println("Test obesity: failed");
            allPass = false;
        }
        if (testScore())
        System.out.println("Test score: passed");
        else {
            System.out.println("Test score: failed");
            allPass = false;
        }
        if (testCategory())
        System.out.println("Test category: passed");
        else {
            System.out.println("Test category: failed");
            allPass = false;
        }
        if (allPass)
            System.out.println("All tests passed");
        else
            System.out.println("One or more tests failed");
    }
}
