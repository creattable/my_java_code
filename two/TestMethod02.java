import java.util.*;

public class TestMethod02{
	
	public static void guessNum(int yourNum){
		int myHeratNum=5;
		System.out.println(yourNum==myHeratNum?"��":"��");

	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("���һ����:");
		int yourGuessNum=sc.nextInt();
		
		
		guessNum(yourGuessNum);
		
		
	}
}