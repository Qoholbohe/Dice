import java.util.Scanner;
import java.math.*;

@SuppressWarnings("unused")
public class Dice {
	static int sum = 0;
	Cup cup = new Cup();
	int count=cup.get();
	
	//��ӡ
	public void print(){
		System.out.println("�������������ķ�Χ:");
		System.out.print("Min:");
		Scanner sc1 = new Scanner(System.in);
		int min = sc1.nextInt();
			
		System.out.print("Max:");
		Scanner sc2 = new Scanner(System.in);
		int max = sc2.nextInt();
			
		for(int x = 1; x<=count; x++){
			int y = getResult(count,min,max);
			System.out.print("��" + x + "�����ӵ�ֵ:");
			System.out.println(y );
			sum +=y;
		}
	}
	
	//���������ܺ�
	public void printSum(){
		System.out.println("���������ܺ�:"+sum);
	}
	//����num1~num2֮��������
	public static int getResult(int count, int min, int max){
		int x = (int)((max-min+1)*Math.random()+min);
		return x;
	}
}
