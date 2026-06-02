interface BankAccount{
    void deposit(double amt);
    void withdraw(double amt);
}

class SavingsAccount implements BankAccount{

    double balance = 1000;

    public void deposit(double amt){
        balance += amt;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdraw(double amt){
        
            
            balance -= amt;
            System.out.println("Balance after withdrawal: " + balance);
       try{
            if(amt > balance)
                throw new ArithmeticException("Insufficient balance");

        }
        catch(ArithmeticException e){
            System.out.println("insufficient balance");
        }
    }
}

class Main1{
    public static void main(String args[]){
        SavingsAccount s = new SavingsAccount();
        s.deposit(9999);
        s.withdraw(2000);   // triggers exception
    }
}