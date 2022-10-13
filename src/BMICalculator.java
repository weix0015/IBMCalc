public class BMICalculator {

    private double height;
    private double weight;

    public double bmiIndex (){
        return weight / (height * height) * 703;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
