package IntroToHashMaps;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements MouseListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> names = new HashMap<Integer, String>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton entry = new JButton();
	JButton searchId = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();

	String id = "";
	String name = "";

	public static void main(String[] args) {

		LogSearch search = new LogSearch();

		search.setup();

	}

	void setup() {

		frame.add(panel);
		panel.add(entry);
		panel.add(searchId);
		panel.add(view);
		panel.add(remove);

		frame.setVisible(true);

		entry.setVisible(true);
		searchId.setVisible(true);
		view.setVisible(true);
		remove.setVisible(true);

		entry.setText("Entry");
		searchId.setText("Search");
		view.setText("View");
		remove.setText("Remove");

		entry.addMouseListener(this);
		searchId.addMouseListener(this);
		view.addMouseListener(this);
		remove.addMouseListener(this);

		frame.pack();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == entry) {
			
			id = JOptionPane.showInputDialog("Id Number: ", null);
			int idInt = Integer.parseInt(id);
			name = JOptionPane.showInputDialog("Name: ", null);
			
			names.put(idInt, name);
			
		}else if(e.getSource() == searchId) {
			
			String idCheck = JOptionPane.showInputDialog(null, "Id: ");
			
			int check = Integer.parseInt(idCheck);
			
			if(names.containsKey(check) == true) {
				
				JOptionPane.showMessageDialog(null, "Name: " + names.get(check));
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Empty place.");
				
			}
			
		}else if(e.getSource() == view) {
			
			String finalInt = "";
			
			for(Integer i : names.keySet()){
				
				finalInt += "Key #"+ i+ ": "+ names.get(i) +"\n";
				
				
			}
			JOptionPane.showMessageDialog(null, finalInt);
			
		}else if(e.getSource() == remove) {
			
			String ask = JOptionPane.showInputDialog(null, "Id: ");
			
			int ask2 = Integer.parseInt(ask);
			
			names.remove(ask2);
			
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
