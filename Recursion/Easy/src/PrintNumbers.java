import java.util.Scanner;

public class PrintNumbers {


    public static void main(String[] args) {
    //
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        PrintNum(n);


  }

  public static void PrintNum(int n){
        if(n==0){

            return;
        }

        PrintNum(n-1);
        System.out.println(n);
  }
}
