
public class TestWhile{
	
	public static void main(String[] args){
		//��1+��5�ĺ�
		outer:
		for (int i=1;i<=100;i++){
			System.out.println(i);
			while(i==36){
				break outer;
			}
		}

		
	}
}