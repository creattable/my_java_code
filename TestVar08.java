public class TestVar08{
	public static void main(String[] args){
		char ch1='A';
		System.out.println(ch1);
		System.out.println(ch1+90);//���Ϊ155
		System.out.println(155-ch1);//���Ϊ90
		//char���͡����ǿ��������ӣ������������������
		//�����ڵײ����ʱ��ʵ���ǰ���ASCII������
		//ע��unicode������ASCII
		
		
		//ת����
		int num1=(int)ch1;
		System.out.println(num1);
		
		//���������⣺
		char ch6='2'+2;
		System.out.println(ch6);
		//'2'��ASCII��50��50+2=52��52��ASCII��4
	}
	
}