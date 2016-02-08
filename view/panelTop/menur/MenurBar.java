package view.panelTop.menur;

import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

import view.Instruction;

import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import java.awt.GridBagConstraints;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenurBar extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1911613659992152422L;

	/**
	 * Create the panel.
	 */
	public MenurBar() {
		setBackground(SystemColor.scrollbar);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {1};
		gridBagLayout.rowHeights = new int[] {1};
		gridBagLayout.columnWeights = new double[]{1.0};
		gridBagLayout.rowWeights = new double[]{1.0};
		setLayout(gridBagLayout);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Arial", Font.PLAIN, 12));
		menuBar.setBorderPainted(false);
		menuBar.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.gridwidth = 0;
		gbc_menuBar.weightx = 1.0;
		gbc_menuBar.anchor = GridBagConstraints.WEST;
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		add(menuBar, gbc_menuBar);
		
		JMenu mnSair = new JMenu("Arquivos");
		mnSair.setFont(new Font("Arial", Font.PLAIN, 12));
		mnSair.setBackground(SystemColor.scrollbar);
		menuBar.add(mnSair);
		
		JMenuItem mntmArquivo = new JMenuItem("Sair");
		mntmArquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0); 
			}
		});
		mntmArquivo.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmArquivo.setBackground(SystemColor.text);
		mnSair.add(mntmArquivo);
		
		JMenu mnProgramar = new JMenu("Programar");
		mnProgramar.setFont(new Font("Arial", Font.PLAIN, 12));
		mnProgramar.setBackground(SystemColor.scrollbar);
		menuBar.add(mnProgramar);
		
		JMenuItem mntmCompilar = new JMenuItem("Compilar");
		mntmCompilar.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmCompilar.setBackground(SystemColor.text);
		mnProgramar.add(mntmCompilar);
		
		JMenuItem mntmMnmonicos = new JMenuItem("Instru\u00E7\u00F5es");
		mntmMnmonicos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Instruction instruction = new Instruction();
				instruction.setResizable(false);
				instruction.setLocationRelativeTo(null);
				instruction.setVisible(true);
			}
		});
		mntmMnmonicos.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmMnmonicos.setBackground(SystemColor.text);
		mnProgramar.add(mntmMnmonicos);
		
		JMenu mnConfigurao = new JMenu("Configura\u00E7\u00E3o");
		mnConfigurao.setFont(new Font("Arial", Font.PLAIN, 12));
		mnConfigurao.setBackground(SystemColor.scrollbar);
		menuBar.add(mnConfigurao);
		
		JMenuItem mntmMemria = new JMenuItem("Mem\u00F3ria");
		mntmMemria.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmMemria.setBackground(SystemColor.text);
		mnConfigurao.add(mntmMemria);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Pocessador");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmNewMenuItem.setBackground(SystemColor.text);
		mnConfigurao.add(mntmNewMenuItem);
		
		JMenu mntmTraduzir = new JMenu("Linguagem");
		mntmTraduzir.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmTraduzir.setBackground(SystemColor.text);
		mnConfigurao.add(mntmTraduzir);
		
		JRadioButtonMenuItem rdbtnmntmPortugus = new JRadioButtonMenuItem("Portugu\u00EAs");
		rdbtnmntmPortugus.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnmntmPortugus.setBackground(SystemColor.text);
		mntmTraduzir.add(rdbtnmntmPortugus);
		
		JRadioButtonMenuItem rdbtnmntmIngls = new JRadioButtonMenuItem("Ingl\u00EAs");
		rdbtnmntmIngls.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnmntmIngls.setBackground(SystemColor.text);
		mntmTraduzir.add(rdbtnmntmIngls);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setFont(new Font("Arial", Font.PLAIN, 12));
		mnSobre.setBackground(SystemColor.scrollbar);
		menuBar.add(mnSobre);
		
		JMenuItem mntmDesenvolvedores = new JMenuItem("Desenvolvedores");
		mntmDesenvolvedores.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmDesenvolvedores.setBackground(SystemColor.text);
		mnSobre.add(mntmDesenvolvedores);
		
		JMenuItem mntmAplicativo = new JMenuItem("Aplicativo");
		mntmAplicativo.setFont(new Font("Arial", Font.PLAIN, 12));
		mntmAplicativo.setBackground(SystemColor.text);
		mnSobre.add(mntmAplicativo);

	}

}
