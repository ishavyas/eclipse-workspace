package Live;

import Music.*;
import Music.string.*;
import Music.Wind.*;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		v.play();
		Saxophone s = new Saxophone();
		s.play();
		
		System.out.println("====================================");
		
		Playable pl = new Playable() {

			@Override
			public void play() {
				System.out.println("Playable");
				v.play();
				s.play();				
			}			
		};
		pl.play();

	}

}
