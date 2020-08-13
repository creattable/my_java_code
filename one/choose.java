import java.util.*;//*代表所有

public class choose{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("选择1：");
		int a1choose=sc.nextInt();
		
		System.out.println("选择2：");
		int a2choose=sc.nextInt();
		
		System.out.println(a1choose==a2choose?"a1":"a2");
	}
	
}