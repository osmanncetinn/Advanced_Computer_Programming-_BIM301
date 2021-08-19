package tr.edu.halic.programlama.ders4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.stream.ImageInputStreamImpl;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CheckBox1 extends JFrame {

	private ImageIcon ic1 = new ImageIcon("C:\\Users\\HÝLAL\\Desktop\\ic1.jpg") ;
	private ImageIcon ic2 = new ImageIcon("C:\\Users\\HÝLAL\\Desktop\\ic2.jpg") ;
	private ImageIcon ic3 = new ImageIcon("C:\\Users\\HÝLAL\\Desktop\\ic3.jpg") ;

	private JCheckBox chb1 = new JCheckBox("Basic", ic1, false);
	private JCheckBox chb2 = new JCheckBox("Kalin", ic2, false);
	private JCheckBox chb3 = new JCheckBox("Italik", ic3, false);

	private JTextArea area = new JTextArea("Computer Programming");
	
	

	public CheckBox1() {

		Container cont = getContentPane();

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(3, 1));

		jp.add(chb1);
		jp.add(chb2);
		jp.add(chb3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(chb1);
		bg.add(chb2);
		bg.add(chb3);

		cont.setLayout(new BorderLayout());
		cont.add(jp, BorderLayout.EAST);
		cont.add(area, BorderLayout.WEST);
		chb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				System.out.println(chb1.isSelected());
				area.setFont(new Font("Courier", Font.PLAIN, 20));
				area.setForeground(Color.RED);
				area.setBackground(Color.BLACK);

			}
		});

		chb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(chb2.isSelected());
				area.setFont(new Font("Courier", Font.BOLD, 20));
				area.setForeground(Color.RED);
				area.setBackground(Color.WHITE);

			}
		});

		chb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(chb3.isSelected());
				area.setFont(new Font("Courier", Font.ITALIC, 20));
				area.setForeground(Color.WHITE);
				area.setBackground(Color.BLACK);

			}
		});

		chb1.setSelected(true);

	}

	public static void main(String[] args) {

		
		CheckBox1 cb1 = new CheckBox1();
		cb1.setTitle("My Check Box");
		cb1.setSize(600, 350);
		cb1.setLocation(500, 200);
		cb1.setVisible(true);
		cb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
