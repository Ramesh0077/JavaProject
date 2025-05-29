package JavaProject.Lab.Hard;

public class ATM {
    private double balance=10;

    //show balance;
    //deposit amount;
    //withDraw money;

    public void show(){
        System.out.println("Available Balance:"+this.balance);
    }

    public void withDraw(double money){
        if (money >0 && money<=this.balance){
            this.balance-=money;
            System.out.println("Withdrawn AMount: "+money);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit(double money){
        if (money>0){
            this.balance+=money;
            System.out.println("Deposited Amount: "+money);
        }
        else {
            System.out.println("Please Enter valid Amount");
        }
    }


}
