
package sheet_3;

import java.util.Scanner;

public class Sheet_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number : ");
        int num = input.nextInt();
        System.out.println("sum of Digits = "+sumDigit(num));
    }
    public static int sumDigit(int n){
        // Base case
        if(n == 0) return 0;
       return n%10 + sumDigit(n/10);
        
    }
}
