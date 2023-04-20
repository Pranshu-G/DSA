package BitManipulation;

public class findBitwiseComplement {

    public static int findBitwiseComplement(int num) {
        // Write your code here
        // your code will replace this placeholder return statement
        int numberOfBinaryDigits = (int)(Math.floor(Math.log(num)/Math.log(2)))+1;
        int binaryRep=0;
        int count =0;
        while(num!=0){
            binaryRep = (int)(binaryRep + (num%2)*Math.pow(10,count));
            count++;
            num = Math.floorDiv(num,2);
        }

        int allBitsSet = (int) Math.pow(2, numberOfBinaryDigits) - 1;
        return num ^ allBitsSet;

    }


    public static void main(String[] args) {
        System.out.println(findBitwiseComplement(42));
    }
}
