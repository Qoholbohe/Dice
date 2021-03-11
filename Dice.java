import java.util.Scanner;
import java.math.*;

@SuppressWarnings("unused")
public class Dice {
	static int sum = 0;
	Cup cup = new Cup();
	int count=cup.get();
	
	//打印
	public void print(){
		System.out.println("输入产生随机数的范围:");
		System.out.print("Min:");
		Scanner sc1 = new Scanner(System.in);
		int min = sc1.nextInt();
			
		System.out.print("Max:");
		Scanner sc2 = new Scanner(System.in);
		int max = sc2.nextInt();
			
		for(int x = 1; x<=count; x++){
			int y = getResult(count,min,max);
			System.out.print("第" + x + "个骰子的值:");
			System.out.println(y );
			sum +=y;
		}
	}
	
	//计算骰子总和
	public void printSum(){
		System.out.println("骰子数的总和:"+sum);
	}
	//产生num1~num2之间的随机数
	public static int getResult(int count, int min, int max){
		int x = (int)((max-min+1)*Math.random()+min);
		return x;
	}
}
