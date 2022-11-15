package ATMInterface;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;


public class MainMenu extends Account{
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$' ###,##0.00");//disply purpuse

    HashMap<Integer,Integer> data=new HashMap<>();

    public void getLogin() {
        int x = 1;
        do {
            try {
                data.put(11111, 110);
                data.put(11122, 120);
                data.put(11223, 130);
                data.put(13122, 121);
                data.put(15222, 125);
                data.put(16822, 120);
                data.put(18822, 10);
                data.put(112, 10);
                data.put(18822, 120);

                System.out.println("***********Welcome to the CKS ATM**********");
                System.out.println("Enter your customer ID");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter Your PIN number: ");
                setPinNumber(menuInput.nextInt());
            } catch (Exception e) {
                System.out.println(("\n" + "Invalid Character(s), Only Numbers." + "\n"));
                x = 2;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn) {
                getAccountType();
            } else {
                System.out.println("\n" + "Wrong Customer Number or Wrong PIN number" + "\n");
            }
        }
        while (x == 1) ;
    }

    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Press 1 - To Current Account");
        System.out.println("Press 2 -To Saving Account");
        System.out.println("Press 3 -To Exit");

        int selection = menuInput.nextInt();

        switch(selection){
            case 1:
                getCurrent(); break;
            case 2:
                getSaving(); break;
            case 3:
                System.out.println("****Thank you for Visiting****"); break;
            default:
                System.out.println("\n"+"Invalid Choice"+"\n");
                getAccountType();
        }
        System.out.println();
    }

    public void getCurrent() {
        System.out.println("**Current Account: ");
        System.out.println("Press 1- To View Balance");
        System.out.println("Press 2- To Withdraw Funds");
        System.out.println("Press 3- To Deposit Funds");
        System.out.println("Press 4- To Exit");
        System.out.print("Your Choice: ");

        int selection = menuInput.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
                getAccountType();
                break;
            case 2:
                System.out.println("Current Account Balance: " + moneyFormat.format(getCurrentBalance()));
                System.out.print("Amount You want to withdraw from Current Account: ");

                System.out.print("Current Balance: "+getCurrentWithdraw(menuInput.nextInt()));
                getAccountType();
                break;
            case 3:
                getCurrentDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("****Thank you for Visiting****");
                break;
            default:
                System.out.println("\n" + " Invalid Choice " + "\n");
                getCurrent();
        }
       // System.out.println();
    }

    public void getSaving(){
        System.out.println("**Saving Account: ");
        System.out.println("Press 1- To View Balance");
        System.out.println("Press 2- To Withdraw Funds");
        System.out.println("Press 3- To Deposit Funds");
        System.out.println("Press 4- To Exit");
        System.out.print("Your Choice: ");

        int selection = input.nextInt();

        switch (selection) {
            case 1:
                System.out.println("Savings Account Balance: " + moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("****Thank you for Visiting****");
                break;
            default:
                System.out.println("\n" + " Invalid Choice " + "\n");
                getCurrent();
        }
       System.out.println();
    }

}
