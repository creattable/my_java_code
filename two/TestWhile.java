
public class TestWhile{
	
	public static void main(String[] args){
		//从1+到5的和
		outer:
		for (int i=1;i<=100;i++){
			System.out.println(i);
			while(i==36){
				break outer;
			}
		}

		
	}
}