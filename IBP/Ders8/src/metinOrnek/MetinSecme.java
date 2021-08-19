package metinOrnek;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MetinSecme extends JPanel{
	
	private JLabel veriEtiketi = new JLabel();
	private JTextArea textArea = new JTextArea();
	
	public MetinSecme(){
		 
		veriEtiketi.setFont(new Font("Courier", Font.BOLD, 14));
		veriEtiketi.setForeground(Color.RED);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textArea.setEditable(false);
		
		JScrollPane scroller = new JScrollPane(textArea);
		setLayout(new BorderLayout());
		add(veriEtiketi,BorderLayout.NORTH);
		add(scroller,BorderLayout.CENTER);
		
		
	}
	
	   public void textAreaYaziAta(String textVeri){
		   
		   textArea.setText(textVeri);
	   }

	   
	   public void  etiketYaziAta(String etiketVeri){
		   
		   veriEtiketi.setText(etiketVeri);
	   }
}





