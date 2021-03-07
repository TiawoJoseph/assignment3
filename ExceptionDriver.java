import java.util.*;


public class ExceptionDriver {

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

try {
    System.out.println("Please enter in a logon id to see if it exists. When your done type 'DONE' ");
    String exp = scan.nextLine();

    while (!exp.equals("DONE") && exp.length() <= 20) {
        System.out.println("The previous one is good please enter in another logon id");
        exp = scan.nextLine();

    }

}

catch(IndexOutOfBoundsException problem  ){
    System.out.println("The logon id you entered does not exsist you entered more than 20 characters");

}


}


}
