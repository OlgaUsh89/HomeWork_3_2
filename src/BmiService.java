public class BmiService {

    public int calculate(int weight_kg, double height_m) {
        double index;

        if (weight_kg > 0) {
            index = weight_kg / (height_m * height_m);
        } else {
            index = 0;
        }

        return (int) index;
    }
}
