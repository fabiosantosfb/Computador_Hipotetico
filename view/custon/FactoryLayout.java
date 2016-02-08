package view.custon;



import java.awt.Container;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

//import br.com.liralink.swing.widgets.BarraTitulo;


public class FactoryLayout {
    private static final FactoryLayout INSTANCE = new FactoryLayout();
   

    private FactoryLayout() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Duplicada instnacia");
        }
    }

    public static FactoryLayout getInstance() {
        return INSTANCE;
    }

    /* FABIANO - CAPTURA RESOLUÇÃO DO MONITOR */
    public Point size() {
        Point p = new Point();
        p.y = Toolkit.getDefaultToolkit().getScreenSize().height;
        p.x = Toolkit.getDefaultToolkit().getScreenSize().width;
        return p;
    }
    
    /* FABIANO - LARGURA DA RESOLUÇÃO DO MONITOR */
    public Integer getHeigth() {
        return size().y;
    }
    /* FABIANO - TAMANHO ROSOLUÇÃO DO MONITOR */
    public Integer getWidth() {
        return size().x;
    }

    /* FABIANO - TAMANHO EM PORCENTAGEM */
    public int pixelsWidth(double por_cento){
    	return (int)(por_cento*getWidth());
    }
    
    /* FABIANO - LARGURA EM PORCENTAGEM */
    public int pixelsHeight(double por_cento){
    	return (int)(por_cento*getHeigth());
    }
    
    /* FABIANO - RESOLUÇÃO PADRÃO RECOMENDADA 1152 X 864 */
    public void porcentBounds(int x, int y, int width, int height, Container conteiner) {
    	int resolucao_X = 1152;
    	int resolucao_Y = 864;
    	
    	conteiner.setBounds(pixelsWidth((double)x/resolucao_X), pixelsHeight((double)y/resolucao_Y), pixelsWidth((double)width/resolucao_X), pixelsHeight((double)height/resolucao_Y));
    }

    
    
    
    
    public int pixelsAltura(double porcentagem, int components) {
    	int height = (int)(porcentagem * ((getHeigth()-components)-((getHeigth()-components)*(components/getHeigth()))));
        return height;
    }
    public int pixelsLargura(double porcentagem, int components) {
    	int height = (int)(porcentagem * ((getWidth()-components)-((getWidth()-components)*(components/getWidth()))));
        return height;
    }
    
    
 
    
    
    /**
     * Deixar o frame do tamanho da tela
     * 
     * @param frame
     */
    public void maximiza(Container frame) {
        frame.setSize(getWidth(), getHeigth()-40);
        frame.setLocation(0,0);
    }

    public void centraliza(Container container) {// Prernche toda tela
        int largura = container.getBounds().width;
        int altura = container.getBounds().height;
        int x = (getWidth() / 2) - (largura / 2);
        int y = (getHeigth() / 2) - (altura / 2);
        container.setBounds(x, y, largura, altura);

    }

    /**
     * Devolve a quantidade de pixels para uma porcentagem de altura da tela
     * 
     * @param porcentagem um valor de 0 a 100
     * @return Quantidade em pixels
     */




    /**
     * O ponto x de um objeto em porcentagem.
     * 
     * @param porcentagem O valor desejado. Um valor de 0 a 100. Exemplo 50 devolve um ponto no meio do objeto.
     * @param parent O pai do objeto
     * @return
     */

    public int pontoX(double porcentagem, Container parent) {
        int largura;
        if (parent != null){
            largura = parent.getBounds().width;
           // JOptionPane.showMessageDialog(null, "Nao e nulo pontoX "+largura);
        } else{
            largura = getWidth();
           // JOptionPane.showMessageDialog(null, "Sim e nulo pontoX "+largura);
        }
        return (int) ((porcentagem / 100) * largura);
    }

    /**
     * O ponto y de um objeto em porcentagem.
     * 
     * @param porcentagem O valor desejado. Um valor de 0 a 100. Exemplo 50 devolve um ponto no meio do objeto.
     * @param parent  O pai do objeto
     * @return
     */
    public int pontoY(double porcentagem, Container parent) {
        int altura;
        if (parent != null){
        	
            altura = parent.getBounds().height;
            //JOptionPane.showMessageDialog(null, "Nao e nulo pontoY "+altura);
        } else{
        	
            altura = getHeigth();
            //JOptionPane.showMessageDialog(null, "Sim e nulo pontoY "+altura);
        }

        return (int) ((porcentagem / 100) * altura);
    }

    /**
     * Desenha um componente com as medidadas desejadas
     * 
     * @param x
     *            Posição x em porcentagem do elemento
     * @param y
     *            Posição y em porcentagem
     * @param largura
     *            Porcentagem
     * @param altura
     *            Porcentagem
     * @param parent
     *            O Container Pai
     * @return Retangulo com as medidas adequadas.
    
    public Rectangle perfectBounds(double x, double y, double largura,double altura, Container parent) {
        if (parent != null){
        	//JOptionPane.showMessageDialog(null, "Não e nulo perfectBounds");
        	return new Rectangle(pontoX(x, parent), pontoY(y, parent),pixelsLargura(largura, parent),pixelsAltura(altura, parent));
        }else {
        	//JOptionPane.showMessageDialog(null, "Sim e nulo perfectBounds");
            return new Rectangle(pontoX(x, parent), pontoY(y, parent),pixelsLargura(largura,0), pixelsAltura(altura, 0));
        }
    } */

    /**
     * Devolve painel com a porcentagem especificada
     * 
     * @param altura
     * @param largura
     * @return
     */
    public JPanel painel(double largura, double altura) {
        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 0, pixelsLargura(largura,0), pixelsAltura(altura,0));
        return jPanel;
    }

    /**
     * Uma barra com botões fechar e minimizar
     * 
     * @param frame
     *            O Frame que receberá a barra
     * @param fechar
     *            A ação quando for clicado em fechar.
     * @return Uma barra com controles
     */
   /* public JPanel titulo(final Frame frame, ActionListener fechar) {
        BarraTitulo jPanel = new BarraTitulo();
        ActionListener acao = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(Frame.ICONIFIED);
            }
        };
        jPanel.setAcaoFechar(fechar);
        jPanel.setAcaoMimizar(acao);
        return jPanel;
    }*/

    public void passarFoco(final JComponent component) {
        component.addHierarchyListener(new HierarchyListener() {
            public void hierarchyChanged(HierarchyEvent e) {
                if ((e.getChangeFlags() & HierarchyEvent.SHOWING_CHANGED) != 0) {
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            if (component.isVisible()) {
                                component.requestFocus();
                            }
                        }
                    });
                }
            }
        });
    }

    public Border bordaBaixa() {

        return new BevelBorder(BevelBorder.LOWERED, null, null, null, null);
    }
    public void distribuiBotoes(int qtdByLine,JButton... botes){

    }
    
    public int fontSize(int size){
    
    	int s = getWidth()/96;
    	return s;
    }

}
