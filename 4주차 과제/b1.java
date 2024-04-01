package rhk4;

class Triangle {
	private double base, high;     

	double findArea() {     
		return base * high * 0.5;
	}

	double getBase() {     
		return base;
	}

	double getHigh() {      
		return high;
	}

	Triangle(double base, double high) {    
		this.base = base;
		this.high = high;
	}
}
