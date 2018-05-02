package graphic;

import javax.swing.*;

public class MainFrame extends JFrame {

	private final int sizeX = 1200;
	private final int sizeY = 720;
	private final String title = "Book Scheduler";
	
	
	
//	private JPanel jPanel;
	private JButton btnAdd;
	private JButton btnCalendar;
	
	MainFrame()
	{
		setTitle(title);
		setSize(sizeX, sizeY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		
		btnAdd = new JButton("Add Book");
		btnAdd.setBounds(10, 10, 100, 50);
		add(btnAdd);
		
		btnCalendar = new JButton("Calendar");
		btnCalendar.setBounds(1090, 10, 100, 50);
		add(btnCalendar);
		
	}
	
	
	
	public static void main(String[] args)
	{
		MainFrame m = new MainFrame();
	}
}
