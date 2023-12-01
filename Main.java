public class Main {
    public static void main(String[] args) {
        System.out.println(numInRange(2,7,6));
    }
    public static int numInRange(int min, int max, int valore) {
        if (valore < max && valore > min) {
            return valore;
        } else {
            throw new ArithmeticException();
        }
    }
}
