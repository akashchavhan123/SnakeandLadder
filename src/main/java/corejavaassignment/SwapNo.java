package corejavaassignment;

public class SwapNo {
    public static void main(String[] args) {


        int first_no = 10;
        int second_no = 15;
        System.out.println("first no is" +" "+first_no);
        System.out.println("second no is"+ " "+ second_no);
        int Temp = second_no;
        second_no = first_no;
        first_no = Temp;
        System.out.println("_______________________After Swaping_____________________");
        System.out.println("first no is" +" "+first_no);
        System.out.println("second no is"+ " "+ second_no);

    }
}