public class TestMethod01{
	
	public static int add(int num1,int num2){
		int sum=0;
		sum+=num1;
		sum+=num2;
		return sum;
	}
	
	
	public static void main(String[] args){
		int num=add(10,20);
		System.out.println(num);
		
	}
}