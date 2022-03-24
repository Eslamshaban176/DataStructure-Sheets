
package sheet_3;

import java.util.Scanner;

public class Sheet_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please ente the base number : ");
        int base = input.nextInt();
        System.out.print("please enter the power : ");
        int num = input.nextInt();
        System.out.println("pow("+base + " , "+num+") = "+powRec(base,num));
    }
    public static int powRec(int B,int n){
        // Base case
        if(n == 0) return 1;
        return B * powRec(B,n-1);
    }
}
