import java.util.Scanner;

public class TestVar11{
	public static void main(String[] args){
		//��Բ���ܳ������
		//��ȡ������
		final double PI=3.1415926;//final���԰ѱ�����ɳ���
								//�����������������˵���ַ�����
								//Լ�����ַ�����ȫ����д
		
		//����pi=9.29;����ִ�����Ϊ��pinal���εı����������޷����޸�
		
		//����һ��ɨ����:
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������һ���뾶");
		
		//��ɨ����ɨ�����¼���int��������
		int r=sc.nextInt();
		

		
		//�ܳ�
		double c=2*PI*r;
		System.out.println("�ܳ�Ϊ��"+c);
		
		//���
		double s=PI*r*r;
		System.out.println("���Ϊ��"+s);
	}
}