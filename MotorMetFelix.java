package Motor;

public class MotorMetFelix {

	public static void main(String[] args) {
		Motor motor = new Motor();
		motor.woonwerkverkeerrijden();
		motor.woonwerkverkeerrijden();
		motor.woonwerkverkeerrijden();
		motor.woonwerkverkeerrijden();
	}

}


class Motor{
	boolean onderhoud;
	int rittenteller;
	int woonwerkverkeerrijden() {
		rittenteller ++;
		System.out.print("Dit is mijn " + rittenteller + "e rit");
		if (rittenteller < 3) {
			System.out.println("= je mag rijden.");
		}
		else{
			System.out.println("je mag niet meer rijden.");
		}
		
		return rittenteller;
		
		
	}
	
}



/*De motor wordt gebruikt voor woon-werk verkeer
 * Na 3x gebruiken dient de motor naar de garage te gaan.
 * De motor rijd op benzine.



*/
