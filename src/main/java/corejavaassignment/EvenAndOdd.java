package corejavaassignment;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class EvenAndOdd {
    public static void main(String[] args) {


        Scanner Sc = new Scanner(System.in);

        System.out.println("enter no ");
        int no = Sc.nextInt();
        if (no%2==0){
            System.out.println("no is Even");
        }
        else
            System.out.println("no is ODD");


    }
}