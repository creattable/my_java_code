import java.util.*;
public class TestNum{
	public static void main(String[] args){
		/*
		1.����10������������666��ʱ���˳�����
		2.�ж����е�����
		3.�ж�ϵͳ�������˳���ʼ�����˳�
		*/
		Scanner sc=new Scanner(System.in);
		

		int i=1;
		int count=0;
		while(i<=10){
			System.out.println("�������"+i+"������");
			int t=sc.nextInt();
			if (t>0){
				count++;//��������
			}
			if (t==666){
				System.out.println("����һ���У�"+count);
				System.out.println("����");//ǿ�Ƶ���
				return;
			}
			
		}
		System.out.println("��������");
		System.out.println("����һ���У�"+count);
	
	
	}
}