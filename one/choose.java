import java.util.*;//*��������

public class choose{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ѡ��1��");
		int a1choose=sc.nextInt();
		
		System.out.println("ѡ��2��");
		int a2choose=sc.nextInt();
		
		System.out.println(a1choose==a2choose?"a1":"a2");
	}
	
}