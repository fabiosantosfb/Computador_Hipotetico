package view.panelLeft.calculator;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculadora extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5822970010699640515L;

	/**
	 * Create the panel.
	 */
	public Calculadora() {
		setBackground(SystemColor.scrollbar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblCalculadora = new JLabel("Calculadora");
		GridBagConstraints gbc_lblCalculadora = new GridBagConstraints();
		gbc_lblCalculadora.anchor = GridBagConstraints.WEST;
		gbc_lblCalculadora.gridwidth = 2;
		gbc_lblCalculadora.insets = new Insets(5, 5, 0, 0);
		gbc_lblCalculadora.gridx = 0;
		gbc_lblCalculadora.gridy = 0;
		add(lblCalculadora, gbc_lblCalculadora);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.textHighlightText);
		editorPane.setEditable(false);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.gridheight = 2;
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridwidth = 4;
		gbc_editorPane.insets = new Insets(5, 5, 5, 5);
		gbc_editorPane.gridx = 0;
		gbc_editorPane.gridy = 1;
		add(editorPane, gbc_editorPane);
		
		JButton button_8 = new JButton("7");
		button_8.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.anchor = GridBagConstraints.EAST;
		gbc_button_8.insets = new Insets(0, 3, 5, 5);
		gbc_button_8.gridx = 0;
		gbc_button_8.gridy = 3;
		add(button_8, gbc_button_8);
		
		JButton button_9 = new JButton("8");
		button_9.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 1;
		gbc_button_9.gridy = 3;
		add(button_9, gbc_button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 2;
		gbc_button_10.gridy = 3;
		add(button_10, gbc_button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_11.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 4);
		gbc_button_11.gridx = 3;
		gbc_button_11.gridy = 3;
		add(button_11, gbc_button_11);
		
		JButton button_5 = new JButton("4");
		button_5.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.anchor = GridBagConstraints.EAST;
		gbc_button_5.insets = new Insets(0, 3, 5, 5);
		gbc_button_5.gridx = 0;
		gbc_button_5.gridy = 4;
		add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 1;
		gbc_button_6.gridy = 4;
		add(button_6, gbc_button_6);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_7 = new JButton("6");
		button_7.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 2;
		gbc_button_7.gridy = 4;
		add(button_7, gbc_button_7);
		button_12.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_12 = new GridBagConstraints();
		gbc_button_12.insets = new Insets(0, 0, 5, 4);
		gbc_button_12.anchor = GridBagConstraints.NORTH;
		gbc_button_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_12.gridx = 3;
		gbc_button_12.gridy = 4;
		add(button_12, gbc_button_12);
		
		JButton button_1 = new JButton("1");
		button_1.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.EAST;
		gbc_button_1.insets = new Insets(0, 3, 5, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 5;
		add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("2");
		button_2.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 1;
		gbc_button_2.gridy = 5;
		add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("3");
		button_3.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 5;
		add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("=");
		button_4.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 4);
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 5;
		add(button_4, gbc_button_4);
		
		JButton button = new JButton("0");
		button.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.EAST;
		gbc_button.insets = new Insets(0, 3, 10, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 6;
		add(button, gbc_button);
		
		JButton btnC = new JButton("c");
		btnC.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnC.insets = new Insets(0, 0, 10, 5);
		gbc_btnC.gridx = 1;
		gbc_btnC.gridy = 6;
		add(btnC, gbc_btnC);
		

	}

}
