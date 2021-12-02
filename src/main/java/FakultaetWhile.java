public class FakultaetWhile {
    public static void main(String[] args) {
        System.out.println(fakultaet(4));
    }
    public static int fakultaet(int value){
        int result = 1;
        int i = 1;
        while (i<=value){
            result = result * i;
            ++i;
        }
        return result;
    }
}
