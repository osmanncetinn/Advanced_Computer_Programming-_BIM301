

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class RadioButton extends JFrame{
	
	//private ImageIcon ic1 = new ImageIcon("C:\\Users\\ulviyehacizade\\ch1.jpg");
	//private ImageIcon ic2 = new ImageIcon("C:\\Users\\ulviyehacizade\\ch2.jpg");
	//private ImageIcon ic3 = new ImageIcon("C:\\Users\\ulviyehacizade\\ch3.jpg");
	
	private JRadioButton chb1 = new JRadioButton("Sade", false);
	private JRadioButton chb2 = new JRadioButton("Kalýn",false);
	private JRadioButton chb3 = new JRadioButton("Italik", false);
	private JTextArea area = new JTextArea("Bilgisayar Programl.");
	
	
	public RadioButton (){
		
	Container cont=	getContentPane();
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
	cont.add(area, BorderLayout.CENTER);
	
	
	chb1.addActionListener(new ActionListener(
			
			)
	{

		@Override
		public void actionPerformed(ActionEvent e) {
      System.out.println(chb1.isSelected());
       area.setFont(new Font("Courier", Font.PLAIN, 20));
       area.setForeground(Color.BLUE);
       area.setBackground(Color.PINK);
       
		}
		
	});
	
	
	chb2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
		System.out.println(chb2.isSelected());
       area.setFont(new Font("Courier", Font.BOLD, 20));
       area.setForeground(Color.RED);
       area.setBackground(Color.LIGHT_GRAY);
			
		}
		
	});
		
	chb3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(chb3.isSelected());
   area.setFont(new Font("Courier", Font.ITALIC, 20));
   area.setForeground(Color.GREEN);
   area.setBackground(Color.LIGHT_GRAY);
		}
		
	});
	
	
	chb1.setSelected(true);
	}

	public static void main(String[] args) {


		RadioButton cb1 = new RadioButton();
		cb1.setTitle("My Check Box");
		cb1.setSize(600, 350);
		cb1.setLocation(500, 200);
		cb1.setVisible(true);
		cb1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
