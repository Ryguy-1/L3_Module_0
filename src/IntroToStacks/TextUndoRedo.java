package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	JLabel label = new JLabel();
	String words = "";
	Stack<Character> previous = new Stack<Character>();
	String newWords = "";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {

		TextUndoRedo text = new TextUndoRedo();

		text.setup();

	}

	void setup() {
		frame.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
		panel.add(label);
		label.setVisible(true);
		frame.addKeyListener(this);
		frame.setSize(500, 800);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if(words.length()<=1) {
				
			}else {
				words = label.getText();
			
			newWords = words.substring(0, words.length() - 1);
			char c = words.charAt(words.length() - 1);
			previous.push(c);
			label.setText(newWords);
			System.out.println(newWords);
			}
		}

		else if (e.getKeyCode() == KeyEvent.VK_0) {
			if(previous.size()==0) {
				
			}else {
				
			
			newWords = newWords + previous.pop();
			label.setText(newWords);
			}
		} else {
			words = label.getText();
			words = words + e.getKeyChar();
			label.setText(words);
		}


		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
