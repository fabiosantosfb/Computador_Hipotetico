package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.panelLeft.editorProgram.EditorPrograma;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Instruction extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String INSTRUCTION ="Instruções";
	private static final String NOP ="NOP";
	private static final String STA ="STA";
	private static final String LDA ="LDA";
	private static final String ADD ="ADD";
	private static final String OR ="OR";
	private static final String AND ="AND";
	private static final String NOT ="NOT";
	private static final String SUB ="SUB";
	private static final String JMP ="JMP";
	private static final String JN ="JN";
	private static final String JZ ="JZ";
	private static final String JNZ ="JNZ";
	private static final String IN ="IN";
	private static final String OUT ="OUT";
	private static final String LDI ="LDI";
	private static final String HLT ="HLT";
	private static final String ORG ="ORG";
	private static final String EQU ="EQU";
	private static final String END ="END";
	private static final String DS ="DS";
	private static final String BD ="BD";
	private static final String ROTULO ="ROTULO";
	private static final String COMENTARIO ="COMENTARIO";
	private static final String INSERIR ="INSERIR";
	private JPanel contentPane;
	private JTextPane textPane;
	private JTextField textFieldComentario;
	private JLabel label, lblComentarInstruo, lblValor;
	private JButton btnNewButton, btnSta, btnLda, btnAdd, btnOr, btnAnd, btnNot, btnSub, btnJmp, btnJn, btnJz, btnJnz, btnIn, btnOut, btnLdi, btnHnt, btnOrg, btnEqu, btnAn, btnRotulo, btnDs, btnBd, btnComentario, btnInserir;
	private String butPress;
	public static boolean instr=false;
	private JTextField textFieldValor;
	protected String butPressC;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Instruction() {

		setType(Type.POPUP);
		setAutoRequestFocus(false);
		setForeground(new Color(255, 99, 71));
		setBackground(new Color(255, 0, 0));
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 353, 375);
		setTitle(INSTRUCTION);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton(NOP);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(NOP);
				textPane.setText("Instrução usada para gastar tempo:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnNewButton.getText();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBounds(5, 5, 65, 25);
		contentPane.add(btnNewButton);
		
		btnSta = new JButton(STA);
		btnSta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(STA);
				textPane.setText("Instrução usada para transferir o valor do acumulador para a posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnSta.getText();
			}
		});
		btnSta.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSta.setBounds(5, 32, 65, 25);
		contentPane.add(btnSta);
		
		btnLda = new JButton(LDA);
		btnLda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(LDA);
				textPane.setText("Instrução usada para atribuir ao acumulador o conteudo da posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnLda.getText();
			}
		});
		btnLda.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLda.setBounds(5, 59, 65, 25);
		contentPane.add(btnLda);
		
		btnAdd = new JButton(ADD);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(ADD);
				textPane.setText("Instrução usada para somar ao acumulador o conteudo de uma posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnAdd.getText();
			}
		});
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAdd.setBounds(5, 86, 65, 25);
		contentPane.add(btnAdd);
		
		btnOr = new JButton(OR);
		btnOr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(OR);
				textPane.setText("Realizar um \"ou\" logico entre o acumulador e o conteudo de uma posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnOr.getText();
			}
		});
		btnOr.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOr.setBounds(5, 113, 65, 25);
		contentPane.add(btnOr);
		
		btnAnd = new JButton(AND);
		btnAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(AND);
				textPane.setText("Realizar um \"e\" logico entre o acumulador e o conteudo de uma posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnAnd.getText();
			}
		});
		btnAnd.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAnd.setBounds(5, 140, 65, 25);
		contentPane.add(btnAnd);
		
		btnNot = new JButton(NOT);
		btnNot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(NOT);
				textPane.setText("Inverte os bits do acumulador:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnNot.getText();
			}
		});
		btnNot.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNot.setBounds(5, 167, 65, 25);
		contentPane.add(btnNot);
		
		btnSub = new JButton(SUB);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(SUB);
				textPane.setText("Subtrai do acumulador e o conteudo de uma posição de memoria indicada pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnSub.getText();
			}
		});
		btnSub.setFont(new Font("Arial", Font.PLAIN, 11));
		btnSub.setBounds(5, 194, 65, 25);
		contentPane.add(btnSub);
		
		btnJmp = new JButton(JMP);
		btnJmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(JMP);
				textPane.setText("Desvia a execução do programa para o endereço indicado pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnJmp.getText();
			}
		});
		btnJmp.setFont(new Font("Arial", Font.PLAIN, 11));
		btnJmp.setBounds(80, 5, 65, 25);
		contentPane.add(btnJmp);
		
		btnJn = new JButton(JN);
		btnJn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(JN);
				textPane.setText("(jump if negativo)Desvia a execução do programa para o endereço indicado pelo operando, apenas quando a ultima operação realizada produziu um valor com bit 7 ligado:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnJn.getText();
			}
		});
		btnJn.setFont(new Font("Arial", Font.PLAIN, 11));
		btnJn.setBounds(80, 32, 65, 25);
		contentPane.add(btnJn);
		
		btnJz = new JButton(JZ);
		btnJz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(JZ);
				textPane.setText("(jump if zero)Desvia a execução do programa para o endereço indicado pelo operando, apenas quando a ultima operação realizada produziu um valor zero:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnJz.getText();
			}
		});
		btnJz.setFont(new Font("Arial", Font.PLAIN, 11));
		btnJz.setBounds(80, 59, 65, 25);
		contentPane.add(btnJz);
		
		btnJnz = new JButton(JNZ);
		btnJnz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(JNZ);
				textPane.setText("(jump if not zero)Desvia a execução do programa para o endereço indicado pelo operando ender, apenas quando a ultima operação realizada produziu um valor diferente de zero:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnJnz.getText();
			}
		});
		btnJnz.setFont(new Font("Arial", Font.PLAIN, 11));
		btnJnz.setBounds(80, 86, 65, 25);
		contentPane.add(btnJnz);
		
		btnIn = new JButton(IN);
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(IN);
				textPane.setText("(INPUT)Carrega no acumulador o valor lido no dispositivo externo indicado pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnIn.getText();
			}
		});
		btnIn.setFont(new Font("Arial", Font.PLAIN, 11));
		btnIn.setBounds(80, 113, 65, 25);
		contentPane.add(btnIn);
		
		btnOut = new JButton(OUT);
		btnOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(OUT);
				textPane.setText("(OUTPUT)Transfere o valor do acumuladorpara o dispositivo externo indicado pelo operando: Visor (endereço 0)");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnOut.getText();
			}
		});
		btnOut.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOut.setBounds(80, 140, 65, 25);
		contentPane.add(btnOut);
		
		btnLdi = new JButton(LDI);
		btnLdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(LDI);
				textPane.setText("(LOAD IMEDIATO)Carrega no acumulador o valor imadiato dado pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnLdi.getText();
			}
		});
		btnLdi.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLdi.setBounds(80, 167, 65, 25);
		contentPane.add(btnLdi);
		
		btnHnt = new JButton(HLT);
		btnHnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(HLT);
				textPane.setText("Para a maquina:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnHnt.getText();
			}
		});
		btnHnt.setFont(new Font("Arial", Font.PLAIN, 11));
		btnHnt.setBounds(80, 194, 65, 25);
		contentPane.add(btnHnt);
		
		btnOrg = new JButton(ORG);
		btnOrg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(ORG);
				textPane.setText("Pseudo-instrução indica ao assembler a posição da memória onde será colocado a proxima instrução:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnOrg.getText();
			}
		});
		btnOrg.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOrg.setBounds(5, 226, 65, 25);
		contentPane.add(btnOrg);
		
		btnEqu = new JButton(EQU);
		btnEqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(EQU);
				textPane.setText("Pseudo-instrução atribui um nome a um certo valor. Usado para especificar variáveis que são posicionada num certo endereço da memória. Exemplo posicionar X no endereço hexa F0: X EQU 0F0H");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnEqu.getText();
			}
		});
		btnEqu.setFont(new Font("Arial", Font.PLAIN, 11));
		btnEqu.setBounds(5, 253, 65, 25);
		contentPane.add(btnEqu);
		
		btnAn = new JButton(END);
		btnAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("END");
				textPane.setText("Pseudo-instrução indica qiue o programa fonte acabou. Usado para para pré-carregar no PC com endereço inicial de execução do programa:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnAn.getText();
			}
		});
		btnAn.setFont(new Font("Arial", Font.PLAIN, 11));
		btnAn.setBounds(5, 281, 65, 25);
		contentPane.add(btnAn);
		
		btnRotulo = new JButton(ROTULO);
		btnRotulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(ROTULO);
				textPane.setText("Nome dado a proxima instrução de memória. O nome é seguido por dois pontos:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = ":";
			}
		});
		btnRotulo.setFont(new Font("Arial", Font.PLAIN, 11));
		btnRotulo.setBounds(5, 310, 120, 25);
		contentPane.add(btnRotulo);
		
		btnDs = new JButton(DS);
		btnDs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(DS);
				textPane.setText("Pseudo-instrução (define storage) reserva um numero de palavra na memória definido pelo operando:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnDs.getText();
			}
		});
		btnDs.setFont(new Font("Arial", Font.PLAIN, 11));
		btnDs.setBounds(80, 226, 65, 25);
		contentPane.add(btnDs);
		
		btnBd = new JButton(BD);
		btnBd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(BD);
				textPane.setText("Pseudo-instrução (define byte) carrega nesta palavra de memória o valor definido pelo operando:");
				textFieldComentario.setVisible(true);
				lblComentarInstruo.setVisible(true);
				textFieldValor.setVisible(true);
				lblValor.setVisible(true);
				
				butPress = btnBd.getText();
			}
		});
		btnBd.setFont(new Font("Arial", Font.PLAIN, 11));
		btnBd.setBounds(80, 253, 65, 25);
		contentPane.add(btnBd);
		
		btnComentario = new JButton(COMENTARIO);
		btnComentario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Comentário");
				textPane.setText("Os comentário são começado por ponto e vírgula:");
				lblComentarInstruo.setVisible(true);
				textFieldComentario.setVisible(true);
				textFieldValor.setVisible(false);
				lblValor.setVisible(false);
				butPress = "";
			}
		});
		btnComentario.setFont(new Font("Arial", Font.PLAIN, 11));
		btnComentario.setBounds(128, 310, 101, 25);
		contentPane.add(btnComentario);
		
		btnInserir = new JButton(INSERIR);
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditorPrograma.getInstance().editorPane.setEditable(true);
				
				if(butPress != null && textFieldComentario.getText().equals("")){
					if(EditorPrograma.getInstance().editorPane.getText().equals("")){
						EditorPrograma.getInstance().editorPane.setText(butPress+" "+textFieldValor.getText());

					} else {
						EditorPrograma.getInstance().editorPane.setText(EditorPrograma.getInstance().editorPane.getText()+String.format("\n")+butPress+" "+textFieldValor.getText());
					}
					textFieldValor.setText("");
					textFieldComentario.setText("");
				}else if (!textFieldComentario.getText().equals(" ")){
					if(EditorPrograma.getInstance().editorPane.getText().equals("")){
						EditorPrograma.getInstance().editorPane.setText(butPress+" "+textFieldValor.getText()+" ;"+textFieldComentario.getText());
					} else {
						EditorPrograma.getInstance().editorPane.setText(EditorPrograma.getInstance().editorPane.getText()+String.format("\n")+butPress+" "+textFieldValor.getText()+" ;"+textFieldComentario.getText());
					}
					textFieldValor.setText("");
					textFieldComentario.setText("");
				}
			}
		});
		btnInserir.setFont(new Font("Arial", Font.PLAIN, 11));
		btnInserir.setBounds(232, 310, 101, 25);
		contentPane.add(btnInserir);
		
		textFieldComentario = new JTextField();
		textFieldComentario.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldComentario.setBounds(155, 255, 178, 25);
		textFieldComentario.setVisible(false);
		contentPane.add(textFieldComentario);
		textFieldComentario.setColumns(10);
		
		textPane = new JTextPane();
		textPane.setBackground(SystemColor.menu);
		textPane.setFont(new Font("Arial", Font.PLAIN, 12));
		textPane.setEditable(false);
		textPane.setBounds(155, 30, 178, 151);
		contentPane.add(textPane);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		label.setBounds(155, 10, 107, 14);
		contentPane.add(label);
		
		lblComentarInstruo = new JLabel("Comentar instru\u00E7\u00E3o:");
		lblComentarInstruo.setVisible(false);
		lblComentarInstruo.setFont(new Font("Arial", Font.PLAIN, 11));
		lblComentarInstruo.setBounds(155, 237, 178, 14);
		contentPane.add(lblComentarInstruo);
		
		textFieldValor = new JTextField();
		textFieldValor.setVisible(false);
		textFieldValor.setBounds(155, 205, 86, 25);
		contentPane.add(textFieldValor);
		textFieldValor.setColumns(10);
		
		lblValor = new JLabel("Valor:");
		lblValor.setVisible(false);
		lblValor.setBounds(155, 180, 41, 25);
		contentPane.add(lblValor);
	}
}
