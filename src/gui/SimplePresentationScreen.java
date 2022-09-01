package gui;

import java.awt.BorderLayout;


import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import entities.Student;
import javax.swing.JTabbedPane;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.time.LocalTime;
import java.time.LocalDate;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField CampoLU;
	private JTextField CampoApellido;
	private JTextField CampoNombre;
	private JTextField CampoEmail;
	private JTextField CampoGHURL;
	private LocalDate dia;
	private LocalTime hora;
	private JLabel Foto;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\UNS\\2022 2do Cuatri\\Tecnolog\u00EDa de Programaci\u00F3n\\Workspace\\proyecto-1\\src\\images\\tdp.png"));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 308));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 584, 227);
		tabInformation = new JPanel();
		tabInformation.setToolTipText("");
		tabInformation.setPreferredSize(new Dimension(425, 250));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		contentPane.add(tabbedPane);
		
		Foto = new JLabel();
		Foto.setSize(20, 50);
		Foto.setBounds(414, 11, 148, 144);
		Foto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(studentData.getPathPhoto())).getImage().getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_SMOOTH)));
		tabInformation.add(Foto);
		
		CampoLU = new JTextField();
		CampoLU.setBounds(128, 11, 262, 20);
		CampoLU.setText(""+studentData.getId());
		tabInformation.add(CampoLU);
		CampoLU.setColumns(10);
		
		CampoApellido = new JTextField();
		CampoApellido.setBounds(128, 42, 262, 20);
		CampoApellido.setText(studentData.getLastName());
		CampoApellido.setColumns(10);
		tabInformation.add(CampoApellido);
		
		CampoNombre = new JTextField();
		CampoNombre.setBounds(128, 73, 262, 20);
		CampoNombre.setText(studentData.getFirstName());
		CampoNombre.setColumns(10);
		tabInformation.add(CampoNombre);
		
		CampoEmail = new JTextField();
		CampoEmail.setBounds(128, 104, 262, 20);
		CampoEmail.setText(studentData.getMail());
		CampoEmail.setColumns(10);
		tabInformation.add(CampoEmail);
		
		CampoGHURL = new JTextField();
		CampoGHURL.setBounds(128, 135, 262, 20);
		CampoGHURL.setText(studentData.getGithubURL());
		CampoGHURL.setColumns(10);
		tabInformation.add(CampoGHURL);
		
		JLabel lblLu = new JLabel("LU");
		lblLu.setBounds(21, 14, 46, 14);
		lblLu.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblLu);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(21, 45, 46, 14);
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(21, 76, 46, 14);
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblNombre);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(21, 107, 46, 14);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblEmail);
		
		JLabel lblGithubUrl = new JLabel("GitHub URL");
		lblGithubUrl.setBounds(21, 138, 71, 14);
		lblGithubUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		tabInformation.add(lblGithubUrl);		
		
		dia = LocalDate.now();
		hora = LocalTime.now();
		JLabel Fecha = new JLabel("Esta ventana fue generada el "+dia.getDayOfMonth()+"/"+dia.getMonthValue()+"/"+dia.getYear()+" a las "+hora.getHour()+":"+hora.getMinute()+":"+hora.getSecond());
		Fecha.setBounds(10, 243, 401, 14);
		contentPane.add(Fecha);
		Fecha.setFont(new Font("Tahoma", Font.BOLD, 11));
	}
}