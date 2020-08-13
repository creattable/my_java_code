import java.util.*;

public class TestMethod02{
	
	public static void guessNum(int yourNum){
		int myHeratNum=5;
		System.out.println(yourNum==myHeratNum?"对":"错");

	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("请猜一个数:");
		int yourGuessNum=sc.nextInt();
		
		
		guessNum(yourGuessNum);
		
		
	}
}