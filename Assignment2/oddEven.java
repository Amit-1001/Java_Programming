

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter number:");
        a = in.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

    }
}
