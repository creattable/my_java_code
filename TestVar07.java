public class TestVar07{
	public static void main(String[] args){
		//char ch1='aA1中?';char一般只能存放2字节 
		char ch1='a';//也可以是A、1、中、？等
		System.out.println(ch1);
		
		
		char ch6=' ';//字符类型：单引号引起来的单个字符
		System.out.println(ch6);
		System.out.println("-------------");
		
		char ch7='\n';
		System.out.println("aaa"+ch7+"bbb");
	}
}