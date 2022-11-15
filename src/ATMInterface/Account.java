package ATMInterface;

import java.text.DecimalFormat;
import java.util.*;

    public class Account {

        Scanner input=new Scanner(System.in);
        DecimalFormat moneyFormat=new DecimalFormat(" '$'###,##0.00");

        private int customerNumber;
        private int pinNumber;
        private double currentBalance=0;
        private double savingBalance=0;

        public int setCustomerNumber(int customerNumber){
            this.customerNumber=customerNumber;
            return customerNumber;
        }
        public int getCustomerNumber(){
            return customerNumber;
        }
        public int setPinNumber(int pinNumber){
            this.pinNumber=pinNumber;
            return pinNumber;
        }
        public int getPinNumber(){
            return pinNumber;
        }
        public double getCurrentBalance(){
            return currentBalance;
        }
        public double getSavingBalance(){
            return savingBalance;
        }
        public double getCurrentWithdraw(double amount){
            currentBalance=(currentBalance-amount);
            return currentBalance;
        }
        public void calcSavingWithdraw(double amount){
            savingBalance =(savingBalance -amount);
        }
        public void calcCurrentDeposit(double amount){
            currentBalance =(currentBalance+amount);
        }

        public double calcSavingDeposit(double amount){
            savingBalance =(savingBalance+amount);
            return savingBalance;
        }

        public void getCurrentWithdrawInput(){
            System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
            System.out.println("Amount you want to withdraw from Current Account");
            double amount=input.nextInt();

            if((currentBalance-amount)>=0){
                getCurrentWithdraw(amount);
                System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
            }else{
                System.out.println("Insufficient Balance"+"\n");
            }
        }
        public void getCurrentDepositInput(){
            System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
            System.out.println("Amount you want to Deposit Current Account");
            double amount=input.nextInt();

            if((currentBalance+amount)>=0){
                calcCurrentDeposit(amount);
                System.out.println("Current Account Balance: "+moneyFormat.format(currentBalance));
            }else{
                System.out.println("Balance cannot be Negative"+"\n");
            }
        }
        public void getSavingWithdrawInput(){
            System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
            System.out.println("Amount you want to withdraw from Saving Account");
            double amount=input.nextInt();

            if((savingBalance-amount)>=0){
                calcSavingWithdraw(amount);
                System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
            }else{
                System.out.println("Insufficient Balance"+"\n");
            }
        }
        public void getSavingDepositInput(){
            System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
            System.out.println("Amount you want to Deposit to Saving Account");
            double amount=input.nextInt();

            if((savingBalance-amount)>=0){
                calcSavingWithdraw(amount);
                System.out.println("Saving Account Balance: "+moneyFormat.format(savingBalance));
            }else{
                System.out.println("Insufficient Balance"+"\n");
            }
        }


    }

