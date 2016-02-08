package view.panelCenter.processor;


import java.awt.Color;  
import java.awt.Dimension;  
import java.awt.Graphics;  
import java.awt.GridLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import java.util.Random;  
import javax.swing.JComponent;  
import javax.swing.JFrame;  
import javax.swing.Timer;  
  
public class Animacao extends JComponent implements ActionListener {  
    static final int DELTA = 20;  
    Random rand = new Random();  
    int[] x1;  
    int[] y1;  
    int[] x2;  
    int[] y2;  
    Color[] c;  
    int dx1=50,dy1=50,dx2=50,dy2=50, i;  
      
    public Animacao(int strips, Color c1, Color c2) {  
        x1=new int[strips];  
        y1=new int[strips];  
        x2=new int[strips];  
        y2=new int[strips];  
        c=new Color[strips];  
         
        /** DEIXA COLORIDO E AO FINAL APAGA O RASTRO DEIXANDO TRANSPARENNTE **/
        int r1 = c1.getRed();  
        int g1 = c1.getGreen();  
        int b1 = c1.getBlue();  
        int r2 = c2.getRed();  
        int g2 = c2.getGreen();  
        int b2 = c2.getBlue();  
        double dr = (double) (r2-r1)/strips;  
        double dg = (double) (g2-g1)/strips;  
        double db = (double) (b2-b1)/strips;  
        double r=r1,g=g1,b=b1;  
        
        for (i=0; i<c.length; i++) {  
            c[i] = new Color((int)r,(int)g,(int)b); 
            r += dr;  
            g += dg;  
            b += db;  
        }  
          
        Timer t = new Timer(50, this);  
        t.setCoalesce(true);  
        t.start();  
    }  
      
    protected void paintComponent(Graphics g) {  
        Dimension sz = getSize();  
        for (int i=0; i<x1.length; i++) {  
            g.setColor(c[i]);  
            g.drawOval(x1[i],y1[i],x2[i],y2[i]);
           
        }  
        g.setColor(Color.RED);  
        g.drawString(x1[0]+","+y1[0]+","+x2[0]+","+y2[0]+"",5,sz.height-5);
    }  
      
    public void actionPerformed(ActionEvent evt) {  
        Dimension sz = getSize();  
        dx1 = test(x1[0],dx1,sz.width);  
        dx2 = test(x2[0],dx2,sz.width);  
        dy1 = test(y1[0],dy1,sz.height);  
        dy2 = test(y2[0],dy2,sz.height); 
        shift(x1,dx1, sz.width);  
        shift(y1,dy1, sz.width);  
        shift(x2,dx2, sz.height);  
        shift(y2,dy2, sz.height);  
        repaint();
    }  
      
    private int test(int v, int dv, int dim) {  
        if (v+dv>dim) {  
            return -(5+Math.abs(rand.nextInt(DELTA)));  
        } else if (v+dv<0) {  
            return 5+Math.abs(rand.nextInt(DELTA));  
        }  
        return  dv;  
    }  
    private void shift(int[] v, int dv, int dim) {  
        System.arraycopy(v, 0, v, 1, v.length-1); 
        v[0] += dv; 
        v[0] = Math.min(v[0],dim); 
    }  
      
   /* public static void main(String[] args) {  
        JFrame f = new JFrame();  
        f.getContentPane().setLayout(new GridLayout(1,1));  
        f.getContentPane().add(new Animacao(20, Color.BLUE, Color.WHITE));  
        f.setSize(320,240);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setVisible(true);  
    }*/  
}

