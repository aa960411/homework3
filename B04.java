import java.util.*;
  import java.io.*;
   class B04{
            void input(){
           Scanner s = new Scanner(System.in);
             System.out.print("input your income : ");
             int income = s.nextInt(); 
             int tax;
             if (income < 10000000){
             tax = income * 0.095;
             System.out.println(tax + "won");
             }
             else if ( income <  40000000 && income >= 10000000){
             tax = income * 0.19;
             System.out.println(tax + "won");
             }
             else if ( income <  80000000 && income >= 40000000){
             tax = income * 0.28;
             System.out.println(tax + "won");
             }
             else if ( income >=  80000000 ){
             tax = income * 0.37;
             System.out.println(tax + "won");
             }
           
           
           
                }

                     public static void main(String [] args) throws IOException{

                         System.out.print("===============================\n");
                                  new B04().input();
                             }
      }
