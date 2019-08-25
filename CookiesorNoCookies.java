import java.util.Scanner;
public class CookiesorNoCookies {
	
	public static void main(String[] args) {
		Scanner Dealer = new Scanner(System.in);
		System.out.print("Press Enter to Start");
		String Enter = Dealer.nextLine();
		int Dice43 = (int)(Math.random()*6)+1;
		int Dice27261 = (int)(Math.random()*6)+1;
		if (Dice43 == Dice27261) {
			System.out.println("Congrats! Press enter to continue.");
			String YouSuck = Dealer.nextLine();
			System.out.println("Congrats! You did it! you got "+Dice43+" and "+Dice27261+"!"+"\n However, you do not get any cookies :(");}
		else {
			System.out.println("Congrats! Press enter to continue.");
		String YouSuck = Dealer.nextLine();
		System.out.println("You actually lost. Too bad, no cookies for you! \n Your results were "+Dice43+" and "+Dice27261+" );");}

	}

}
