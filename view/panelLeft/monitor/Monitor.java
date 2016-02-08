package view.panelLeft.monitor;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

public class Monitor extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4293204179287796932L;

	/**
	 * Create the panel.
	 */
	public Monitor() {
		setBackground(SystemColor.scrollbar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		//gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0};
		setLayout(gridBagLayout);
		
		JLabel lblMonitor = new JLabel("Monitor");
		GridBagConstraints gbc_lblMonitor = new GridBagConstraints();
		gbc_lblMonitor.weightx = 1.0;
		gbc_lblMonitor.anchor = GridBagConstraints.WEST;
		gbc_lblMonitor.insets = new Insets(5, 5, 5, 5);
		gbc_lblMonitor.gridx = 0;
		gbc_lblMonitor.gridy = 0;
		add(lblMonitor, gbc_lblMonitor);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\binario.png"));
		button_2.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.WEST;
		gbc_button_2.insets = new Insets(0, 2, 5, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 1;
		add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\hexa.jpg"));
		button_1.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 1;
		add(button_1, gbc_button_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\decimal.png"));
		button.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 3);
		gbc_button.gridx = 2;
		gbc_button.gridy = 1;
		add(button, gbc_button);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.weighty = 1.0;
		gbc_editorPane.weightx = 1.0;
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridheight = 0;
		gbc_editorPane.gridwidth = 4;
		gbc_editorPane.insets = new Insets(0, 5, 5, 5);
		gbc_editorPane.gridx = 0;
		gbc_editorPane.gridy = 2;
		add(editorPane, gbc_editorPane);

	}
}
