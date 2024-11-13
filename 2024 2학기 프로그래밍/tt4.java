package tt;

public class tt4 {
	int base;
	int exp;
	int getValue() {
		int res=1;
		for(int i=0;i<exp;i++)
			res=res*base;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tt4 num1=new tt4();
		num1.base=2;
		num1.exp=3;
		tt4 num2=new tt4();
		num2.base=3;
		num2.exp=4;
		
		 System.out.println(num1.base+"의"+num1.exp+"승"+num1.getValue());
		 System.out.println(num2.base+"의"+num2.exp+"승"+num2.getValue());
	}
	}

