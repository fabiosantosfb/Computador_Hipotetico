package controler.calCompiler;


public class CalCompiler {
	public int cont=0;
	private String[] operando = new String[10];
	private String operando_;
	private char[] operador = new char[10];
	
	
	public String[] getOperando(){
		return this.operando;
	}
	public char[] getOperador(){
		return this.operador;
	}
	public void setOperando(String op){
		if(operando_ == null){
			this.operando_=op;
		} else {
			this.operando_+=op;
		}
	}
	public void setOperador(char x){
		
		    this.operador[cont]=x;
			this.operando[cont]=operando_;
			this.cont++;
			operando_=null;		
	}
	public void setApagar(){
		for(int i=0; i<cont; i++){
			this.operando[i]=null;
			this.operador[i]=' ';
		}
		this.operando_=null;
		this.cont=0;

	}

}
