import java.util.*;
public class TestIf01{
	public static void main(String[] args){
		//给出三个数（1-6）、对三个数求和、根据和的大小分配
		
		//1.给出三个数、2.求和、3.根据分配判断
		Scanner sc=new Scanner(System.in);
		
		System.out.println("数字1：");
		int a1=sc.nextInt();
		
		System.out.println("数字2");
		int a2=sc.nextInt();
		
		System.out.println("数字3");
		int a3=sc.nextInt();
		
		
		int sum=0;
		sum+=a1;
		sum+=a2;
		sum+=a3;
		System.out.println("hewei:"+sum);
		
		
		//大于14就是一等奖
		if (sum>=14){
			System.out.println("一等奖");
		}
		
		if(sum>=10&&sum<14){
			System.out.println("2");
		}
		
		if(sum>=6&&sum<10){
			System.out.println("3");
		}
		
		if(sum<6){
			System.out.println("4");
		}
		
		
		
		
		
	}
}