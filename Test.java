import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) 
    {
        int num;
        System.out.println("���������ӵĸ���:");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        Cup cup = new Cup(num);
        cup.rollPrint();
    }

}