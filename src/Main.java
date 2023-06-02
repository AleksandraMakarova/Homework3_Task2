public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myBmi = service.calculate(50, 1.58);
        System.out.println(myBmi);
    }
}
