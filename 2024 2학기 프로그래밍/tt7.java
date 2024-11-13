package tt;
import java.util.Scanner;
class Goods{
	String name;
	int price;
	int numberOfStock;
	int sold;
	
	String getName() {return name;}
	int getPrice() {return price;}
	int getNumberOfStock() {return numberOfStock;}
	int getSold() {return sold;}
}
public class tt7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods[]goodsArray;
		goodsArray=new Goods[3];
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<goodsArray.length;i++) {
			goodsArray[i]=new Goods();
			goodsArray[i].name=s.next();
			goodsArray[i].price=s.nextInt();
			goodsArray[i].numberOfStock=s.nextInt();
			goodsArray[i].sold=s.nextInt();
		}
		for(int i=0; i<goodsArray.length;i++) {
			System.out.print(goodsArray[i].getName()+"");
			System.out.print(goodsArray[i].getPrice()+"");
			System.out.print(goodsArray[i].getNumberOfStock()+"");
			System.out.print(goodsArray[i].getSold()+"");
		}
	}

}
