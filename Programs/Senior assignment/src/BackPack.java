
import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.io.IOException;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
/*
 * Kevin Leary
 * 
 * Dont forget your backpack!
 * 
 */

public class BackPack extends JFrame implements ActionListener {
	
	private static JPanel pane1 = new JPanel();		//new GridLayout(0,2,0,0)
	
	private BufferedImage image;
	
	//private JTextField inField = new JTextField();
	private String messages[] = {"Almost forgot that!", "Can't leave without it!", "Thank Goodness!",
			"You're gunna need this!", "Almost done packing!", "You're finished! Hope it all fits in your car!"
					+ " Good Luck at School!"
	};
	
	private static String items[] = {"Water Bottle", "School Supplies", "Lenovo", "HTC One M9", "Bible", 
		"Car", "The Stash", "3DS", "Smash", "More Smash", "Balling Shoes", "Non-Balling Shoes",
		"All the rest of the shoes", "Fresh Clothes", "Some Old Work", "Java", "Backpack",
		"Toothbrush", "More Technology", "Penny Board"
	};
	
	private static JCheckBox boxes[];
	
	private JButton button = new JButton("Done?");
	
	private int clickcount;
	
	/*public BackPack(){
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/backpack.png"));
		} catch (IOException e){
			e.printStackTrace();
		}
		
		repaint();
		
	}*/
	
	public BackPack(String title){
		
		GridLayout g1 = new GridLayout(0,2);
		GridLayout g2 = new GridLayout(0,1);
		
		pane1.setLayout(g1);
		boxes = new JCheckBox[items.length];
		
		//pane.setBorder(new EmptyBorder(10, 10, 10, 10));
		//pane.setBackground(Color.WHITE);
		setContentPane(pane1);
		
		for(int i = 0; i < items.length; i++){
			setCheckBoxes(i);
		}
		
		pane1.setLayout(g1);
		
		pane1.add(button);
		
		setSize(840, 680);
		setResizable(true);
		setTitle(title);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
		boxes[0].addActionListener(this);
		boxes[5].addActionListener(this);
		boxes[9].addActionListener(this);
		boxes[12].addActionListener(this);
		boxes[18].addActionListener(this);
		button.addActionListener(this);
		
		
	}
	
	public static void main(String[] args) {
		
		//createWindow();
		BackPack b = new BackPack("Don't Forget Your... ");
		
		//drawImage(g, picture);
		 //`JFrame frame = new BackPack("Don't");
		//b.addComps();
		
		

	}	
	
	public static void setCheckBoxes(int i){

		boxes[i] = new JCheckBox(items[i]);
		
		//if(i % 2 == 0)
			//boxes[i].setBorder(new EmptyBorder(0,0,0,0));
		
		//pane.setLocation(0, i * 100);
        
        pane1.add(boxes[i]);  
       // pane.setLocation(i, i *30);
        
	}
	
	/*public void paint(Graphics g){
		g.drawImage(image, 100, 100, null);
	}*/
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == boxes[0]){
			
			clickcount++;
			
			//if (clickcount % 2 != 0){
			
				//JLabel label = new JLabel(messages[0]);
				JPopupMenu pop = new JPopupMenu();
				
				JMenuItem item = new JMenuItem(messages[0]);
				
				pop.add(item);
				//setVisible(true);
				
			//}
				
		}
		
	
	if(e.getSource() == boxes[5]){
		
		clickcount++;
		
		if (clickcount % 2 != 0){
		
			JLabel label = new JLabel(messages[1]);
		
			add(label);
			setVisible(true);
		}
			
	}
	
	if(e.getSource() == boxes[9]){
		
		clickcount++;
		
		if (clickcount % 2 != 0){
		
			JLabel label = new JLabel(messages[2]);
		
			add(label);
			setVisible(true);
		}
			
	}
	
	if(e.getSource() == boxes[9]){
		
		clickcount++;
		
		if (clickcount % 2 != 0){
		
			JLabel label = new JLabel(messages[3]);
		
			add(label);
			setVisible(true);
		}
			
	}
	
	if(e.getSource() == boxes[12]){
		
		clickcount++;
		
		if (clickcount % 2 != 0){
		
			JLabel label = new JLabel(messages[4]);
		
			add(label);
			setVisible(true);
		}
			
	}
	
	if(e.getSource() == boxes[18]){
		
		clickcount++;
		
		if (clickcount % 2 != 0){
		
			JLabel label = new JLabel(messages[2]);
		
			add(label);
			setVisible(true);
		}
			
	}
	
	if(e.getSource() == button){
		
		JLabel label = new JLabel(messages[5]);
		
		add(label);
		setVisible(true);
	}
	
	
	}
}
