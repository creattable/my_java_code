import java.util.*;
public class Ifcode{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�������Ա����");
		
		
		if(sc.hasNextDouble()==true){//�ж��ǲ���double��
		double num=sc.nextDouble();//����Ǿͽ���

			if (num>=8000){
				System.out.println("�û�Ա����6��");
			}else if (num>=4000){
				System.out.println("�û�Ա����7��");
			}else if (num>=2000){
				System.out.println("�û�Ա����8��");
			}else if(num>=0){
				System.out.println("�û�Ա����9��");
			}else{
				System.out.println("�޷��Ż�");
			}
		
		}else{
			System.out.println("�������ʹ���");
		}
		
		
		
	}
}