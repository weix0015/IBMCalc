public class BMICalculate {

    public static void main(String[] args) {
        // declare variables


        bmiCalculator();
    }

    public static void bmiCalculator(){
        double height;
        double weight;
        double bmi;
        String word = "hej";

        boolean running = true;
        // compute BMI
        height = 70.0;
        weight = 195.0;
        bmi = weight / (height * height) * 703;

        // print results
        System.out.println("Previous BMI:");
        System.out.println(bmi);

        // recompute BMI
        weight = 180;
        bmi = weight / (height * height) * 703;

        // report new results
        System.out.println("Current BMI:");
        System.out.println(bmi);
    }



}
