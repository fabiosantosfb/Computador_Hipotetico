package view.panelRigth.memoria;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import controler.memoria.TableMemory;
import view.CustonMemoria;

import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Memoria extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6871450492112087074L;
	private static final DefaultTableModel modelTable = new DefaultTableModel();
	private static Memoria INSTANCE_MEMORIA;
	public JTable table;
	
	/**
	 * Instancia da classe memoria
	 * @return
	 */
    public static Memoria getInstance() {
    	if(INSTANCE_MEMORIA == null){
    		return INSTANCE_MEMORIA = new Memoria();
    	} else {
    		return INSTANCE_MEMORIA;
    	}
        
    }

	/**
	 * Create the panel.
	 */
	public Memoria() {

		setBackground(SystemColor.scrollbar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{2.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblMemria = new JLabel("Mem\u00F3ria");
		GridBagConstraints gbc_lblMemria = new GridBagConstraints();
		gbc_lblMemria.anchor = GridBagConstraints.WEST;
		gbc_lblMemria.gridwidth = 2;
		gbc_lblMemria.insets = new Insets(5, 5, 5, 5);
		gbc_lblMemria.gridx = 0;
		gbc_lblMemria.gridy = 0;
		add(lblMemria, gbc_lblMemria);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustonMemoria memoria = new CustonMemoria();
				memoria.setResizable(false);
				memoria.setLocationRelativeTo(null);
				memoria.setVisible(true);
			}
		});
		button_1.setBackground(SystemColor.scrollbar);
		button_1.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\icon_editar_assembly"));
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(5, 0, 5, 5);
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 0;
		add(button_1, gbc_button_1);
		
		JButton button = new JButton("");
		button.setBackground(SystemColor.scrollbar);
		button.setIcon(new ImageIcon("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\icon_editar_assembly"));
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(5, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 0;
		add(button, gbc_button);
		
		table = new JTable(modelTable);
		modelTable.addColumn("END");
		modelTable.addColumn("DADO");
		table.getColumnModel().getColumn(0).setPreferredWidth(20);
		table.getColumnModel().getColumn(1).setPreferredWidth(80);
		
		table.setRowSelectionAllowed(false);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		GridBagConstraints gbc_scrollPane_memoria = new GridBagConstraints();
		gbc_scrollPane_memoria.weightx = 0.01;
		gbc_scrollPane_memoria.gridwidth = 4;
		gbc_scrollPane_memoria.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_memoria.anchor = GridBagConstraints.NORTH;
		gbc_scrollPane_memoria.insets = new Insets(0, 5, 5, 5);
		gbc_scrollPane_memoria.gridx = 0;
		gbc_scrollPane_memoria.gridy = 1;
		add(scrollPane, gbc_scrollPane_memoria);
		
		JRadioButton rdbtnMaquina = new JRadioButton("Maquina");
		rdbtnMaquina.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_rdbtnMaquina = new GridBagConstraints();
		gbc_rdbtnMaquina.gridwidth = 2;
		gbc_rdbtnMaquina.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnMaquina.gridx = 0;
		gbc_rdbtnMaquina.gridy = 2;
		add(rdbtnMaquina, gbc_rdbtnMaquina);
		
		JRadioButton rdbtnAssembly = new JRadioButton("Assembly");
		rdbtnAssembly.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_rdbtnAssembly = new GridBagConstraints();
		gbc_rdbtnAssembly.gridwidth = 2;
		gbc_rdbtnAssembly.insets = new Insets(0, 0, 0, 5);
		gbc_rdbtnAssembly.gridx = 2;
		gbc_rdbtnAssembly.gridy = 2;
		add(rdbtnAssembly, gbc_rdbtnAssembly);
		
		ButtonGroup memoryType = new ButtonGroup();
		memoryType.add(rdbtnMaquina);
		memoryType.add(rdbtnAssembly);
	}
	/*########################### FUNÇÃO CELULAS MEMORIA ############################# */
	public void setMemoria(int end){
		TableMemory.setCelula(modelTable, end);
		MonitorMemoria.getInstance();
		MonitorMemoria.lblMb.setText(Integer.toString(end)+" Mb");
	
	}
}
