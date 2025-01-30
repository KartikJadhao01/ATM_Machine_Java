package atmoperations;
import java.util.Scanner;

 class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmcardnumber=73974994;
        int atmpin=6300;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Card Number : ");
        int atmCardNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atmcardnumber==atmCardNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Deposit Amount\n3.Withdraw Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Card Number or pin");
            System.exit(0);
        }


    }
}