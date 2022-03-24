package Laba4;

import javax.swing.*;
import javax.swing.text.PlainDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {

private int width, height;
private int x_loc, y_loc;
private int need_label, need_but, need_menu, need_box,need_fields, need_calculat;
private String title_name, label_name;
JLabel label_pic = new JLabel();
private JLabel label, label1;

private JButton ExBut = new JButton("Выход");
private JButton InfBut = new JButton("Информация");
private JButton ResultBut = new JButton("Расчитать");

private JFrame Frame;

private JMenuBar jMenuBar = new JMenuBar();
private JMenu jMenu = new JMenu("Menu");
private JMenuItem jMenuItem1 = new JMenuItem("Логотип");
private JMenuItem jMenuItem2 = new JMenuItem("Выход");
private JMenuItem jMenuItem3 = new JMenuItem("Загрузить файл и вывести содержимое");

private JTextField TextField1 = new JTextField();
private JTextField TextField2 = new JTextField();
private JTextField TextField3 = new JTextField();

private String[] items = {
"Переместить логотип УГАТУ в верхний правый угол",
"Переместить логотип УГАТУ в середину",
"Переместить логотип УГАТУ в левый верхний угол",
"Создать массив",
"Отсортировать данные в проекте24"
};

private JComboBox comboBox = new JComboBox(items);

public MainFrame(String title_name, int width, int height, int x_loc, int y_loc, int need_label, String label_name, int need_but, int need_menu,int need_box, int need_calculat){

setLabelName(label_name);
setName(title_name);
setHeight(height);
setWidth(width);
setXLoc(x_loc);
setYLoc(y_loc);
setNeedBut(need_but);
setNeedBox(need_box);
setNeedMenu(need_menu);
setNeedLabel(need_label);
setNeedCal(need_calculat);

label_pic.setIcon(new ImageIcon(getClass().getResource("/Логотип УГАТУ.jpg")));

Frame = new JFrame(this.getName());

Frame.setSize(this.getWidth(), this.getHeight());

Frame.setLocation(this.getXLoc(), this.getYLoc());
Frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
Frame.setLayout(null);
Frame.setResizable(false);

if (this.getNeedLabel() == 1) {

label = new JLabel(this.getLabelName());

label.setSize(200, 50);
label.setLocation(this.getWidth() / 2 - 100, this.getHeight() / 3);
Frame.add(label);

}

if (this.getNeedBut() == 1) {

//Button ExBut = new Button("Выход", 100, 100, 20, 20, 800);
// Frame.add(ExBut);

// JButton ExBut = new JButton("Выход");
ExBut.setLocation(20, this.getHeight() - 120 );
ExBut.setSize(100, 50);
ActionListener Exit = new ExitBut();
ExBut.addActionListener(Exit);
Frame.add(ExBut);

}

else if (getNeedBut() == 2){

ExBut.setLocation(20, this.getHeight() - 120 );
ExBut.setSize(150, 50);
ActionListener Exit = new ExitBut();
ExBut.addActionListener(Exit);
Frame.add(ExBut);

InfBut.setLocation(20, this.getHeight() - 180 );
InfBut.setSize(150, 50);
ActionListener Inf = new InfPanBut();
InfBut.addActionListener(Inf);
Frame.add(InfBut);

}

if (this.getNeedMenu() == 1) {

Frame.setJMenuBar(jMenuBar);
jMenuBar.add(jMenu);
jMenu.add(jMenuItem1);
jMenu.add(jMenuItem2);
jMenu.add(jMenuItem3);

ActionListener exitListener2 = new ExitBut();
jMenuItem2.addActionListener(exitListener2);

ActionListener listener = new FileChooser();
jMenuItem3.addActionListener(listener);

jMenuItem1.addActionListener(this);

}
if (this.getNeedBox() == 1) {

comboBox.setSize(340, 20);
comboBox.setLocation(this.getWidth() - 360, this.getHeight() - 210);
comboBox.addActionListener(this);
Frame.add(comboBox);

}

label1 = new JLabel();

if (this.getNeedCal() == 1) {
ResultBut.setLocation(250, 25);
ResultBut.setSize(100, 100);
ResultBut.addActionListener(this);

JLabel label_h = new JLabel("Высота:");
JLabel label_a = new JLabel("Сторона:");
JLabel label_n = new JLabel("Кол-во сторон:");

label_h.setLocation(60, 10);
label_h.setSize(150, 50);
Frame.add(label_h);

label_a.setLocation(60, 50);
label_a.setSize(150, 50);
Frame.add(label_a);

label_n.setLocation(25, 80);
label_n.setSize(150, 50);
Frame.add(label_n);

PlainDocument doc1 = (PlainDocument)
TextField1.getDocument();
doc1.setDocumentFilter(new DocFilter());
PlainDocument doc2 = (PlainDocument) TextField2.getDocument();
doc2.setDocumentFilter(new DocFilter());
PlainDocument doc3 = (PlainDocument) TextField3.getDocument();
doc3.setDocumentFilter(new DocFilter());

TextField1.setSize(120, 30);
TextField1.setLocation(120, 95);
TextField1.setVisible(true);

TextField2.setSize(120, 30);
TextField2.setLocation(120, 60);
TextField2.setVisible(true);

TextField3.setSize(120, 30);
TextField3.setLocation(120, 25);
TextField3.setVisible(true);

Frame.add(TextField1);
Frame.add(TextField2);
Frame.add(TextField3);
Frame.add(ResultBut);
}

Frame.setVisible(true);
label1.setSize(200, 50);
label1.setLocation(this.getWidth()/2, this.getHeight() - 150);
Frame.add(label1);

}

public int getWidth(){
return this.width;
}
public void setWidth(int width){
this.width = width;
}

public int getHeight(){

return this.height;
}
public void setHeight(int height){
this.height = height;
}

public int getXLoc(){

return this.x_loc;
}
public void setXLoc(int x_loc){
this.x_loc = x_loc;
}

public int getYLoc(){

return this.y_loc;
}
public void setYLoc(int y_loc){
this.y_loc = y_loc;
}

public void setName(String title_name){
this.title_name = title_name;
}
public String getName(){
return this.title_name;
}

public void setNeedBut(int need_but){

this.need_but = need_but;
}
public int getNeedBut(){
return this.need_but;
}

public void setNeedMenu(int need_menu){
this.need_menu = need_menu;
}
public int getNeedMenu(){
return this.need_menu;
}

public void setNeedLabel(int need_label){
this.need_label = need_label;
}
public int getNeedLabel(){
return this.need_label;
}
public void setNeedFields(int need_fields){
this.need_fields = need_fields;
}
public int getNeedFields(){
return this.need_fields;
}
public void setLabelName(String label_name){
this.label_name = label_name;
}
public String getLabelName(){
return this.label_name;
}
public void setNeedBox(int need_box){
this.need_box = need_box;
}
public int getNeedBox(){
return this.need_box;
}

public JTextField getTextField1() {
return this.TextField1;
}
public void setTextField1(JTextField textField1) {
this.TextField1 = textField1;
}
public JTextField getTextField2() {
return this.TextField2;
}
public void setTextField2(JTextField textField2) {
this.TextField2 = textField2;
}
public JTextField getTextField3() {
return this.TextField3;
}
public void setTextField3(JTextField textField3) {

this.TextField3 = textField3;
}

public void setNeedCal(int need_calculat){
this.need_calculat = need_calculat;
}

public int getNeedCal(){
return this.need_calculat;
}

@Override
public void actionPerformed(ActionEvent e) {

if (e.getSource() == jMenuItem1) {
Frame.add(label_pic);
label_pic.setSize(200, 200);
label_pic.setLocation(this.getWidth() - 150 , -50);


}
if (e.getSource() == ResultBut) {
String text = null;
String text1 = null;
String text2 = null;
String text3 = null;
double rez = 0;
if ((TextField1.getText().trim().isEmpty()) || (TextField2.getText().trim().isEmpty())||(TextField3.getText().trim().isEmpty())) {
text = "Не корректные начальные данные";
}else {
text1 = TextField1.getText();
text2 = TextField2.getText();
text3 = TextField3.getText();
int h = Integer.parseInt(text1);
int a = Integer.parseInt(text2);
int n = Integer.parseInt(text3);
if ((h == 0)||(a == 0)||(n == 0)) {
text = "Не корректные начальные данные";
} else {
rez = (n*a*a*h)/(12*Math.tan(Math.toRadians(180/n)));
text = String.valueOf(rez);
}
if (rez<=0) {
text = "Не корректные начальные данные";
}
}
InfoPanel ff = new InfoPanel("Результат", 300, 300, 100, 100, text);

}
if (e.getSource() == comboBox) {
JComboBox numberPos = (JComboBox) e.getSource();
int positionImg = numberPos.getSelectedIndex();
switch (positionImg) {
case 0:
label_pic.setLocation(this.getWidth() - 150 , -50);
break;
case 1:
label_pic.setLocation(this.getWidth() / 2 - 80 , -50);
break;
case 2:
label_pic.setLocation(0, -50);
case 3:
label1.setVisible(false);
Massivv.ms(label1);
label1.setVisible(true);
break;
case 4:
label1.setVisible(false);
BoobleSort.Sort(label1);
label1.setVisible(true);
break;
}
}
}

}