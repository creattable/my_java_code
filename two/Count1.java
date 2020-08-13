import java.util.*;
public class Count1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		if (sc.hasNextDouble()==true){
			double num=sc.nextDouble();
			String discount="";
			if (num>=0){
				if (num>=8000){
					discount="0.6";
				}else if (num>=4000){
					discount="0.7";
				}else if (num>=2000){
					discount="0.8";
				}else{
					discount="0.9";
				}
				System.out.println(discount);
				
			}else{
				System.out.println("数值小于0");
			}
			
		}else{
			System.out.println("数值类型错误");
		}
		
		
		
	}
}