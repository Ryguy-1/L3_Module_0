package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.setup();

	}

	void setup() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		frame.setBounds(400, 400, 200, 100);

		add.setVisible(true);
		add.setText("Add Name");
		add.addActionListener(this);

		view.setVisible(true);
		view.setText("View Names");
		view.addActionListener(this);

		panel.add(add);
		panel.add(view);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		

		if (add == buttonPressed) {
			String addName = JOptionPane.showInputDialog("Name:");
			names.add(addName);
		} else if (view == buttonPressed) {
			
			for (int i = 0; i < names.size(); i++) {
				System.out.println("Guest #" + i + " " + names.get(i));
			}

		}

	}

}
