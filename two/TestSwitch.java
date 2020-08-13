public class TestSwitch{
	public static void main(String[] args){
		/*根据分数判断等级
		>=90 -------A
		>=80 -------B
		>=60 -------C
		<60  -------D
		*/
		int score=7;
		
		switch(score/10){
			case 9:System.out.println("A");break;
			case 8:System.out.println("B");break;
			case 7:System.out.println("C");break;
			case 6:System.out.println("C");break;
			default:System.out.println("E");break;
		}
		
	}
}