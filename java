import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.printf("num1 = %d, num2 = %d",num1,num2);
    }
}
