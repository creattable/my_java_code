import java.util.*;
public class TestIf01{
	public static void main(String[] args){
		//������������1-6��������������͡����ݺ͵Ĵ�С����
		
		//1.������������2.��͡�3.���ݷ����ж�
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����1��");
		int a1=sc.nextInt();
		
		System.out.println("����2");
		int a2=sc.nextInt();
		
		System.out.println("����3");
		int a3=sc.nextInt();
		
		
		int sum=0;
		sum+=a1;
		sum+=a2;
		sum+=a3;
		System.out.println("hewei:"+sum);
		
		
		//����14����һ�Ƚ�
		if (sum>=14){
			System.out.println("һ�Ƚ�");
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