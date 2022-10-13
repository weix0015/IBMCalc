public class Main {

    public static void main(String[] args) {

        BMICalculator bmiCalculator = new BMICalculator();

        bmiCalculator.setHeight(180);
        bmiCalculator.setWeight(80);

        System.out.println(bmiCalculator.bmiIndex());
    }
}
