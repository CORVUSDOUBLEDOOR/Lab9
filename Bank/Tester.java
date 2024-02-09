package Bank;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of BankAccount : ");
        int nB = kb.nextInt();
        BankAccount[] bankAccounts = new BankAccount[nB];
        for(int i = 0; i < nB ; i++){
            System.out.print("Account ID : ");
            String accNo = kb.next();
            System.out.print("Balace : ");
            double balance = kb.nextDouble();
            bankAccounts[i] = new BankAccount(accNo, balance);
        }
        for(int i = 0; i < nB; i++){
            System.out.print("Acc no : " + bankAccounts[i].getAccNo() + " ");
            System.out.printf("Balance : " + bankAccounts[i].getMeasure());
            System.out.println();
        }
        System.out.print("Enter the number of PiggyBank : ");
        int nP = kb.nextInt();
        PiggyBank [] piggyBank = new PiggyBank[nP];
        for(int i = 0; i < nP; i++){
            System.out.print("Enter size and number of deposit : ");
            int size = kb.nextInt();
            int numDeposit = kb.nextInt();
            piggyBank[i] = new PiggyBank(size);
            for(int j = 0; j < numDeposit; j++){
                int type = kb.nextInt();
                int amount = kb.nextInt();
                if(type == 1){
                    piggyBank[i].addOne(amount);
                }else if(type == 5){
                    piggyBank[i].addFive(amount);
                }else if(type == 10){
                    piggyBank[i].addTen(amount);
                }else{
                    System.out.println("Error Dude");
                }
            }
            System.out.println("Total : " + piggyBank[i].getMeasure());
        }
    }
}
