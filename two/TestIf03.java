import java.util.*;
public class TestIf03{
	public static void main(String[] args){
	int a1=(int)(Math.random()*6)+1;
	int a2=(int)(Math.random()*6)+1;
	int a3=(int)(Math.random()*6)+1;
		
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
		
		System.out.println(sum>=10?"中了":"没中");
		
	}
	
}