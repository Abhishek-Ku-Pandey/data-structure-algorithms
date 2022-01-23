package DS.Recursion;


class SumOfDigits {
    public static void main(String[] args) {
        SumOfDigits sumOfDigits = new SumOfDigits();
        var rec = sumOfDigits.sumOfDigits(-132);
        System.out.println(rec);
    }

    public int sumOfDigits(int n) {

        int digit =0;

        if (n>-9 && n<10) {
           return n;

        }
        digit = n%10;
        n = n/10;
        return digit + sumOfDigits(n);
    }


}
