import java.util.Scanner;
public class TestIf02{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����1��");
		int a1=sc.nextInt();
		
		System.out.println("����2��");
		int a2=sc.nextInt();
		
		System.out.println("����3��");
		int a3=sc.nextInt();
		
		int sum=0;
		sum+=a1;
		sum+=a2;
		sum+=a3;
		System.out.println("hewei:"+sum);
		
		if (sum>=14){
			System.out.println("һ�Ƚ�:");
		}else if(sum>=10) {
			System.out.println("���Ƚ�:");
		}else if (sum>=5){
			System.out.println("���Ƚ�:");
		}else{
			System.out.println("�ĵȽ�:");
		}
		
		
		
	}
	
}