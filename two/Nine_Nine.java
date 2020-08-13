import java.util.*;
public class Nine_Nine{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		for (int i=1;i<=9;i++){
			for (int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.print("\n");
		}
	}
}