package JavaProject.Lab.Medium;

import JavaProject.Lab.Hard.ATM;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Student student1=new Student();
//        System.out.println(student1.getAge());
//        System.out.println(student1.getName());
//        student1.dePosit(100000);
//        System.out.println(student1.showAmount());
//        ATM customer1=new ATM();
//        customer1.show();
//        customer1.withDraw(10000);
//        customer1.deposit(100000);
//        customer1.show();
//        customer1.withDraw(1000);
//        customer1.show();

        ATM customer1=new ATM();
        Scanner input=new Scanner(System.in);
        int choice;
        do{
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    customer1.show();
                    break;
                case 2:
                    System.out.println("Please Enter amount to deposit:");
                    double depositAmount=input.nextDouble();
                    customer1.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount=input.nextDouble();
                    customer1.withDraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid Input!!!");

            }
        }
        while (choice!=4);
        input.close();

    }
}
