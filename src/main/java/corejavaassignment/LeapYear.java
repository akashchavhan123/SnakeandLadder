package corejavaassignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Four Digit Year : ");
        String no = input.nextLine();
        int year = Integer.parseInt(no);


        if (no.length() != 4) {
            System.out.println(no + " Please Enter Four valid Digit Year");

        } else if ((year % 400) == 0) {
            System.out.println(year + " It is Leap Year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " It is Leap Year");
        } else {

            System.out.println(year + " It is Not a Leap Year");
        }


    }
}
