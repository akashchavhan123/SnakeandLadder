package corejavaassignment;

public class PowerofTwo {
    public static void main(String[] args) {


        int no = Integer.parseInt(args[0]);

        System.out.println("No for Power : "+no);


        if( no < 0 || no > 31) {
            System.out.println("The Power Number must be Greater Than Zero and Less Than 31");
        } else {

            for(int i=1; i<=no; i++) {

                int powerOfNo = (int) Math.pow(2,i);
                System.out.println(powerOfNo);
            }
        }


    }
}
