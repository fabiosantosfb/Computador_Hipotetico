package view.custon;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CustonPanel extends JPanel{
	     
	        //--[ TEXTO DO TITULO ]--\\
	        private String cTitulo   = "" ;
	        
	        //--[ ALTURA DA BARRA DE TITULO ]--\\
	        private  int  nCabecalho = 35;
	        
	        //--[ MARGEM ]--\\
	        private  int  nMargem    =  3 ;
	        
	        //--[ CORES UTILIZADAS ]--\\
	        private Color corBordas  = new Color(   0 ,  0 ,  0 ) ;        
	        private Color corBarra1  = new Color(  28 , 28 , 28 ) ;    
	        private Color corBarra2  = new Color(  200 , 200 , 200 ) ;
	        
	        private static FactoryLayout custonTela;
	        private float pocentagem_Tela_Height_Cabecalho ;
	        private int cabecalho;
	        
	        //--[ CONSTRUTOR ]--\\
	        public CustonPanel( String cNovoTitulo )
	        {                                                            
	            this.cTitulo = cNovoTitulo ;
		           //custonTela = FactoryLayout.getInstance();
		          // this.pocentagem_Tela_Height_Cabecalho = (float) nCabecalho/824;
		           //this.cabecalho = custonTela.pixelsAltura(pocentagem_Tela_Height_Cabecalho, nCabecalho);
		  
	        }                
	        
	        
	        protected void paintComponent(Graphics g) 
	        {

	           //--[ COMPONENTE PARA CORES COM EFEITO GRADIENT ]--\\
	           GradientPaint gradient  ;
	           final Graphics2D g2 = ( Graphics2D ) g;
	           
	           //--[ LARGURA E ALTURA DA CAIXA DE DIALOGO ]--\\
	           int w = getWidth();
	           int h = getHeight();

	           //--[ COR DE FUNDO ]--\\
	           g2.setColor( new Color( 255 , 255 , 255 ) );
	           g2.fillRect( 0 , 0 , w , h );

	           //--[ SETA A COR DAS BORDAS ]--\\ 
	           g2.setColor( corBordas );        
	           
	           //--[ DESENHA A BORDA ESQUERDA ]--\\
	           g2.drawLine( 1  , 1 , 1 , h - 2 );
	           
	           //--[ DESENHA A BORDA SUPERIOR ]--\\
	           g2.drawLine( 1  , 1 , w - 2 , 1 );                      

	           //--[ DESENHA A BORDA DIREITA ]--\\           
	           g2.drawLine( w - 2  , 1     , w - 2 , h - 2 );                      
	           
	           //--[ DESENHA A BORDA INFERIOR ]--\\           
	           g2.drawLine( 1      , h - 2 , w - 2 , h - 2 );

	           g2.setRenderingHint( RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON );      
	           
	           //--[ DESENHA A BARRA DE TITULOS COM COR EM EFEITO DEGRADE ]--\\
	           gradient = new GradientPaint( 0 , nCabecalho , ( corBarra1 ) , 0 , 0 , ( corBarra2 ) , false );
	           g2.setPaint( gradient );
	           g2.fillRect( nMargem  , nMargem , w - ( nMargem * 2 ) , nCabecalho );           

	           //--[ TITULO NA BARRA ]--\\
	           if( ! cTitulo.trim().equals( "" ) )
	           {        
	               //--[ COR DA FONTE DO TITULO ]--\\
	               g.setColor( Color.white );
	               
	               //--[ ESTILO DA FONTE DO TITULO ]--\\
	               g.setFont( new Font( "Verdana"  , Font.BOLD , 12 ) );
	               
	               //--[ ESCREVE O TITULO NA COLUNA 35, LINHA 20 ]--\\
	               g.drawString( cTitulo , 10 , 20 );            
	           }          
	        
	        }
}
