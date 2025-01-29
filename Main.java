// PARTNER NAME:
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String birthMonth, surname, givenName, category, cardNum, birthCountry, termsAndConditions;
		char sex;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay,
		 validMonth, validYear, expireMonth, expireDay, expireYear;
		//INPUT SECTION
		
		birthMonth = "JAN"; 
		surname = "ORTEGA";
		givenName = "CAMERON";
		category = "C909";
		cardNum = "SRC0000000725";
		birthCountry = "United States";
		termsAndConditions = "None";

		sex = 'M';

		uscisNum1 = 123;
		uscisNum2 = 456;
		uscisNum3 = 789;
		birthDay = 8;
		birthYear = 1999;
		validDay = 8;
		validMonth = 1;
		validYear = 80;
		expireMonth = 11;
		expireDay = 10;
		expireYear = 5;
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                        " + surname );
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )     " + givenName );
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_           " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "    " + category + "       " + cardNum);
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,       " + birthCountry);
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /        " + termsAndConditions);
		System.out.println("║     '.--..--.'        Date of Birth   " + "Sex" );
		System.out.println("║       `\"\"\"\"\"`          " + birthDay + " " + birthMonth + " " + birthYear +"      "+ sex);
		System.out.println("║                       Valid From:    "+ validMonth + "/"+ validDay +"/"+ validYear);
		System.out.println("║                       Card Expires:  "+ expireMonth+ "/"+ expireDay +"/"+ expireYear);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}