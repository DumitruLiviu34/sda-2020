package ro.unitbv.clase;

public class Clase {

	public static void main(String[] args) {
		Customer customer = new Customer("Dumitru", "Jalba", 2);
		Adress ad = new Adress("Petuniei", "Brasov", 2);
		System.out.println(ad);
		PaymentMethod PM = new PaymentMethod("Card");
		System.out.println(PM);
		System.out.println(customer);
		Customer customer1 = new Customer("Liviu", "Dumitru", 21, ad, PM);
		System.out.println(customer1);

		System.out.println(customer1.getPaymentMethod().getType());
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getNumber());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getAdress().getCity());
		System.out.println(customer1.getAdress());
	}

}
