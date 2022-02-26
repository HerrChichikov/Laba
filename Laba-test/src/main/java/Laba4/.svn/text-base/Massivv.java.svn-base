package Laba4;

import javax.swing.JLabel;

public class Massivv {
	protected static int[] mas = new int[6];
	protected static String text = "";
	public static void ms(JLabel f) {
		for(int i = 0;i<6;i++) {
			mas[i] = Random.Rand();
		}
		for(int i = 0;i<6;i++) {
			text = text + Integer.toString(mas[i]) + "; ";
		}
		try {
			f.setText(text);
			text = "";
		}
		catch (NullPointerException Astolfo) {
		}

	}
	public static int per(int i) {
		return (mas[i]);
	}
}
