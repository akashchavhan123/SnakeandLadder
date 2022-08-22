package corejavaassignment;

public class LargestAmongThree {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("first no "+" "+a);
        System.out.println("second no "+" "+b);
        System.out.println("Third no "+" "+c);
        if (a>b && a>c){
            System.out.println("first no is Maximum no");
        } else if (b>a && b>c) {
            System.out.println("second no is Maximum no");
        }
        else {
            System.out.println("Third no is Maximum no");
        }

    }
}