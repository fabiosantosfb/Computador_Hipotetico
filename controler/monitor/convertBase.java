package controler.monitor;

import javax.swing.JOptionPane;

public class convertBase {
	String decimal_, hexa, binario;

	public String getBinario(){
		return this.binario;
	}
	public String getHex(){
		return this.hexa;
	}
	public String getDecimal(){
		return this.decimal_;
	}
	
	
	public void setBinario(String n){
		try{
			//converte decimal para binario
			int decimal = Integer.parseInt(n,2);
			String decimal_S = Integer.toBinaryString(decimal);
			this.binario=decimal_S;
		}catch(NumberFormatException en){
			try{
				//converte binario para binario
				int decimal = Integer.parseInt(n,10);
				String decimal_S = Integer.toBinaryString(decimal);
				this.binario=decimal_S;
			}catch(NumberFormatException em){
				try{
					//converte hexa para binario
					int decimal = Integer.parseInt(n,16);
					String decimal_S = Integer.toBinaryString(decimal);
					this.binario=decimal_S;
				}catch(NumberFormatException s){
					JOptionPane.showMessageDialog(null,"Erro na converção !","Alerta",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
			
		
	}
	public void setHex(String n){
		try{
			//converte decimal para hexa
			int decimal = Integer.parseInt(n,2);
			String decimal_S = Integer.toHexString(decimal);
			this.hexa=decimal_S;
			JOptionPane.showMessageDialog(null,"decimal para hexa !","Alerta",JOptionPane.WARNING_MESSAGE);

		}catch(NumberFormatException en){
			try{
				//converte hexa para hexa
				int decimal = Integer.parseInt(n,10);
				String decimal_S = Integer.toHexString(decimal);
				this.hexa=decimal_S;
				JOptionPane.showMessageDialog(null,"hexa para hexa !","Alerta",JOptionPane.WARNING_MESSAGE);

			}catch(NumberFormatException em){
				try{
					//converte binario para hexa
					int decimal = Integer.parseInt(n,16);
					String decimal_S = Integer.toHexString(decimal);
					this.hexa=decimal_S;
					JOptionPane.showMessageDialog(null,"binario para hexa !","Alerta",JOptionPane.WARNING_MESSAGE);

				}catch(NumberFormatException s){
					JOptionPane.showMessageDialog(null,"Erro na converção !","Alerta",JOptionPane.WARNING_MESSAGE);
				}	
			}
		}
		
	}
	public void setDecimal(String n){
		try{
			//converte binario para decimal
			this.decimal_=Integer.toString(Integer.parseInt(n,2));
		}catch(NumberFormatException en){
			try{
				//converte decimal para decimal
				this.decimal_=Integer.toString(Integer.parseInt(n,10));
			}catch(NumberFormatException em){
				try{
					//converte hexa para decimal
					this.decimal_=Integer.toString(Integer.parseInt(n,16));
				}catch(NumberFormatException s){
					JOptionPane.showMessageDialog(null,"Erro na converção !","Alerta",JOptionPane.WARNING_MESSAGE);
				}
			}
		}
		
		
	}
}
