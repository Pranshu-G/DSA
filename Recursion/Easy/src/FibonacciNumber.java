


public class FibonacciNumber {


    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return Fibonacci(n-2) + Fibonacci(n-1);
        }
    }
  public static void main(String[] args) {
    //
    System.out.println(Fibonacci(1));
  }
}
