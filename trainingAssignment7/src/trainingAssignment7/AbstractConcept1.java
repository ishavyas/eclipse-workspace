package trainingAssignment7;
import java.util.Scanner;

abstract class OnlineShopping {
	abstract void fashion();
	abstract void homeDecor();
	void Delivery() {
		System.out.println("Home Delivery is available");
	} 
	void pickup() {
		System.out.println("Pick-up Only. Home Delivery currently Unavailable");
	}
}

class Walmart extends OnlineShopping{

	@Override
	void fashion() {
		System.out.println("Women's Wear, Men's Wear and Kids Wear available of limited brands");
		System.out.println("Available brands: Hanes, george, Time and Tru");
		
	}

	@Override
	void homeDecor() {
		System.out.println("Appliances, furnitures and Decor material availbale from limited brands");
		System.out.print("Brands Available: Mainstays, GreatValue");
		
	}
	
}

class Amazon extends OnlineShopping{

	@Override
	void fashion() {
		System.out.println("Women's Wear, Men's Wear and Kids Wear available of many national and international brands");
		System.out.println("Brands Available:  Nike, Adidas, Gucci");
		
	}

	@Override
	void homeDecor() {
		System.out.println("Appliances, furnitures and Decor material availbale from national and international brands");
		System.out.print("Brands Available: Philips, LG, Samsung, IKEA Sony");
		
	}
	
}


public class AbstractConcept1 {

	public static void main(String[] args) {
		OnlineShopping shop;
		shop = new Walmart();
		shop.fashion();
		shop.homeDecor();
		shop.pickup();
		shop = new Amazon();
		shop.fashion();
		shop.homeDecor();
		shop.Delivery();
	}

}
