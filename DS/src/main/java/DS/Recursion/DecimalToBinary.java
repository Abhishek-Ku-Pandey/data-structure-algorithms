package DS.Recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        var rec = decimalToBinary.DecimalToBinary(10);
        System.out.println(rec);
    }

    public int DecimalToBinary(int n) {
        if (n ==1) {
            return 1;
        }
        if (n==0) {
            return 0;
        }

        return n%2 + 10*DecimalToBinary(n/2);
    }
}
