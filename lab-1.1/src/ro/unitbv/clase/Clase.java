package ro.unitbv.clase;

public class Clase {

	public static void main(String[] args) {
		
		Adress ad = new Adress("Petuniei", "Brasov", 2);
		System.out.println(ad);
		Adress ad1 = new Adress("Cina", "Ploiesti", 1);
		System.out.println(ad);
		PaymentMethod PM = new PaymentMethod("Card");
		PaymentMethod PM1 = new PaymentMethod("Cash");
		Customer customer = new Customer("Dumitru", "Jalba", 18, ad1, PM);
		System.out.println(PM);
		System.out.println(PM1);
		System.out.println(customer);
		Customer customer1 = new Customer("Liviu", "Dumitru", 21, ad, PM1);
		System.out.println(customer1);
		System.out.println(customer1.getPaymentMethod().getType());
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getNumber());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getAdress().getCity());
		System.out.println(customer1.getAdress());
	}

}
