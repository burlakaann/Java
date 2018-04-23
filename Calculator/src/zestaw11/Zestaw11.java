package zestaw11;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class Zestaw11{
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable(){
            public void run() {
		CalculatorFrame frame = new CalculatorFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
	});
    }
}
