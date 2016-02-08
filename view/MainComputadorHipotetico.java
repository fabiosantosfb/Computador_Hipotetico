package view;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controler.instance.Factory;
import view.panelLeft.calculator.Calculadora;
import view.panelLeft.editorProgram.EditorPrograma;
import view.panelLeft.monitor.Monitor;
import view.panelRigth.memoria.Memoria;
import view.panelRigth.memoria.MonitorMemoria;
import view.panelTop.menur.MenurBar;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class MainComputadorHipotetico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3111705688133822229L;
	private JPanel contentPane;
	private static MainComputadorHipotetico main;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main = Factory.getInstance();
					main.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainComputadorHipotetico() {
		super("Computador Hipotético :: Jadi");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\fabiano\\Documents\\computadorHipotetico\\ComputadorHipotetico\\src\\image\\icon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 3, 3, 3));
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 498, 0};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.005};
		contentPane.setLayout(gbl_contentPane);
		
		/**
		 *######################### PAINEL TOP MENUR ###########################
		**/
		JPanel panelTop = new JPanel();
		panelTop.setBackground(SystemColor.scrollbar);
		
		GridBagConstraints gbc_panelTop = new GridBagConstraints();
		gbc_panelTop.weightx = 1.0;
		gbc_panelTop.gridwidth = 3;
		gbc_panelTop.insets = new Insets(0, 0, 5, 0);
		gbc_panelTop.fill = GridBagConstraints.BOTH;
		gbc_panelTop.gridx = 0;
		gbc_panelTop.gridy = 0;
		contentPane.add(panelTop, gbc_panelTop);
		
		GridBagLayout gbl_panelTop = new GridBagLayout();
		panelTop.setLayout(gbl_panelTop);
		
		// INSTACIAR MENUR
		MenurBar menur = new MenurBar();
		GridBagLayout gridBagLayout = (GridBagLayout) menur.getLayout();
		gridBagLayout.rowHeights = new int[] {30, 10};
		menur.setBackground(SystemColor.scrollbar);
		
		GridBagConstraints gbc_Menur = new GridBagConstraints();
		gbc_Menur.anchor = GridBagConstraints.SOUTHWEST;
		gbc_Menur.weightx = 1.0;
		panelTop.add(menur, gbc_Menur);
		/* ######################## FIM PAINEL TOP ###########################*/
		
		/**
		 *######################### INICIO DO PAINEL LEFT ##################
		**/
		JPanel panelLeft = new JPanel();
		panelLeft.setBackground(Color.WHITE);
		
		GridBagConstraints gbc_panelLeft = new GridBagConstraints();
		gbc_panelLeft.fill = GridBagConstraints.BOTH;
		gbc_panelLeft.insets = new Insets(0, 0, 0, 5);
		gbc_panelLeft.gridx = 0;
		gbc_panelLeft.gridy = 1;
		contentPane.add(panelLeft, gbc_panelLeft);
		
		GridBagLayout gbl_panelLeft = new GridBagLayout();
		gbl_panelLeft.columnWidths = new int[] {0};
		gbl_panelLeft.rowHeights = new int[] {0, 0, 0};
		gbl_panelLeft.columnWeights = new double[]{1.0};
		gbl_panelLeft.rowWeights = new double[]{0.88, 0.01, 0.01};
		panelLeft.setLayout(gbl_panelLeft);
		
		// INSTANCIA DA CLASSE EDITOR DE PROGRAMA
		
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.VERTICAL;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		panelLeft.add(EditorPrograma.getInstance(), gbc_panel);
		
		//INSTANCIA DA CLASSE CALCULADORA
		Calculadora calculadora = new Calculadora();
		
		GridBagConstraints gbc_panelCalculadora = new GridBagConstraints();
		gbc_panelCalculadora.insets = new Insets(5, 0, 0, 0);
		gbc_panelCalculadora.fill = GridBagConstraints.BOTH;
		gbc_panelCalculadora.gridx = 0;
		gbc_panelCalculadora.gridy = 1;
		panelLeft.add(calculadora, gbc_panelCalculadora);
		
		//INSTACIA DA CLASSE MONITOR
		Monitor monitor = new Monitor();
		
		GridBagConstraints gbc_panelMonitor = new GridBagConstraints();
		gbc_panelMonitor.ipady = 50;
		gbc_panelMonitor.fill = GridBagConstraints.BOTH;
		gbc_panelMonitor.insets = new Insets(5, 0, 0, 0);
		gbc_panelMonitor.gridx = 0;
		gbc_panelMonitor.gridy = 2;
		panelLeft.add(monitor, gbc_panelMonitor);
		/* ###################### FIM DO PAINEL LEFT ################### */
		
		/** ##################### INICIO DO PAINEL CENTER PARA O PROCESSADOR ################# */
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.LIGHT_GRAY);
				
		GridBagConstraints gbc_panelCenter = new GridBagConstraints();
		gbc_panelCenter.weightx = 1.0;
		gbc_panelCenter.insets = new Insets(0, 0, 0, 5);
		gbc_panelCenter.fill = GridBagConstraints.BOTH;
		gbc_panelCenter.gridx = 1;
		gbc_panelCenter.gridy = 1;
		contentPane.add(panelCenter, gbc_panelCenter);
		
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[] {0};
		gbl_panelCenter.rowHeights = new int[] {0};
		gbl_panelCenter.columnWeights = new double[]{1.0};
		gbl_panelCenter.rowWeights = new double[]{1.0};
		panelCenter.setLayout(gbl_panelCenter);
		/** ######################### FIM DO PAINEL CENTER ############################# */
		
		/** ###################### INICIO PAINEL RIGTH ################## */
		JPanel panelRigth = new JPanel();
		panelRigth.setBackground(Color.WHITE);
		
		GridBagConstraints gbc_panelRigth = new GridBagConstraints();
		gbc_panelRigth.fill = GridBagConstraints.BOTH;
		gbc_panelRigth.gridx = 2;
		gbc_panelRigth.gridy = 1;
		contentPane.add(panelRigth, gbc_panelRigth);
		
		GridBagLayout gbl_panelRigth = new GridBagLayout();
		gbl_panelRigth.columnWidths = new int[] {0};
		gbl_panelRigth.rowHeights = new int[]{0, 0};
		gbl_panelRigth.columnWeights = new double[]{7.0};
		gbl_panelRigth.rowWeights = new double[]{0.8, 0.0};
		panelRigth.setLayout(gbl_panelRigth);
		
		// INSTANCIA DA CLASSE MEMORIA
		
		GridBagConstraints gbc_panelR = new GridBagConstraints();
		gbc_panelR.fill = GridBagConstraints.BOTH;
		gbc_panelR.gridx = 0;
		gbc_panelR.gridy = 0;
		panelRigth.add(Memoria.getInstance(), gbc_panelR);
		
		// INSTANCIA DA CLASSE MONITOR DE MEMORIA
		
		GridBagConstraints gbc_panelMonitorMemoria = new GridBagConstraints();
		gbc_panelMonitorMemoria.fill = GridBagConstraints.HORIZONTAL;
		gbc_panelMonitorMemoria.gridx = 0;
		gbc_panelMonitorMemoria.gridy = 1;
		panelRigth.add(MonitorMemoria.getInstance(), gbc_panelMonitorMemoria);
		/* ######################## FIM PAINEL RIGTH ################### */
		
	}
}
