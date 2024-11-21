public class dc7{
    private int balance;
    private String[] transactions = new String[3];
    //private int trans_count = 0;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    
    public void deposit(int money){
        this.balance += money;
        String temp0 = transactions[0];
        String temp1 = transactions[1];
        transactions[2] = temp1;
        transactions[1] = temp0;
        transactions[0] = "+"+Integer.toString(money);
    }
    public void withdraw(int money){
        if (money > 500){
            System.out.println("Exceeded withdrawal limit!");
        } else if ( money > this.balance){
            System.out.println("Insufficient funds");
        } else {
            this.balance -= money;
            String temp0 = transactions[0];
            String temp1 = transactions[1];
            transactions[2] = temp1;
            transactions[1] = temp0;
            transactions[0] = "-"+Integer.toString(money);
        }
    }
    public void display_balance(){
        System.out.println("Account balance: "+this.balance);
    }

    public void display_transactions(){
        for ( String transaction : transactions){
            System.out.println(transaction);
        }
    }


    public static void main(String[] args) {
        dc7 bankacc = new dc7();
        bankacc.setBalance(0);
        bankacc.deposit(500);
        bankacc.display_transactions();
        bankacc.display_balance();
        bankacc.deposit(200);
        bankacc.display_balance();
        bankacc.withdraw(300);
        bankacc.display_transactions();
        bankacc.display_balance();
        bankacc.withdraw(600);
        bankacc.display_balance();
        bankacc.withdraw(450);
        bankacc.display_balance();
        bankacc.display_transactions();
    }
}