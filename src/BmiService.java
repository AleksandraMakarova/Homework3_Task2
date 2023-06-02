public class BmiService {
    public int calculate(int weightKilograms, double heightMeters) {
        int bmi;
        double heightMetersDouble = Math.pow(heightMeters, 2);
        bmi = (int) (weightKilograms / heightMetersDouble);
        return bmi;
    }
}
