import java.util.*;
public class TestNum{
	public static void main(String[] args){
		/*
		1.输入10个整数、输入666的时候退出程序
		2.判断其中的正数
		3.判断系统是正常退出开始被迫退出
		*/
		Scanner sc=new Scanner(System.in);
		

		int i=1;
		int count=0;
		while(i<=10){
			System.out.println("请输入第"+i+"个数：");
			int t=sc.nextInt();
			if (t>0){
				count++;//计算正数
			}
			if (t==666){
				System.out.println("正数一共有："+count);
				System.out.println("弹出");//强制弹出
				return;
			}
			
		}
		System.out.println("正常弹出");
		System.out.println("正数一共有："+count);
	
	
	}
}