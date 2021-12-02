public class FakultaetRekursion {
    public static void main(String[] args) {
        System.out.println(fakultaet(3));
    }
    public static int fakultaet(int value) {
        if (value <= 1) {
            return 1;
        } else {
            return fakultaet(value - 1) * value;
        }
    }
}