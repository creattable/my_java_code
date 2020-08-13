public class TestVar08{
	public static void main(String[] args){
		char ch1='A';
		System.out.println(ch1);
		System.out.println(ch1+90);//结果为155
		System.out.println(155-ch1);//结果为90
		//char类型、我们看到的样子，字面变量就算它本身
		//但是在底层计算时、实际是按照ASCII码计算的
		//注：unicode兼容了ASCII
		
		
		//转换：
		int num1=(int)ch1;
		System.out.println(num1);
		
		//常用面试题：
		char ch6='2'+2;
		System.out.println(ch6);
		//'2'的ASCII是50、50+2=52、52的ASCII是4
	}
	
}