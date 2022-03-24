package Laba4;



import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Image extends JComponent {

    BufferedImage image;

    public Image() {

        // �������� ����������� � ��������� �� �����������
        try
        {
            image = ImageIO.read(new File("img/Логотип УГАТУ.jpg"));

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

    public void paintComponent(Graphics g)
    {

        if(image == null) return;

        // ����������� ������� � ������ ������� ����.
        g.drawImage(image, 300, 0, 180, 120, null);

    }



}