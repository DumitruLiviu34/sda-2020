package Maps;

import java.awt.geom.Arc2D.Double;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {

	public static void main(String[] args) {
		double[] notemate;
		notemate = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] noterom = new double[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		// Create a HashMap object called catalog
		Studentdetails elev1 = new Studentdetails("Cristi", "Giorgel", noterom[0], notemate[9]);
		Studentdetails elev2 = new Studentdetails("Popa", "Giorgel", noterom[1], notemate[8]);
		Studentdetails elev3 = new Studentdetails("Gheorghe", "Giorgel", noterom[2], notemate[7]);
		Studentdetails elev4 = new Studentdetails("Zvirid", "Giorgel", noterom[3], notemate[6]);
		Studentdetails elev5 = new Studentdetails("Vasile", "Giorgel", noterom[4], notemate[5]);
		Studentdetails elev6 = new Studentdetails("John", "Giorgel", noterom[5], notemate[4]);
		Studentdetails elev7 = new Studentdetails("Radu", "Giorgel", noterom[6], notemate[3]);
		Studentdetails elev8 = new Studentdetails("Fana", "Giorgel", noterom[7], notemate[2]);
		Studentdetails elev9 = new Studentdetails("Negura", "Giorgel", noterom[8], notemate[1]);
		Studentdetails elev10 = new Studentdetails("Andrei", "Giorgel", noterom[9], notemate[0]);

		HashMap<String, Studentdetails> catalog = new HashMap<String, Studentdetails>();

		// Add keys and values (CNP,Name)
		catalog.put("9a", elev1);
		catalog.put("8b", elev2);
		catalog.put("7c", elev3);
		catalog.put("6d", elev4);
		catalog.put("5f", elev5);
		catalog.put("4g", elev6);
		catalog.put("3e", elev7);
		catalog.put("2h", elev8);
		catalog.put("1234", elev9);
		catalog.put("15", elev10);
		// System.out.println(catalog);
		System.out.println(catalog.get("15"));
		// for(String getkey:catalog.keySet())
		// {
		// System.out.println(getkey);
		// }
		System.out.println("\n" + "LinkedHashMap!!!!!!!!!!!!!!!!!!" + "\n");

		LinkedHashMap<String, Studentdetails> catalog1 = new LinkedHashMap<String, Studentdetails>();
		catalog1.put("20f", elev1);
		catalog1.put("2sadf", elev2);
		catalog1.put("3sadfg", elev3);
		catalog1.put("4dfsgdsf", elev4);
		catalog1.put("adf", elev5);
		catalog1.put("555", elev6);
		catalog1.put("5547h", elev7);
		catalog1.put("88", elev8);
		catalog1.put("asd", elev9);
		catalog1.put("1234", elev10);
		// for(String getkeys:catalog1.keySet())
		// {
		// System.out.println(getkeys);
		// }
		System.out.println(catalog1.get("1234"));
	}

}