package Laba4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPanel extends JFrame implements ActionListener {

    private int width, height;
    private int x_loc, y_loc;
    private String name_1;
    private String title_name;
    private JButton BackBut = new JButton("Назад"); 
    private JFrame InfFrame;


    public InfoPanel(String title_name, int width, int height, int x_loc, int y_loc, String name_1) {

        setPanName(title_name); //
        setHeight(height);
        setWidth(width);
        setXLoc(x_loc);
        setYLoc(y_loc);
        setName1(name_1);

        InfFrame = new  JFrame(this.getPanName());

        JLabel stud1 = new JLabel(this.getName1());
 
        InfFrame.setSize(this.getWidth(), this.getHeight());
        InfFrame.setLocation(this.getXLoc(), this.getYLoc());
        InfFrame.setLayout(null);
        InfFrame.setResizable(false);

        BackBut.setLocation(this.getWidth() / 2, this.getHeight() / 2);
        BackBut.setSize(100, 50);
        InfFrame.add(BackBut);
        BackBut.addActionListener(this);
        
        stud1.setSize(400, 150);
        stud1.setLocation(this.getWidth() / 8, this.getHeight() / 2 - 150);
        InfFrame.add(stud1);

        InfFrame.setVisible(true);
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getXLoc() {

        return this.x_loc;
    }

    public void setXLoc(int x_loc) {
        this.x_loc = x_loc;
    }

    public int getYLoc() {

        return this.y_loc;
    }

    public void setYLoc(int y_loc) {
        this.y_loc = y_loc;
    }

    public void setPanName(String title_name) {
        this.title_name = title_name;
    }

    public String getPanName() {
        return this.title_name;
    }

    public void setName1(String name_1) {
        this.name_1 = name_1;
    }

    public String getName1() {
        return this.name_1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        InfFrame.setVisible(false);
        InfFrame.dispose();
    }
}
