package controler.memoria;


import javax.swing.table.DefaultTableModel;

public class TableMemory {
	String tamanho;
	public static void setCelula(DefaultTableModel modelo, int row){	
		modelo.setNumRows(0);
		for(int i=0; i<row; i++){
			String end = Integer.toHexString(i);
			modelo.addRow(new Object[]{"#"+end});
		}
	}
		
	public String tamanhoMemoria(int row, int bits){
		String tamanho_T = null;
		if(bits == 8){
			if(row == 16){
				tamanho_T="16MB";
			}else if(row == 32){
				tamanho_T="32MB";
			}else{
				tamanho_T="64MB";
			}
		}	
		return this.tamanho=tamanho_T;
	}

}
