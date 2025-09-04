//Simple CALCULATOR
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n1=scanner.nextDouble();
        char operator=scanner.next().charAt(0);
        double n2=scanner.nextDouble();
        scanner.close();
        
        switch (operator) {
            case '+' : System.out.printf("%.2f",n1+n2); break;
            case '-' : System.out.printf("%.2f",n1-n2); break;
            case '*' : System.out.printf("%.2f",n1*n2); break;
            case '/' : System.out.printf("%.2f",n1/n2); break;
            case '^' : System.out.print(Math.pow(n1,n2)); break;
            default : System.out.println("Invalid Operator!");
        }
            
    }
}
// When dividing any number by 0 it gives infinity.
