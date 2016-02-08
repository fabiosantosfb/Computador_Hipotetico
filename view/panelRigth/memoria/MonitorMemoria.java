package view.panelRigth.memoria;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Font;

public class MonitorMemoria extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3180009708989579022L;
	private static MonitorMemoria INSTANCIA_TAXA_MEMORIA;
	
	public static JLabel lblMb, lblMb_1, lblMb_2;
	
    public static MonitorMemoria getInstance() {
    	if(INSTANCIA_TAXA_MEMORIA == null){
    		return INSTANCIA_TAXA_MEMORIA = new MonitorMemoria();
    	} else {
    		return INSTANCIA_TAXA_MEMORIA; 
    	}
       
    }
	/**
	 * Create the panel.
	 */
	public MonitorMemoria() {
        
		setBorder(new MatteBorder(20, 5, 5, 5, (Color) new Color(200, 200, 200)));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.columnWeights = new double[]{0.0};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
		setLayout(gridBagLayout);
		
		JLabel lblTotalDeEndereo = new JLabel("Total de endere\u00E7o na memoria:");
		GridBagConstraints gbc_lblTotalDeEndereo = new GridBagConstraints();
		gbc_lblTotalDeEndereo.anchor = GridBagConstraints.WEST;
		gbc_lblTotalDeEndereo.weightx = 1.0;
		gbc_lblTotalDeEndereo.insets = new Insets(5, 5, 5, 5);
		gbc_lblTotalDeEndereo.gridx = 0;
		gbc_lblTotalDeEndereo.gridy = 0;
		add(lblTotalDeEndereo, gbc_lblTotalDeEndereo);
		
		lblMb = new JLabel("");
		lblMb.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMb.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblMb = new GridBagConstraints();
		gbc_lblMb.anchor = GridBagConstraints.WEST;
		gbc_lblMb.weightx = 1.0;
		gbc_lblMb.insets = new Insets(0, 5, 5, 0);
		gbc_lblMb.gridx = 0;
		gbc_lblMb.gridy = 1;
		add(lblMb, gbc_lblMb);
		
		JLabel lblMemriaEmUsor = new JLabel("Mem\u00F3ria em uso:");
		GridBagConstraints gbc_lblMemriaEmUsor = new GridBagConstraints();
		gbc_lblMemriaEmUsor.anchor = GridBagConstraints.WEST;
		gbc_lblMemriaEmUsor.weightx = 1.0;
		gbc_lblMemriaEmUsor.insets = new Insets(0, 5, 5, 0);
		gbc_lblMemriaEmUsor.gridx = 0;
		gbc_lblMemriaEmUsor.gridy = 2;
		add(lblMemriaEmUsor, gbc_lblMemriaEmUsor);
		
		lblMb_1 = new JLabel("");
		lblMb_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMb_1.setForeground(new Color(255, 0, 0));
		lblMb_1.setBackground(SystemColor.scrollbar);
		GridBagConstraints gbc_lblMb_1 = new GridBagConstraints();
		gbc_lblMb_1.anchor = GridBagConstraints.WEST;
		gbc_lblMb_1.weightx = 1.0;
		gbc_lblMb_1.insets = new Insets(0, 5, 5, 0);
		gbc_lblMb_1.gridx = 0;
		gbc_lblMb_1.gridy = 3;
		add(lblMb_1, gbc_lblMb_1);
		
		JLabel lblMemriaLivre = new JLabel("Mem\u00F3ria Livre:");
		GridBagConstraints gbc_lblMemriaLivre = new GridBagConstraints();
		gbc_lblMemriaLivre.anchor = GridBagConstraints.WEST;
		gbc_lblMemriaLivre.weightx = 1.0;
		gbc_lblMemriaLivre.insets = new Insets(0, 5, 5, 0);
		gbc_lblMemriaLivre.gridx = 0;
		gbc_lblMemriaLivre.gridy = 4;
		add(lblMemriaLivre, gbc_lblMemriaLivre);
		
		lblMb_2 = new JLabel("");
		lblMb_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMb_2.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblMb_2 = new GridBagConstraints();
		gbc_lblMb_2.anchor = GridBagConstraints.WEST;
		gbc_lblMb_2.weightx = 1.0;
		gbc_lblMb_2.insets = new Insets(0, 5, 0, 0);
		gbc_lblMb_2.gridx = 0;
		gbc_lblMb_2.gridy = 5;
		add(lblMb_2, gbc_lblMb_2);

	}

}
