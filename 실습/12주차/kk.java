package wret;

public class kk {
 class mouse{
	 String name;
	 
	 pubilc mouse(String name) {
		 this.name=name;
	 }
 }
 public boolean equals(Object obj) {
	 if (obj instanceof keyboard) {
		 keyboard k=(keyboard)obj;
		 if(name.equals(k.name))
			 return true;
	 }
	 return false;
 }
 public String toString() {
	 return"키보드입니다.";
 }
}
