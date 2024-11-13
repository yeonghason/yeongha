package tt;

public class tt2 {
	int opr1;
	int opr2;
	int getValue() {
		return opr1*opr2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tt2 num1=new tt2();
		num1.opr1=2;
		num1.opr2=3;
		
		tt2 num2=new tt2();
		num2.opr1=3;
		num2.opr2=4;
		
		System.out.println(num1.opr1+"*"+num1.opr2+"="+num1.getValue());
		System.out.println(num2.opr1+"*"+num2.opr2+"="+num2.getValue());
	}

}
