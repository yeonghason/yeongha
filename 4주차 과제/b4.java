package rhk4;

 class Car {
    static int numOfCar, numOfRedCar;

    static int getNumOfCar(){  
        return numOfCar;
    }

    static int getNumOfRedCar(){   
        return numOfRedCar;
    }

    Car(String Color){
        numOfCar++;
        if (Color.equals("red") || Color.equals("RED")){ 
            numOfRedCar++;
        }
    }
}


public class b4 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}