
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class frame extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8703045023120223896L;
	private JButton schliessen;
	private JButton einstellungen;
	private JButton info;
	private JButton anmelden;
	private JButton ende;
	
	public static void main(String[] args) {
		
		frame frame = new frame("Menü");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public frame(String title){
		schliessen = new JButton("Spiel starten");
		schliessen.setBounds(160,40,160,40);
		schliessen.addActionListener(this);
		add(schliessen);
		
		anmelden = new JButton("Anmelden");
		anmelden.setBounds(160,100,160,40);
		anmelden.addActionListener(this);
		add(anmelden);
		
		einstellungen = new JButton("Einstellungen");
		einstellungen.setBounds(160,160,160,40);
		einstellungen.addActionListener(this);
		add(einstellungen);
		
		info = new JButton("Info");
		info.setBounds(160,220,160,40);
		info.addActionListener(this);
		add(info);
		
		ende = new JButton("Ende");
		ende.setBounds(160,280,160,40);
		ende.addActionListener(this);
		add(ende);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == schliessen) {
			fenster();
		}
		
		if(e.getSource() == einstellungen){
			einstellungen();
		}
		
		if(e.getSource() == anmelden){
			anmelden();
		}
		
		if(e.getSource() == info) {
			Object[] options= { "Ok" };
			JOptionPane.showOptionDialog(null, "Programmiert von Mertero", "Informationen", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,options,options[0]);
		}
		
		if(e.getSource() == ende){
			System.exit(0);
		}
		
	}
	
	public static void fenster(){
		JFrame fenster = new JFrame();
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setSize(650, 350);
		fenster.setResizable(false);
		
		fenster.setVisible(true);
		fenster.add(new gui());
	}
	
	public static void einstellungen(){
		JFrame einstellungen = new JFrame();
		einstellungen.setSize(650, 350);
		
		einstellungen.setVisible(true);
	}
	
	public static void anmelden(){
		JFrame anmelden = new JFrame();
		anmelden.setSize(350, 350);
		anmelden.setVisible(true);
		
		JPanel panel = new JPanel();
		
		JLabel label = new JLabel("Name");
        panel.add(label);
		
		JTextField name = new JTextField("David",14);
		name.setForeground(Color.WHITE);
		name.setBackground(Color.DARK_GRAY);
		panel.add(name);
		
		JButton buttonAnmelden = new JButton("Anmelden");
		panel.add(buttonAnmelden);
		
		anmelden.add(panel);
		
	}

}
