import java.util.Scanner;
public class TestArray{
	public static void main(String[] args){
		int [] scores=new int[10];
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		
		for (int i=1;i<=10;i++){
			System.out.print("�������"+i+"��ѧ���ĳɼ�");
			int score=sc.nextInt();
			scores[i-1]=score;
			sum+=score;
		}
		System.out.println(scores[5]);
		
	}
}