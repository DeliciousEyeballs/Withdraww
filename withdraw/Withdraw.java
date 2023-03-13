
package withdraw;

import java.util.Scanner;



public class Withdraw {
    static void withdrawMethod(){
        Scanner scan = new Scanner (System.in);
        System.out.print("Withdrawal Ammount:");
        String n1 = scan.nextLine();
        int n = Integer.parseInt(n1);
        
        int balance = 5000;
        //pwede tanggalin tong int balance kung pagsasamasamahin na yung code
        
        if(balance < 5000){
            System.out.println("Your balance must be at least 5000 to be able to withdraw");
         }
        else if(n > 10000){
            System.out.println("Withdrawal ammout cannot go over 10,000");
        }
        else{
           
            int newBalance = balance - n;
            //need solution para ma change yung balance into new balance
            //tapos balik sa balance check? or balik sa transactions
            
            System.out.println("You have succesfully withdrawn"+n1);
        }
    }

   
    public static void main(String[] args) {
        withdrawMethod();
      
        
        
    }
    
}
