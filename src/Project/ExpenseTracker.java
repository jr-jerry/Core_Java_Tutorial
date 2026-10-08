package Project;

import java.util.Scanner;

public class ExpenseTracker {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("--Expense Tracker--");
        System.out.println("Enter principle amount ");
        int amount=sc.nextInt();
        do{
            System.out.println("1:Add money");
            System.out.println("2:Withdraw money");
            System.out.println("3:Check Balance");
            System.out.println("4:Exit");

            System.out.println("Enter your choice : ");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("  Add money section ");
                System.out.println("Enter amount to add ");
                int money=sc.nextInt();
                amount=amount+money;
                System.out.println("after  added   : "+amount);
            }else if(choice==2){
                System.out.println("  Withdraw money section ");
                System.out.println("Enter amount to withdraw ");
                int money=sc.nextInt();
                amount=amount-money;
                System.out.println("after  withdraw   : "+amount);
            }else if(choice==3){
                System.out.println("  Check money section ");
                System.out.println("Your balance is "+amount);
            }
            else if (choice==4)
                break;
            else{
                System.out.println("Invalid choice");
            }
        }while(true);
        System.out.println("--Thank you--");
    }
}
