package refactor;

import java.util.Random;

public class RefactorPrg {
    int PartTime = 1;
    int FullTime = 2;
   int EmpratePerHr = 20;
    int NoofWorkingDays = 2;
    int MaxrateinMonth=10;
    int computeEmpWage(){
        int empHrs = 0,totalEmphrs = 0, totalWorkingDays = 0;
        while (totalEmphrs <=MaxrateinMonth && totalWorkingDays < NoofWorkingDays ){

            totalWorkingDays++;
            int empcheck = (int) Math.floor(Math.random()*10) % 3;
            switch ((empcheck)) {
                case 1:
                    empHrs = 4;
                    break;
                case 2:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }
            totalEmphrs = totalEmphrs+empHrs;
            System.out.println("day" + totalWorkingDays + "Emp Hr"+ empHrs);


            }
             int TotalEmpWage = totalEmphrs*EmpratePerHr;
        System.out.println("toatl emp wage" + TotalEmpWage);
        return TotalEmpWage;

    }

    public static void main(String[] args) {
        RefactorPrg a = new RefactorPrg();
        a.computeEmpWage();
    }
    }
