public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 59;
        double height_m = 1.69;
        int index = service.calculate(weight_kg, height_m);
        System.out.println("bmi-индекс " + index);
    }
}

