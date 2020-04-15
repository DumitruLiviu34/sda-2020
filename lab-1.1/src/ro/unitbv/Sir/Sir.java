package ro.unitbv.Sir;

import java.util.Arrays;

public class Sir {

	public static void main(String[] args) {
		double[] sir = { 30, 40, 33, 44, 38.5, 41.1, 33.3 };
		double[] siri = new double[sir.length];
		for (int j = 0; j < sir.length; j++) {
			siri[j] = sir[j];
		}
		System.out.println("Sirul initial" + Arrays.toString(siri));
		Arrays.sort(sir);
		int i = 0;
		while (i < sir.length & sir[i] < 37) {
			i++;
		}
		double[] Temperaturinormale = new double[i];
		double[] Temperaturianormale = new double[sir.length - i];
		for (int j = 0; j < Temperaturinormale.length; j++) {
			Temperaturinormale[j] = sir[j];
		}
		for (int j = 0; j < Temperaturianormale.length; j++) {
			Temperaturianormale[j] = sir[j + i];
		}
		System.out.println("Temperaturile normale sunt=" + Arrays.toString(Temperaturinormale));
		for (int j = 0; j < Temperaturinormale.length; j++) {
			for (int z = 0; z < siri.length; z++) {
				if (siri[z] == Temperaturinormale[j])
					System.out.println("Indexul pentru=" + Temperaturinormale[j] + " este=" + z);

			}

		}
		System.out.println("\n");
		System.out.println("Temperaturile anormale sunt=" + Arrays.toString(Temperaturianormale));
		for (int j = 0; j < Temperaturianormale.length; j++) {
			for (int z = 0; z < siri.length; z++) {
				if (siri[z] == Temperaturianormale[j])
					System.out.println("Indexul pentru=" + Temperaturianormale[j] + " este=" + z);

			}
		}
	}

}
