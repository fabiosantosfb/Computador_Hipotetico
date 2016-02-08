package view.panelLeft.editorProgram;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ImageIcon;
import java.awt.Insets;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import controler.compilador.AutoNivel;
import controler.compilador.BaixoNivel;
import controler.editorAssembly.EditorAssembly;
import view.panelRigth.memoria.Memoria;

import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class EditorPrograma extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1821525244740161840L;
	private static EditorPrograma INSTANCE_EDITOR;
	
	public JEditorPane editorPane;
	private JRadioButton baixoNivel, autoNivel;
	private String getComboB = null, getRadioB = null;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	
	public static EditorPrograma getInstance(){
		if(INSTANCE_EDITOR == null){
			return INSTANCE_EDITOR = new EditorPrograma();
		} else {
			return INSTANCE_EDITOR;
		}
		
		
	}
	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public EditorPrograma() {
		setBackground(SystemColor.scrollbar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {27, 27, 0};
		gridBagLayout.rowHeights = new int[] {30, 30, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 1.0};
		setLayout(gridBagLayout);
		
		JLabel lblEditor = new JLabel("Editor");
		GridBagConstraints gbc_lblEditor = new GridBagConstraints();
		gbc_lblEditor.anchor = GridBagConstraints.WEST;
		gbc_lblEditor.insets = new Insets(5, 5, 5, 5);
		gbc_lblEditor.gridx = 0;
		gbc_lblEditor.gridy = 0;
		add(lblEditor, gbc_lblEditor);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editorPane.setEditable(true);
			}
		});
		button_1.setToolTipText("Editar");
		button_1.setBackground(SystemColor.scrollbar);
		button_1.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\icon_editar_assembly"));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(5, 0, 5, 5);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 0;
		add(button_1, gbc_button_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Memoria.getInstance().table.getRowCount() <= 0){
					JOptionPane.showMessageDialog(null, "Memoria sem celulas!");
				} else {
					if(autoNivel.getSelectedObjects() != null){
						//AutoNivel autoNivel = new AutoNivel();
						
						int coutRow = editorPane.getCaretPosition(); //contidade de caracter aparti da positaçao do foco do mouse
						String caract = editorPane.getText();
						
						for(int i=0; i<=coutRow; i++){
							
						}
						JOptionPane.showMessageDialog(null, "linhas "+coutRow);
					} else if(baixoNivel.getSelectedObjects() != null){
						//BaixoNivel baixoNivel = new BaixoNivel();

					}
				}
				
			}
		});
		button.setToolTipText("Compilar");
		button.setBackground(SystemColor.scrollbar);
		button.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\icon_editar_assembly"));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.BOTH;
		gbc_button.insets = new Insets(5, 5, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 0;
		add(button, gbc_button);
		
		autoNivel = new JRadioButton("A");
		autoNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarEditorPanel();
			}
		});
		autoNivel.setSelected(true);
		autoNivel.setToolTipText("Auto N\u00EDvel");
		autoNivel.setBackground(SystemColor.scrollbar);
		autoNivel.setFont(new Font("Arial", Font.PLAIN, 11));
		GridBagConstraints gbc_rdbtnA = new GridBagConstraints();
		gbc_rdbtnA.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnA.gridx = 0;
		gbc_rdbtnA.gridy = 1;
		add(autoNivel, gbc_rdbtnA);
		
		baixoNivel = new JRadioButton("B");
		baixoNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editarEditorPanel();
			}
		});
		baixoNivel.setToolTipText("Baixo N\u00EDvel");
		baixoNivel.setFont(new Font("Arial", Font.PLAIN, 11));
		baixoNivel.setBackground(SystemColor.scrollbar);
		
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnNewRadioButton.gridx = 1;
		gbc_rdbtnNewRadioButton.gridy = 1;
		add(baixoNivel, gbc_rdbtnNewRadioButton);
		
		ButtonGroup nivelType = new ButtonGroup();
		nivelType.add(autoNivel);
		nivelType.add(baixoNivel);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				editarEditorPanel();
			}
		});
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setBackground(SystemColor.scrollbar);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Programa", "Somar", "Multiplicar"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 1;
		add(comboBox, gbc_comboBox);
		
		
		editorPane = new JEditorPane();
		editorPane.setEditable(true);
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.insets = new Insets(0, 3, 5, 3);
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridwidth = 5;
		gbc_editorPane.gridx = 0;
		gbc_editorPane.gridy = 1;
		add(editorPane, gbc_editorPane);
		
		
		JScrollPane scrollPane = new JScrollPane(editorPane);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.weightx = 1.0;
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridheight = 0;
		gbc_scrollPane.insets = new Insets(0, 3, 0, 3);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 2;
		add(scrollPane, gbc_scrollPane);
	}
	
	private void editarEditorPanel(){
		getComboB = comboBox.getSelectedItem().toString();
		
		if(autoNivel.getSelectedObjects() != null){
			getRadioB = autoNivel.getText();
		}else if(baixoNivel.getSelectedObjects() != null){
			getRadioB = baixoNivel.getText();
		}
		//CRIAR OBJETO eDITORaSSEMBLY
		EditorAssembly editor = new EditorAssembly(getRadioB, getComboB);
		editorPane.setEditable(false);
		editorPane.setText(editor.getPrePrograma());
	}
}
