package UI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Map.Entry;

import Entities.*;

public class UIGraphic extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField longitud;
	private static JTextField latitude;
	private PanelInformation info = new PanelInformation();
	
	static JButton results0;
	static JButton result1;
	static JButton result2;
	static JButton result3;
	static JButton result4;
	static JButton result5;
	
	public static JButton[] buttons = new JButton[6];
	
	/**
	 * Create the frame.
	 */
	public UIGraphic() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel JPanel_Menu = new JPanel();
		JPanel_Menu.setBackground(SystemColor.activeCaption);
		JPanel_Menu.setBounds(0, 0, 224, 56);
		contentPane.add(JPanel_Menu);
		JPanel_Menu.setLayout(null);
		
		JLabel lblLatitude = new JLabel("Latitude");
		lblLatitude.setBounds(21, 11, 53, 14);
		JPanel_Menu.add(lblLatitude);
		
		latitude = new JTextField();
		latitude.setBounds(21, 25, 86, 20);
		JPanel_Menu.add(latitude);
		latitude.setColumns(10);
		
		longitud = new JTextField();
		longitud.setBounds(117, 25, 86, 20);
		JPanel_Menu.add(longitud);
		longitud.setColumns(10);
		
		JLabel lblLongitude = new JLabel("Longitude");
		lblLongitude.setBounds(117, 11, 60, 14);
		JPanel_Menu.add(lblLongitude);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.readingRDF();
			}
		});
		btnSearch.setBounds(62, 67, 89, 23);
		contentPane.add(btnSearch);
		
		results0 = new JButton("New button");
		results0.setBounds(0, 100, 224, 42);
		contentPane.add(results0);
		results0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);	
				int t=0;
				for (Entry<Integer, Sitio> elemento : Controller.getSortedMap().entrySet()) {
				    if(t==1){
				    	PanelInformation.textField.setText((elemento.getValue().name));
				    }
				    t++;
				}
			}
		});
		
		result1 = new JButton("New button");
		result1.setBounds(0, 142, 224, 42);
		contentPane.add(result1);
		result1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		result2 = new JButton("New button");
		result2.setBounds(0, 183, 224, 42);
		contentPane.add(result2);
		result2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		result3 = new JButton("New button");
		result3.setBounds(0, 225, 224, 42);
		contentPane.add(result3);
		result3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		result4 = new JButton("New button");
		result4.setBounds(0, 266, 224, 42);
		contentPane.add(result4);
		result4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		result5 = new JButton("New button");
		result5.setBounds(0, 305, 224, 42);
		contentPane.add(result5);
		result5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
				contentPane.setVisible(false);
			}
		});
		
		buttons[0]=results0;
		buttons[1]=result1;
		buttons[2]=result2;
		buttons[3]=result3;
		buttons[4]=result4;
		buttons[5]=result5;
	}

	public static JTextField getLongitud() {
		return longitud;
	}

	public static void setLongitud(JTextField longitud) {
		UIGraphic.longitud = longitud;
	}

	public static JTextField getLatitude() {
		return latitude;
	}

	public static void setLatitude(JTextField latitude) {
		UIGraphic.latitude = latitude;
	}
}
