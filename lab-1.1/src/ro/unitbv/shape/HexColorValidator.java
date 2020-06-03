package ro.unitbv.shape;

public class HexColorValidator {
	Boolean validate(String colorHex) {

		Boolean ok = true;

		if (colorHex.charAt(0) != '#') {
			ok = false;
			throw new IllegalArgumentException("Culoarea Hex pe care ați furnizat-o nu este validă: no # found!");

		}

		if (colorHex.length() > 7) {
			ok = false;
			throw new IllegalArgumentException(
					"Culoarea Hex pe care ați furnizat-o nu este validă: numărul de caractere nu este de 7");

		}

		int i = 1;
		while (i < 7)

		{
			if ((colorHex.charAt(i) != 'a') && (colorHex.charAt(i) != 'b') && (colorHex.charAt(i) != 'c')
                    && (colorHex.charAt(i) != 'd') && (colorHex.charAt(i) != 'e') && (colorHex.charAt(i) != 'f')
                    && (colorHex.charAt(i) != '1') && (colorHex.charAt(i) != '2') && (colorHex.charAt(i) != '3')
                    && (colorHex.charAt(i) != '4') && (colorHex.charAt(i) != '5') && (colorHex.charAt(i) != '6')
                    && (colorHex.charAt(i) != '0') && (colorHex.charAt(i) != '7') && (colorHex.charAt(i) != '8')
                    && (colorHex.charAt(i) != '9') && (colorHex.charAt(i) != 'A') && (colorHex.charAt(i) != 'B')
                    && (colorHex.charAt(i) != 'C') && (colorHex.charAt(i) != 'D') && (colorHex.charAt(i) != 'E')
                    && (colorHex.charAt(i) != 'F')) {
                ok = false;
                throw new IllegalArgumentException("codul hex invalid");
			}

			i++;

		}

		return ok;

	}
}