public class TestVar10{
	public static void main(String[] args){
		double d=6;//int-->double
		System.out.println(d);
		
		//int i=6.5;//double-->int �ᱨ��
		//int-->double ���ԡ�
		//double-->int ����
		int i=(int)6.5; //��������ȷ��ǿ������ת��
		System.out.println(i);
		
		
		//��ͬһ�����ʽ���桢����ж������Ͳ�������
		//���������㡢�ַ��������Բ��롢Ψ����������
		double d2=12+12L+8.5F+3.14+'a';
		System.out.println(d2);
		
		//ע�⣺����byte,short,char��˵��ֻҪ�ڱ�����Χ��
		//��ֵ�Ͳ���Ҫ����ǿ��ת����ֱ�Ӹ�ֵ����
		byte b=12;//-128~127
		System.out.println(b);
		
		
	}
}