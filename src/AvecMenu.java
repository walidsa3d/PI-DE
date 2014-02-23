
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hejer
 */
public class AvecMenu extends JFrame {
 AvecMenu() {
	Ardoise ardoise = new Ardoise();
	JMenuBar barreMenu = new BarreMenu(ardoise);

	setJMenuBar(barreMenu);	
	add(ardoise, BorderLayout.CENTER);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocation(100, 100);
	pack();
	setVisible(true);
 
 }
 
}
class EssaiAvecMenu extends JFrame {
	public static void main(String[] arg) {
	new AvecMenu();
	}
}

