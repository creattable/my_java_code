public class TestDiamond{
	public static void main(String[] args){
		/*����
		*
	   ***
	  *****
	 *******
	  *****
	   ***
	    *
		*/
		//������
		for (int j=1;j<=4;j++){
			for (int i=1;i<=(9-j);i++){//i���ƿո����
				System.out.print(" ");
			}
			
			for (int i=1;i<=(2*j-1);i++){//i����*�ĸ���
				System.out.print("*");
			}
			
			//����
			System.out.println();
		}
		
		//������
		for (int j=1;j<=3;j++){
			for (int i=1;i<=(j+5);i++){//�ո�
				System.out.print(" ");
			}
			
			for (int i=1;i<=(7-2*j);i++){//*
				System.out.print("*");
			}
			//����
			System.out.println();
			
		}

	}
}