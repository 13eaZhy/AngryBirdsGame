package main;

import characters.Bomber;
import characters.Red;
import characters.Yellow;

public class GameApplication {

	public static void main(String[] args) {
		Red r1    = new Red("Mark");
		Red r2    = new Red("Chris");
		Red r3    = new Red("Jorj");
		Yellow y1 = new Yellow("Good yellow");
		Bomber b1 = new Bomber("Bombberr");
		r1.status();
		r2.status();
		r3.status();
		y1.status();
		b1.status();
//		r1= new Red();
//		r2= new Red();
//		r3= new Red();
//		y1= new Yellow();
//		b1= new Bomber();

	}

}
