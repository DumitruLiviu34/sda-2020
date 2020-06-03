package ro.unitbv.shape;

public class ShapeDimensionValidator {

	Boolean validatePatrat(int size) {

		Boolean ok = true;

		if (size < 0) {
			ok = false;
			throw new IllegalArgumentException("Marimea trebuie sa fie mai mare decat 0!");

		}

		return ok;
	}

	Boolean validateDreptunghi(int width, int height) {

		Boolean ok = true;

		if (width < 0 || height < 0) {
			ok = false;
			throw new IllegalArgumentException("Latimea si inaltimea trebuie sa fie mai mare decat 0!");

		}

		return ok;
	}

	Boolean validateCerc(int radius) {

		Boolean ok = true;
		if (radius < 0) {
			ok = false;
			throw new IllegalArgumentException("Raza trebuie sa fie mai mare decat 0!");

		}

		return ok;
	}
}