/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zestaw11;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class CalculatorFrame extends JFrame{
    public CalculatorFrame() {
		setTitle("Calculator");
		CalculatorPanel panel = new CalculatorPanel();
		add(panel);
		pack();
	}
}
