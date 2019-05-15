import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gui extends JPanel implements ActionListener{
	
	Image img;
	int key;
	int lauf;
	int nx,nx2;
	int x_bild;
	Timer time;
	int anzahl = 0;
	int anzahl2 = 0;
	
	public gui() {
		
		
		nx = 0;
		nx2 = 650;
		key = 0;
		lauf = 0;
		setFocusable(true);
		ImageIcon u = new ImageIcon("C:/Users/David/Pictures/Screenshot_3.png");
		img = u.getImage();
		addKeyListener(new AL());
		time = new Timer(5,this);
		time.start();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		bewegen();
		repaint();
	}
	
	public void paint(Graphics g){
		
		super.paint(g);
		Graphics2D f2 = (Graphics2D)g;
		
		
		if(getXBild() == 510 +(anzahl * 2350)){
			anzahl += 1;
			nx = 0;
		}
		
		if(getXBild() == 1690 + (anzahl2 * 2350)){
			anzahl2 += 1;
			nx2 = 0;
		}
		
		if(getXBild() >= 510){
			f2.drawImage(img, 685-nx, 0, null);
		}
		
		f2.drawImage(img,685-nx2,0,null);
	}
	
	private int getXBild() {
		return x_bild;
	}

	public void bewegen() {
		x_bild += lauf;
		
		nx += lauf;
		nx2 += lauf;
	}


	
	private class AL extends KeyAdapter{
		public AL(){
			
		}
		
		
		public void keyPressed(KeyEvent e){
			key = e.getKeyCode();
			
			if(key == KeyEvent.VK_RIGHT){
				lauf = 2;
			}
			
			if(key == KeyEvent.VK_LEFT){
				lauf = -2;
			}
		}
		
		
		public void keyReleased(KeyEvent e) {
			key = e.getKeyCode();
			
			if(key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
				lauf = 0;
			}
			
		}
		

	}

}
