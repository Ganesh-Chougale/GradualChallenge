import java.util.Scanner;

public class GOOTN_IfElse {
    
    public static void GOOTN() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();

        if(num1>num2){
            System.out.println(num1+" is greater than "+ num2);
        }else{
            System.out.println(num2+" is greater than "+ num1);
        }
    
    }


    public static void main(String[] args) {
        GOOTN();
    }
}
