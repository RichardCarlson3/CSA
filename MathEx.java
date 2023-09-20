public class MathEx {
    public static int Swap(int z){
        int result = z%10*10+z%100/10+z/100*100;
        return result;
    }
}
