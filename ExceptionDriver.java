import java.util.*;


public class ExceptionDriver {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

//    OutOfRangeException problem = new OutOfRangeException("Input value is out of range");

try {
    System.out.println("Please enter in a logon id to see if it exists. When your done type 'DONE' ");
    String exp = scan.nextLine();

    while (!exp.equals("DONE")) {

        System.out.println("The previous one is good please enter in another logon id");
        exp = scan.nextLine();
        if(exp.length()>20){
            throw new StringTooLongException();
        }
    }

}

catch(StringTooLongException e){
    System.out.println(e.getMessage());
    String exp= scan.nextLine();

}




}


}
