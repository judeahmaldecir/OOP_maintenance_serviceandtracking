package maintenance_serviceandtracking;
import java.util.*;
public class Maintenance_serviceandtracking {
    //hehe hello po, as of now eto palang ung naiimagine ko po sa part ko, and I think need ng database sa part ko po since
    // maintenance & service tracking.(nangangapa palang po ako huhu), I am open po for suggestions here sa part kow.
    
    //gagawin ko muna po here is guide na sa gagawin ko sa system :3
    
    //1. login page for the Staff 
    // requirements : Staff ID, Name, and password(4 digit)
    
    //2. after login- May MENU of cars
    // ----------<<SELECT A CAR>>----------
    // NO OF SELECTION | CAR MODEL | PLATE NUMBER
    // 1 | Toyota Vios | NCT 1270
    // 2 | Nissan GT-R | TRP 4567
    
    //3. after selection nung car eto na po ung checking ng STATUS Of the car (maintenance & service tracking)
    // ----------<<status>----------
    //ex. sinelect ni staff ung 1, lalabas ung another menu,
    // 1 | Available
    // 2 | Reserved
    // 3 | Rented
    // 4 | Under Maintenance
    // otherssss:
    // 5 | REPORTS of the car 
    
    
    // 1 | Available
    // - status ready for rent siya
    
    // 2 | Reserved
    // show the details such as - Date of reservation, and who reserved it
    
    // 3 | Rented (currently na ginagamit)
    // show details date since when it rented, until when and also who rented it
    
    // 4 | Under Maintenance
    // show details for Sevice Date (kung kelan last siya na ayos or na checked), 
    //Description kung ano inayos sa sasakyan
    // Cost of service
    //next service date (pwede may countdown ata dito HWAHAS),
    // if overdue na ung maintenace, dapat may nag aalert.
    
    // 5 | Reports of the car
    // dito papasok ung Maintenace report, Cost Tracking
    
    public static void main(String[] args) {
        // loging in sa staff muna here po sa main :3
        Scanner stah = new Scanner(System.in);
        
        int staffId;
        String staffFullName, passWord;
        
        System.out.println("----------<<WELCOME>>----------");
        
        System.out.print("Enter your Full Name: ");
        staffFullName = stah.nextLine();
        System.out.print("Enter your Staff ID: ");
        staffId = stah.nextInt();
        stah.nextLine();
        System.out.print("Enter your Password: ");
        passWord = stah.nextLine();
        
        if (staffFullName.equals("judeah") && staffId == 12345 && passWord.equals("1267")){
            System.out.println("Login successful! Welcome, " + staffFullName + "!!!");
            // balak ko here ilagay ung class for menu of cars
        }
        
        else {
            System.out.println("Login Failed. Please check your credentials :<");
        }
    }
}
