package controler.editorAssembly;

import javax.swing.JOptionPane;

public class EditorAssembly implements programaAssembly {
	
	private String prePrograma, preInstruction;
	private static final String PREPROG_SOMA = String.format("   ;Somar N1+N2\n\n   LDA 1\n   STA 20\n   LDA 2\n   ADD 20\n   OUT 0\n   HLT");
	private static final String PREPROG_MULT = String.format("\n   ;Multiplicação N1*N2\n\n   "+
																	"VLT: LDA MLT ;MLT=MLT+N1\n   "+
																	"ADD N1\n   "+
																	"STA MLT\n   "+
																	"LDA N2 ;N2=N2-1\n   "+
																	"SUB UM\n   "+
																	"STA N2\n   "+
																	"JNZ VLT ;volta se ACC<>0\n   "+
																	"LDA MLT ;exibe MLT\n   "+
																	"OUT 0\n   "+
																	"HLT ;fim do programa\n   "+
																	"ORG 20h \n   ;mem. a partir da posição 20h (16)\n   "+
																	"UM: DB 1\n   "+
																	"N1: DB 5\n   "+
																	"N2: DB 4\n   "+
																	"MLT: DB 0 ;resultado   \n");
	private static final String PREPROG_SOMA_A_NIVEL = String.format("   //Somar N1+N2\n\n   variavel\n   inteiro : n1<-1, n2<-2, soma\n   inicio\n   soma<-n1+n2\n   saida\"A soma e\",soma\n   fim");
	private static final String PREPROG_MULT_A_NIVEL = String.format("   //Multiplicar N1*N2\n\n   variavel\n   inteiro : n1<-2, n2<-2, soma\n   inicio\n   soma<-n1*n2\n   saida\"O resultado e\",soma\n   fim");

	public EditorAssembly(String radioB, String comoboB){
		try{
			setPreProgramaComboBox(radioB, comoboB);
		} catch (Exception s){
			JOptionPane.showMessageDialog(null, "ERRO CONSTRUTOR DA CLASS EDITOR-ASSEBLY!");
		}
	}
	
	@Override
	public void setPreProgramaComboBox(String rB, String cB) {
		// TODO Auto-generated method stub
		String prePro="";
		if(rB=="B"){
			if(cB == "Somar"){
				prePro = PREPROG_SOMA;
			}else if(cB == "Multiplicar"){
				prePro = PREPROG_MULT;
			}
		} else if(rB == "A") {
			if(cB == "Somar"){
				prePro = PREPROG_SOMA_A_NIVEL;
			}else if(cB == "Multiplicar"){
				prePro = PREPROG_MULT_A_NIVEL;
			}
		}
		this.prePrograma=prePro;
	}
	@Override
	public String getPrePrograma(){
		return this.prePrograma;
	}
	@Override
	public void setPreInstruction(String s, int n) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public String getPreInstruction(){
		return this.preInstruction;
	}


}
