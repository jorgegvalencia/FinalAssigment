package UI;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelInformation extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	public PanelInformation() {
		setLayout(null);

		JButton backButtom = new JButton("Atras");
		backButtom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backButtom.setBounds(87, 323, 89, 23);
		add(backButtom);

		textField = new JTextField();
		textField.setBounds(127, 18, 86, 20);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(127, 49, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(127, 109, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(127, 140, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(127, 171, 86, 20);
		add(textField_4);
		textField_4.setColumns(10);

		JButton btnNewButton = new JButton("To GoogleMaps");
		btnNewButton.setBounds(72, 278, 119, 23);
		add(btnNewButton);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(127, 202, 86, 20);
		add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(127, 234, 86, 20);
		add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(127, 78, 86, 20);
		add(textField_7);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 21, 67, 14);
		add(lblName);

		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(50, 55, 67, 14);
		add(lblPhone);

		JLabel lblStreetName = new JLabel("Street Name");
		lblStreetName.setBounds(50, 81, 67, 14);
		add(lblStreetName);

		JLabel label_3 = new JLabel("Postal Code");
		label_3.setBounds(50, 112, 67, 14);
		add(label_3);

		JLabel lblLatitude_1 = new JLabel("Latitude");
		lblLatitude_1.setBounds(50, 143, 67, 14);
		add(lblLatitude_1);

		JLabel lblLongitude_1 = new JLabel("Longitude");
		lblLongitude_1.setBounds(50, 177, 67, 14);
		add(lblLongitude_1);

		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(50, 205, 67, 14);
		add(lblEmail_1);

		JLabel lblAccesibility_1 = new JLabel("Accesibility");
		lblAccesibility_1.setBounds(50, 237, 67, 14);
		add(lblAccesibility_1);
	}
}