import java.util.Scanner;
public class GiftAdvisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String priceRange;
		String gender;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter the recipients gender");
		gender=keyboard.next();
		System.out.println("Enter your price range: low, medium, or high");
		priceRange =keyboard.next();
		
		if(gender.equals("female")){
			
			if(priceRange.equals("low")){
				System.out.println("We suggest"
						+ "\n Wine"
						+ "\n or a selfie stick");
			}
			else if(priceRange.equals("medium")){
				System.out.println("We suggest"
						+ "\n perfume"
						+ "\n or a sweater");
			}
			else if(priceRange.equals("high")){
				System.out.println("We suggest"
						+ "\n jewelery"
						+ "\n or a weekend getaway");
			}
			else{
				System.out.print("You're response was invalid. "
						+ "So maybe you could make them something");
			}
		}
		else if (gender.equals("male")){
			
			if(priceRange.equals("low")){
				System.out.println("We suggest"
						+ "\n shoes"
						+ "\n or books"
						+ "\n or bricks");
			}
			else if(priceRange.equals("medium")){
				System.out.println("We suggest"
						+ "\n a guitar"
						+ "\n or a xbox");
			}
			else if(priceRange.equals("high")){
				System.out.println("We suggest"
						+ "\n a smart tv"
						+ "\n or a an apple watch");
			}
			else{
				System.out.print("You're response was invalid. "
						+ "So maybe you could make them something");
			}
		}
		else {
			System.out.print("invalid response");
		}
	}

}
