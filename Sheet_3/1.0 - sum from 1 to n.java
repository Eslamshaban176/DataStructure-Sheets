
package sheet_3;

import java.util.Scanner;

public class Sheet_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a number : ");
        int num = input.nextInt();
        System.out.println("Sum is = "+sumRec(num));
    }
    public static int sumRec(int n){
        // Base case
        if(n == 0) return 0;
        return n + sumRec(n-1);
    }
}
