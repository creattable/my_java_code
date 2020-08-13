public class TestVar05{
	public static void main(String[] args){
		//整形
		int num1=12;//默认是十进制
		System.out.println(num1);
		int num2=012;//前面加上0就是8进制
		System.out.println(num2);
		int num3=0x12;//前面加上0x或0X就是16进制
		System.out.println(num3);
		int num4=0b10;//前面加上0b就是2进制
		System.out.println(num4);
		
		//定义byte类型
		byte b = 12;//定义一个byte类型、赋值位12,超范围会报错-128~127
		System.out.println(b);
		short s = 30000;
		System.out.println(s);
		
		int i=1234;
		System.out.println(i);
		
		/*
		long num5=12345678910;
		System.out.println(num5);
		这样是会报错的、因为整数类型默认是int型、所以12345678910是一个int
		型数、对于int来说、它超出范围了
		****想要把一个数赋给long类型、那么在后面加上L或l就可以了
		*/
		long num5=12345678910L;
		System.out.println(num5);
		//只有这个数超出了int类型才需要加上L，否则无需加上L也可以赋值给long
		
		
		
	}
}