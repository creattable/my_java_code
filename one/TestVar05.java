public class TestVar05{
	public static void main(String[] args){
		//����
		int num1=12;//Ĭ����ʮ����
		System.out.println(num1);
		int num2=012;//ǰ�����0����8����
		System.out.println(num2);
		int num3=0x12;//ǰ�����0x��0X����16����
		System.out.println(num3);
		int num4=0b10;//ǰ�����0b����2����
		System.out.println(num4);
		
		//����byte����
		byte b = 12;//����һ��byte���͡���ֵλ12,����Χ�ᱨ��-128~127
		System.out.println(b);
		short s = 30000;
		System.out.println(s);
		
		int i=1234;
		System.out.println(i);
		
		/*
		long num5=12345678910;
		System.out.println(num5);
		�����ǻᱨ��ġ���Ϊ��������Ĭ����int�͡�����12345678910��һ��int
		����������int��˵����������Χ��
		****��Ҫ��һ��������long���͡���ô�ں������L��l�Ϳ�����
		*/
		long num5=12345678910L;
		System.out.println(num5);
		//ֻ�������������int���Ͳ���Ҫ����L�������������LҲ���Ը�ֵ��long
		
		
		
	}
}