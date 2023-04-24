public class Main {
    public static void main(String[] args) {
        BMIindex service = new BMIindex();
        double weight =98;
        double height =1.87;
        int BMI = service.calculate(weight,height);
        System.out.println("BMI index=" + BMI);
    }
}