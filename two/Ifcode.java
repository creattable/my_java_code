import java.util.*;
public class Ifcode{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入会员积分");
		
		
		if(sc.hasNextDouble()==true){//判断是不是double型
		double num=sc.nextDouble();//如果是就接收

			if (num>=8000){
				System.out.println("该会员享受6折");
			}else if (num>=4000){
				System.out.println("该会员享受7折");
			}else if (num>=2000){
				System.out.println("该会员享受8折");
			}else if(num>=0){
				System.out.println("该会员享受9折");
			}else{
				System.out.println("无法优惠");
			}
		
		}else{
			System.out.println("数据类型错误");
		}
		
		
		
	}
}