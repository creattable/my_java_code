import java.util.Scanner;

public class TestVar11{
	public static void main(String[] args){
		//求圆的周长和面积
		//提取变量：
		final double PI=3.1415926;//final可以把变量变成常量
								//这个常量会变成我们所说的字符常量
								//约定：字符常量全部大写
		
		//错误：pi=9.29;会出现错误、因为被pinal修饰的变量、后续无法再修改
		
		//拿来一个扫描器:
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入一个半径");
		
		//让扫描器扫描键盘录入的int类型数据
		int r=sc.nextInt();
		

		
		//周长
		double c=2*PI*r;
		System.out.println("周长为："+c);
		
		//面积
		double s=PI*r*r;
		System.out.println("面积为："+s);
	}
}