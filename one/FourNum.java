import java.util.Scanner;
public class FourNum{
	public static void main(String[] args){
		//实现功能：给一个4位数、求出每一位上面的数字；
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		int num=input.nextInt();
		
		int a1=num/1000;
		int a2=num/100%10;
		int a3=num/10%10;
		int a4=num%10;
		
		System.out.println("千："+a1);
		System.out.println("百："+a2);
		System.out.println("十："+a3);
		System.out.println("个："+a4);
	}
}