package ex8no2;

public class ex8no2 {  //  418p
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i =0; i <10; i++ ) {
			result = number / (int)(Math.random() * 10);
			System.out.println(result);
		}
	}

}
