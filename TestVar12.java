import java.util.Scanner;
public class TestVar12{
	public static void main(String[] args){
		//����¼��ѧ����Ϣ�����䡢��ߡ��������Ա�
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		int age =sc.nextInt();
		
		System.out.println("���������");
		double height=sc.nextDouble();
		
		System.out.println("����������");
		String name=sc.next();
		
		System.out.println("�������Ա�");
		String sexStr=sc.next();
		char sex=sexStr.charAt(0);
		//����������Ժϳ�һ�仰��char sex=sc.next().charAT(0);
		
		System.out.println("��ѧ������ϢΪ�������ǣ�"+name+",������:"+age
		+"������ǣ�"+height+"�Ա���:"+sex);
	}
}