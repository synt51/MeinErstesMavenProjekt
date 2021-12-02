public class Fakultaet {
    public static int fakultaet(int value){
        int result = 1;
        for (int i = 1; i <= value; ++i){
            result = result * i;
        }
        return result;
    }
}
