package ro.unitbv.shape;

public class BorderClassValidator {
	Boolean validate(int borderWidth) {
		Boolean ok = true;

		if (borderWidth < 0) {
			ok = false;
			throw new IllegalArgumentException("Valorea BorderWidth nu poate fi mai mica decat 0");
		}

		return ok;
	}

}