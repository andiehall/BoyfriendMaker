import java.util.Scanner;
public class BoyfriendMain
	{

		public static void main(String[] args)
			{
				pickBoyfriend();

			}
		
		public static void pickBoyfriend()
			{
				Scanner pickBoyfriend = new Scanner(System.in);
				System.out.println("Pick your boyfriend 1-4!");
				int boyfriendPicker = pickBoyfriend.nextInt();
				
				Boyfriend myBf1 = new Boyfriend("Joe", 26, 189.5, "Taurus", "America");
				Boyfriend myBf2 = new Boyfriend("Maddi", 18, 145.3, "Cancer", "France");
				Boyfriend myBf3 = new Boyfriend("Din", 46, 180.2, "Aquarius", "the Creed on Nevarro");
				Boyfriend myBf4 = new Boyfriend("Boba", 49, 210.4, "Sagittarius", "Kamino");
				
				if(boyfriendPicker == 1)
					{
						System.out.println("This is your boyfriend: " + myBf1.name + "!");
						System.out.println("He is " + myBf1.age + " years old.");
						System.out.println("His zodiac sign is: " + myBf1.zodiacSign);
						System.out.println("He is from: " + myBf1.countryOfOrgin);
					}
				else if(boyfriendPicker == 2)
					{
						System.out.println("This is your boyfriend: " + myBf2.name + "!");
						System.out.println("He is " + myBf2.age + " years old.");
						System.out.println("His zodiac sign is: " + myBf2.zodiacSign);
						System.out.println("He is from: " + myBf2.countryOfOrgin);
					}
				else if(boyfriendPicker == 3)
					{
						System.out.println("This is your boyfriend: " + myBf3.name + "!");
						System.out.println("He is " + myBf3.age + " years old.");
						System.out.println("His zodiac sign is: " + myBf3.zodiacSign);
						System.out.println("He is from: " + myBf3.countryOfOrgin);
					}
				else if(boyfriendPicker == 4)
					{
						System.out.println("This is your boyfriend: " + myBf4.name + "!");
						System.out.println("He is " + myBf4.age + " years old.");
						System.out.println("His zodiac sign is: " + myBf4.zodiacSign);
						System.out.println("He is from: " + myBf4.countryOfOrgin);
					}
				else
					{
						System.out.println("Invalid Answer! Try Again!");
						pickBoyfriend();
					}
			}

	}
