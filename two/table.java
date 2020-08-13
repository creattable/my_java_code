import java.util.*;
public class table{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年龄");
		
		if (sc.hasNextInt()==true){
			int age=sc.nextInt();

			if (age>0){
				if (age>7){
					System.out.println("搬桌子");
				}else if (age>5){
					System.out.println("请输入性别");
					String str=sc.next();
					char sex=str.charAt(0);
					if(sex=='男'){
						System.out.println("也可以");
					}else{
						System.out.println("你还太小了");
					}
					
				}else{
					System.out.println("你还太小了");
				}
				
				
			}else{
				System.out.println("年龄为负数或为0");
			}
		}else{
			System.out.println("年龄不是整数");
		}
		
		
	}
}