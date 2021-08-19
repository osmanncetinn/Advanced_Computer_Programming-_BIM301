package metinOrnek;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class LayoutOrnek extends JFrame {
	
	public LayoutOrnek(){
		
		super("Layoutlar");
		setSize(500, 400);
		JDesktopPane desktop = new JDesktopPane();
		getContentPane().add(desktop);
		
		JInternalFrame fr1 = new JInternalFrame("FlowLayout", true, true);
		fr1.setBounds(10, 10, 150, 150);
		Container c = fr1.getContentPane();
		c.setLayout(new FlowLayout());
		fr1.add(new JButton("1"));
		fr1.add(new JButton("2"));
		fr1.add(new JButton("3"));
		fr1.add(new JButton("4"));
		desktop.add(fr1);
		
		JInternalFrame fr2 = new JInternalFrame("GridLayout", true, true);
		fr2.setBounds(170, 10, 150, 150);
		 c = fr2.getContentPane();
		c.setLayout(new GridLayout(2, 2));
		fr2.add(new JButton("1"));
		fr2.add(new JButton("2"));
		fr2.add(new JButton("3"));
		fr2.add(new JButton("4"));
		desktop.add(fr2);
		
		
		JInternalFrame fr3 = new JInternalFrame("BorderLayout", true, true);
		fr3.setBounds(330, 10, 150, 150);
		c = fr3.getContentPane();
		c.setLayout(new BorderLayout());
		fr3.add(new JButton("1"), BorderLayout.NORTH);
		fr3.add(new JButton("2"), BorderLayout.WEST);
		fr3.add(new JButton("3"), BorderLayout.CENTER);
		fr3.add(new JButton("4"), BorderLayout.EAST);
		desktop.add(fr3);
		
		
		
		JInternalFrame fr4 = new JInternalFrame("BoxLayout -X", true, true);
		fr4.setBounds(10, 170, 250, 120);
		 c = fr4.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		fr4.add(new JButton("1"));
		
		fr4.add(new JButton("2"));
		fr4.add(new JButton("3"));
		fr4.add(new JButton("4"));
		desktop.add(fr4);
		
		fr1.show();
		fr2.show();
		fr3.show();
		fr4.show();
		
		
		
	}
	

	public static void main(String[] args) {

		LayoutOrnek frame = new LayoutOrnek() ;
		frame.setVisible(true);

	}

}
