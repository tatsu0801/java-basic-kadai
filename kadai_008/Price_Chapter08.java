package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		int userAge=30;
		int serviceCost=3000;
		
		switch(userAge){
			case 10 -> System.out.println(1000);
			case 20 -> System.out.println(2000);
			case 30 -> System.out.println(3000);
			case 40 -> System.out.println(3000);
			case 50 -> System.out.println(4000);
			case 60 -> System.out.println(4000);
			case 70 -> System.out.println(4000);
			case 80 -> System.out.println(5000);
		default -> System.out.println(500);
		   }
		System.out.println(userAge + "代の料金は" + serviceCost + "円です");
		
   }
}	

