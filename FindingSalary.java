
package findingsalary;

import java.util.Scanner;

public class FindingSalary {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.print("please give your hourly wage:");
        double hourlywage=scanner.nextDouble();
        System.out.print("please give your weekly working hours:");
        double wwh=scanner.nextDouble();
        System.out.print("please give your overtime hours:");
        
        System.out.println("hourly wage:"+hourlywage);
        System.out.println("weekly working hours:"+wwh);
        System.out.println("overtime hours:"+overthours);
        
        double grossalary=(wwh+overthours)*hourlywage;
        System.out.println("grossalary:"+grossalary);
        
        double tax=grossalary*(0.05);
        System.out.println("tax:"+tax);
        double insurancedeductions=grossalary*(0.15);      
        System.out.println("insurancedeductions:"+insurancedeductions);

        double netsalary=(grossalary)-(tax+insurancedeductions);   
        System.out.println("netsalary:"+netsalary);
        
        if(netsalary!=(int)netsalary){
        System.out.println("netsalary:"+(int)netsalary);
        }else{
           System.out.print("");
        }
    }
   
}
