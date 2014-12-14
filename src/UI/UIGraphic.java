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
import Entities.*;

public class UIGraphic extends JFrame {

	private JPanel contentPane;
	private static JTextField longitud;
	private static JTextField latitude;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

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
//				Controller.getDistance();
				Controller.readingRDF();
			}
		});
		btnSearch.setBounds(62, 67, 89, 23);
		contentPane.add(btnSearch);
		
		JButton results0 = new JButton("New button");
		results0.setBounds(0, 100, 224, 42);
		contentPane.add(results0);
		
		JButton result1 = new JButton("New button");
		result1.setBounds(0, 142, 224, 42);
		contentPane.add(result1);
		
		JButton result2 = new JButton("New button");
		result2.setBounds(0, 183, 224, 42);
		contentPane.add(result2);
		
		JButton result3 = new JButton("New button");
		result3.setBounds(0, 225, 224, 42);
		contentPane.add(result3);
		
		JButton result4 = new JButton("New button");
		result4.setBounds(0, 266, 224, 42);
		contentPane.add(result4);
		
		JButton result5 = new JButton("New button");
		result5.setBounds(0, 305, 224, 42);
		contentPane.add(result5);
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
