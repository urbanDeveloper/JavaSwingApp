package gui;
import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	//Constructor
	public TextPanel(){
		textArea = new JTextArea();
		
		setLayout(new BorderLayout());
		//scroll plane embedded
		add(new JScrollPane(textArea), BorderLayout.CENTER);
		
		
	}
	
	public void appendText(String text){
		textArea.append(text);
		
	}
	
	
}
