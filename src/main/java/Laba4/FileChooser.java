package Laba4;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//import javax.swing.JDialog;
import javax.swing.JFileChooser;
//import java.awt.event.*;

//класс реализующий слушатель (ожидания нажатия кнопки)
public class FileChooser implements ActionListener {

@Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
		String text = "<html>";
		JFileChooser fileopen = new JFileChooser();
		int ret = fileopen.showDialog(null, "Открыть файл");                
		if (ret == JFileChooser.APPROVE_OPTION) {
		    File file = fileopen.getSelectedFile();
		    try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String textL = null;
				while ((textL = br.readLine()) != null) {
					text = text + textL + "<br/>";
					
				}
			} catch (IOException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				
			}
		    
		}
		InfoPanel ff = new InfoPanel("Информация", 300, 300, 100, 100, text);
	}

}