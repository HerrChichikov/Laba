package Laba4;

import javax.swing.JLabel;
import java.util.Arrays;

class BoobleSort {
    protected static int[] mas = new int[6];
    protected static String text = "";
	public static void Sort(JLabel e) {
		for(int i = 0;i<6;i++) {
			mas[i] = Massivv.per(i);
		}
		
		// СОРТИРОВКА
		boolean isSorted = false;
		int buf;
		while(!isSorted) {
		isSorted = true;
		for (int i = 0; i < mas.length-1; i++) {
		if(mas[i] > mas[i+1]){
		isSorted = false;

		buf = mas[i];
		mas[i] = mas[i+1];
		mas[i+1] = buf;
				}
			}
		}
		// Ну или можно отсортировать так
		// Arrays.sort(mas);
		
		for(int i = 0;i<6;i++) {
			text = text + Integer.toString(mas[i]) + "; ";
		}
		if (mas[0] == 0 ) {
			text = "Массив еще не создан!";
		}
		try {
			e.setText(text);
			text = "";
		}
		catch (NullPointerException BBPE) {
		}
	}
}
