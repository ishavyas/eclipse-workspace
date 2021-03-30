package Assignment2;

class Word{
	String create() {
		String s = "This is a new program";
		System.out.println(s);
		String res = "";
		for(int i = 0; i<s.length(); i++) {
			if(i==0)
				res += (s.charAt(i));
			else if(s.charAt(i) == ' ')	{
				res += (s.charAt(i+1));
			}			
		}
		
		return res;
	}
}

public class WordDemo {

	public static void main(String[] args) {
		Word w = new Word();
		System.out.println(w.create());
	}
}

