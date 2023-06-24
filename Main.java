import Mypackage.*; // Package imported.
import java.util.*; // All the classes and interfaces has been imported.
import java.io.File; // File class imported.
import java.io.IOException; // IOException imported.
public class Main { // A class created.
    public static void main(String[] args) { //Main method created.
        Scanner sc=new Scanner(System.in); // Objected of "Scanner" class created.
        ArrayList ar = new ArrayList(); // Object of "ArrayList" created.
        Address ad=new Address(); // Object of "Address" class created.
        Account ac = new Account(); // Object of "Account" class created.
        AcountHolder ah=new AcountHolder(); // Object of "AccountHolder" class created.
        Account_Details ac_d=new Account_Details(); // Object of "Account_Details" class created.
        Person pe= new Person( new Bank("Sonali Bank")); // Object of "Person" class created.
        System.out.println("Enter the account holder name:"); // Output has been shown.
        ah.AccountHolderName=sc.nextLine(); // Value of "AccountHolderName" variable will be taken.
        System.out.println("Enter the account holder email:"); // Output has been shown.
        ah.AccountHolderEmail=sc.nextLine(); // Value of "AccountHOlderEmail" variable will be taken.
        System.out.println("Ente the account holder phonenumber:"); // Output has been shown.
        ah.AccountHolderPhonenumber=sc.nextLine(); // Value of "AccountHolderPhonrnumber" variable will be taken.
        System.out.println("Enter the account holder address:"); // Output has been shown.
        System.out.println("Divison :"); // Output has been shown.
        ad.division=sc.nextLine(); // Value of "division" variable will be taken.
        System.out.println("District :"); // Output has been shown.
        ad.district=sc.nextLine(); // Value of "district" variable will be taken.
        System.out.println("Post-Office :"); // Output has been shown.
        ad.postOffice=sc.nextLine(); // Value of "postOffice" variable will be taken.
        System.out.println("Village :"); // Output has been shown.
        ad.village=sc.nextLine(); // Value of "village" variable will be taken.
        System.out.println("Street number :"); // Output has been shown.
        ad.streetNo=sc.nextInt(); // Value of "streetNo" variable will be taken.
        System.out.println("House number :"); // Output has been shown.
        ad.houseNo=sc.nextInt(); // Value of "houseNo" variable will be taken.
        sc.nextLine();
        System.out.println("Enter account number:"); // Output has been shown.
        ac.setAccount_number(sc.nextLine()); // Value of "Account_number" variable will be taken.
        System.out.println("Would you like to Deposit Money?"); // Output has been shown.
        ac.permission=sc.nextBoolean(); // Value of "permission" variable will be taken.
        ac.Method(); // Method of "Account" class has been called.
        System.out.println("Would you like to Withdraw Money?"); // Output has been shown.
        ac.permission=sc.nextBoolean(); // Value of "permission" variable will be taken.
        ac.Method_1(); // Method of "Account" class has been called.
        ac_d.Show_details(); // Method of "Account_Details" class has been called.
        System.out.println("Bank name is: " +pe.bank.Bank_Name); // Output has been shown.
        try { // A File has been created and "try catch" has been applide alongside "conditional loop" from lone 44 to 54
            File myObj = new File(ah.AccountHolderName);
            if (myObj.createNewFile()) {
                System.out.println("An Account has been created for: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Account holder name:" + ah.AccountHolderName); // Output has been shown.
        System.out.println("Account holder email:" + ah.AccountHolderEmail); // Output has been shown.
        System.out.println("Account holder phone number:" + ah.AccountHolderPhonenumber); // Output has been shown.
        ad.Display(); // Method of "Address" class has been called.
        System.out.println(ad.division+","+ad.district+","+ad.postOffice+","+ad.village+","+ad.streetNo+","+ad.houseNo); // Output has been shown.
        System.out.println("Account number: " + ac.getAccount_number()); // Output has been shown.
        ac.DepositMoney(); // Method of "Account" class has been called.
        ac.WithdrawMoney(); // Method of "Account" class has been called.
        ar.add(ah.AccountHolderName); // Value of "AccountHolderName" has been added to array list
        ar.add(ah.AccountHolderEmail); // Value of "AccountHolderEmail" has been added to array list
        ar.add(ah.AccountHolderPhonenumber); // Value of "AccountHolderPhonenuber" has been added to array list
        Collections.sort(ar); // the values of array list has been sorted in ascending order.
        System.out.println("After sorting : " + ar); // Output has been shown.
    }
}