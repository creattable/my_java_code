import java.util.Scanner;
public class FourNum{
	public static void main(String[] args){
		//ʵ�ֹ��ܣ���һ��4λ�������ÿһλ��������֣�
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num=input.nextInt();
		
		int a1=num/1000;
		int a2=num/100%10;
		int a3=num/10%10;
		int a4=num%10;
		
		System.out.println("ǧ��"+a1);
		System.out.println("�٣�"+a2);
		System.out.println("ʮ��"+a3);
		System.out.println("����"+a4);
	}
}