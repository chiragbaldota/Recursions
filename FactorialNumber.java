public class FactorialNumber {

    public static int factorialNumber(int n){
        if(n == 0)
        {
            return 1;
        }

        int fnm1 = factorialNumber(n-1);
        int fn = n * factorialNumber(n-1);
        return fn;

    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(factorialNumber(n));;
    }
}
