public class FakultaetWhile {
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
