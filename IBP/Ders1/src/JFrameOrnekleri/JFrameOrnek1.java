package JFrameOrnekleri;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
public class JFrameOrnek1 {

	public static void main(String[] args) {

    JFrame  cerceve = new JFrame("My Frame");
    
    cerceve.setSize(300, 200);
    //cerceve.setLocation(500, 150);
    cerceve.setLocationRelativeTo(null);
    cerceve.setLayout(new FlowLayout(FlowLayout.CENTER,30, 20));
    JButton buton = new JButton("OK");
    cerceve.add(buton);
    
    JButton buton2 = new JButton("HAYIR");
    cerceve.add(buton2);
    
    cerceve.setVisible(true);
    cerceve.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
