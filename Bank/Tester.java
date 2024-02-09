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
        double sum = 0;
        PiggyBank []piggyBank = new PiggyBank[nP];
        for(int i = 0; i < nP; i++){
            System.out.print("Enter size and number of deposit : ");
            int totalCount = 0;
            int oldTotalCount = 0;
            int size = kb.nextInt();
            int numDeposit = kb.nextInt();
            piggyBank[i] = new PiggyBank(size);
            for(int j = 0; j < numDeposit; j++){
                int type = kb.nextInt();
                int amount = kb.nextInt();
                totalCount += amount;
                if(type == 1){
                    if(totalCount <= size) {
                        piggyBank[i].addOne(amount * 1);
                    }else if(totalCount > size){
                        oldTotalCount = totalCount - amount;
                        amount = size - (totalCount - amount);
                        totalCount = oldTotalCount + amount;
                        piggyBank[i].addOne(amount * 1);
                    }
                }else if(type == 5){
                    if(totalCount <= size) {
                        piggyBank[i].addFive(amount * 5);
                    }else if(totalCount > size){
                        oldTotalCount = totalCount - amount;
                        amount = size - (totalCount - amount);
                        totalCount = oldTotalCount + amount;
                        piggyBank[i].addFive(amount * 5);
                    }
                }else if(type == 10){
                    if(totalCount <= size) {
                        piggyBank[i].addTen(amount * 10);
                    }else if(totalCount > size){
                        oldTotalCount = totalCount - amount;
                        amount = size - (totalCount - amount);
                        totalCount = oldTotalCount + amount;
                        piggyBank[i].addTen(amount * 10);
                    }
                }else{
                    System.out.println("Error Dude");
                }
            }
            sum = piggyBank[i].getMeasure();
            System.out.println("Total : " + sum);
        }
    }
}
