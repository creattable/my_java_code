public class TestFor{
	public static void main(String[] args){
		//���1-100�б�5����������ÿ�����6��
		int count=0;
		for (int i=1;i<=100;i++){
			if (i%5==0){
				System.out.print(i+"\t");
				count++;
				if (count%6==0){
					System.out.println();
				}
			}
		}
	}
}