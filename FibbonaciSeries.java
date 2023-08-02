public class FibbonaciSeries {
    public static int fibonacciSeries(int n){
        if(n == 0 || n == 1)
        {
            return n;
        }

            int fnm1 = fibonacciSeries(n-1);
            int fnm2 = fibonacciSeries(n-2);
            int fn = fnm1 + fnm2;
            return fn;
    }

    public static void main(String[] args) {
           int n = 25;
        System.out.println(fibonacciSeries(n));
    }
}
