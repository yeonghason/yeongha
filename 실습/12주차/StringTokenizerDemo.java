package wret;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="of the people, by the people, for the people";
		
		StringTokenizer et=new StringTokenizer(s," ,");
		
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println("["+st.nextToken()+"]");
		}
	}

}
