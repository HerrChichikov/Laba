package Laba4;

import javax.swing.*;
import java.awt.event.*;

// ����� ����������� ��������� (�������� ������� ������)
public class InfPanBut implements ActionListener {

    private JFrame InfFrame = new JFrame();

    @Override // ключевое слово, которое позволяет в дочернем классе заново создать реализацию метода родительского класса
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
    	FileChooser sss = new FileChooser();
    	Class bbb = FileChooser.class;
    	String text = "<html>Номера зачетных книжек указаны ниже:<br/> Загидуллин Рустам № 20130504<br/>" +
    			"Загидуллина Эльнара № 20130498 <br/> Иликбаева Валерия № 20130495 <br/> Сатеграеев Ильгиз № 20130337   <br/>";
        InfoPanel f = new InfoPanel("Информация", 300, 300, 100, 100, text);
        
    }


}