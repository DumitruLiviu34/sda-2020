package ro.unitbv.IfElseProblem;

public class IfElseProblem {

//	!!!!!       Dupaa ce arti terminat de srics codul formatati fisierul cu Ctrl+shift+f

	public static void main(String[] args) {

		// System.out.println(getMaxSpeedLimitByIfElse("Drum Expres"));
		// System.out.println(getMaxSpeedLimitByIfElse("Oras"));
		// System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));
		// System.out.println(getMaxSpeedLimitByIfElse("Necunoscut"));

		//System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Expres"));
		//System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));
		//System.out.println(getMaxSpeedLimitByIfElseComplex("Autostrada"));
		//System.out.println(getMaxSpeedLimitByIfElseComplex("Necunoscut"));
		
		System.out.println(getMaxSpeedLimitBySwitch("Oras"));
		System.out.println(getMaxSpeedLimitBySwitch("Autostrada"));
		System.out.println(getMaxSpeedLimitBySwitch("Zona Rezidentiala"));
		System.out.println(getMaxSpeedLimitBySwitch("Drum European"));
		

	}

	public static int getMaxSpeedLimitByIfElse(String roadType) {
		if (roadType == "Autostrada") {
			System.out.println("Viteza maxima pe Autostrada=");
			return 130;
		} else if (roadType == "Zona Rezidentiala") {
			System.out.println("Viteza maxima pe Zona Rezidentiala=");
			return 30;
		} else if (roadType == "Drum Expres") {
			System.out.println("Viteza maxima pe Drum Expres=");
			return 100;
		} else if (roadType == "Oras") {
			System.out.println("Viteza maxima in Oras=");
			return 50;
		} else {
			System.out.println("Drumul este necunoscut=");
		}

		return 0;
	}

	public static int getMaxSpeedLimitByIfElseComplex(String roadType) {

		if (roadType == "Autostrada") {
			System.out.println("Viteza maxima pe Autostrada=");
			return 130;

		} else {
			if (roadType == "Zona Rezidentiala") {
				System.out.println("Viteza maxima in Zona Rezidentiala=");
				return 30;
			} else {
				if (roadType == "Drum Expres") {
					System.out.println("Viteza maxima pe Drum Expres=");
					return 100;
				} else {
					if (roadType == "Oras") {
						System.out.println("Viteza maxima in Oras=");
						return 50;
					} else {
							System.out.println("Drumul este necunoscut=");
						}
					}
				}

			}
		
		return 0;

	}

	public static int getMaxSpeedLimitBySwitch(String roadType) {
		switch (roadType) {
		case "Autostrada":
			System.out.println("Vitza maxima pe Autostrada=");
			return 130;
		case "Zona Rezidentiala":
			System.out.println("Viteza maxima in Zona Rezidentiala=");
			return 30;
		case "Drum Expres":
			System.out.println("Viteza maxima pe Drum Expres");
			return 100;
		case "Oras":
			System.out.println("Viteza maxima in oras");
			return 50;
		default:
			return 0;
		}

		
	}

}