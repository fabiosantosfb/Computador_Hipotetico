package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.panelRigth.memoria.Memoria;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustonMemoria extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5806737898196791905L;
	private final JPanel contentPanelCustonMemoria = new JPanel();
    private JSlider sliderConfigMemoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CustonMemoria() {
		
		setType(Type.POPUP);
		setAutoRequestFocus(false);
		setTitle("Configuração de Memória");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanelCustonMemoria.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanelCustonMemoria, BorderLayout.CENTER);
		contentPanelCustonMemoria.setLayout(null);
		
		JLabel lblTamanhoDeMemria = new JLabel("Tamanho de mem\u00F3ria para processador de 16bits:");
		lblTamanhoDeMemria.setFont(new Font("Arial", Font.PLAIN, 12));
		lblTamanhoDeMemria.setBounds(70, 46, 297, 32);
		contentPanelCustonMemoria.add(lblTamanhoDeMemria);
		
		sliderConfigMemoria = new JSlider(JSlider.HORIZONTAL, 1, 3, 1);
		sliderConfigMemoria.setFont(new Font("Arial", Font.PLAIN, 11));
		sliderConfigMemoria.setBounds(113, 106, 200, 23);
		contentPanelCustonMemoria.add(sliderConfigMemoria);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n = sliderConfigMemoria.getValue();
	
				if(n==1){
					Memoria.getInstance().setMemoria(16);
				} else if(n==2){
					Memoria.getInstance().setMemoria(32);
				}else{
					Memoria.getInstance().setMemoria(64);
				}
				
				dispose();
			}
		});
		btnOk.setBounds(182, 228, 89, 23);
		contentPanelCustonMemoria.add(btnOk);
		
		JLabel lblNewLabel = new JLabel("2^4");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(108, 89, 25, 14);
		contentPanelCustonMemoria.add(lblNewLabel);
		
		JLabel label = new JLabel("2^5");
		label.setFont(new Font("Arial", Font.PLAIN, 11));
		label.setBounds(204, 89, 25, 14);
		contentPanelCustonMemoria.add(label);
		
		JLabel label_1 = new JLabel("2^6");
		label_1.setFont(new Font("Arial", Font.PLAIN, 11));
		label_1.setBounds(304, 89, 25, 14);
		contentPanelCustonMemoria.add(label_1);
	
	}
}
