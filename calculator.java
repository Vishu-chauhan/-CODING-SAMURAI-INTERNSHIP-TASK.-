import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        int n1=0;
        int n2=0;
        int operator;
        System.out.println("1-ADD , 2-SUBTRACT , 3-MULTIPLY , 4- DIVIDE");
        System.out.print("Choose operator");
        Scanner sc= new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("enter the first number");
        n1 = sc.nextInt();
        System.out.println("enter the second number");
        n2 = sc.nextInt();
        double result=0;
        switch(operator){
            case 1:
            result=n1+n2;
            break;
            case 2:
            result=n1-n2;
            break;
            case 3:
            result=n1*n2;
            break;
            case 4:
            result=n1/n2;
            break;
            default:
            System.out.println("entered operator is not valid"); 

        }
        System.out.println("result is "+ result);
        sc.close();
    }
}
