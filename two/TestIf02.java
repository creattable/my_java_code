import java.util.Scanner;
public class TestIf02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("数字1：");
		int a1=sc.nextInt();
		
		System.out.println("数字2：");
		int a2=sc.nextInt();
		
		System.out.println("数字3：");
		int a3=sc.nextInt();
		
		int sum=0;
		sum+=a1;
		sum+=a2;
		sum+=a3;
		System.out.println("hewei:"+sum);
		
		if (sum>=14){
			System.out.println("一等奖:");
		}else if(sum>=10) {
			System.out.println("二等奖:");
		}else if (sum>=5){
			System.out.println("三等奖:");
		}else{
			System.out.println("四等奖:");
		}
		
		
		
	}
	
}