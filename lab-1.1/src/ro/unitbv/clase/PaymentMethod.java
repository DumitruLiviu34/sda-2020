package ro.unitbv.clase;

public class PaymentMethod {
	String type;

	public PaymentMethod(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PaymentMethod (type: " + type + ")";
	}

	public String getType() {
		return type;
	}

}
