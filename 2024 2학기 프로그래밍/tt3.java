package tt;

public class tt3 {
	double dividend;
	double divisor;
	
	double getDiv() {
		return dividend/divisor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  tt3 num1=new tt3();
	  num1.dividend=4.0;
	  num1.divisor=2.0;
	  
	  tt3 num2=new tt3();
	  num2.dividend=6.0;
	  num2.divisor=3.0;
	  
	  System.out.println(num1.dividend+"/"+num1.divisor+"="+num1.getDiv());
	  System.out.println(num2.dividend+"/"+num2.divisor+"="+num2.getDiv());
	}

}
