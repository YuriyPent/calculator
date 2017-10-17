package yura;

import javax.swing.*;
import java.awt.*;

/**
 * Created by yurap on 17.10.2017.
 */
public class SimpleCalculator {
    public static void main (String[] args){
        //задаем панель
        JPanel windowContent = new JPanel();
        //задаем менеджер для панели
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);
        //создаем компаненты в памяти
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");
        //добавили компоненты на панель

        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);
        //задаем фрейм и панель
        JFrame myFrame = new JFrame("My first app");
        myFrame.setContentPane(windowContent);
        //задаем размеры
        myFrame.setSize(400, 100);
        myFrame.setVisible(true);




    }

}
