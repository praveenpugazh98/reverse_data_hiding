/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog.decryption;

import java.awt.*;
//import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.misc.BASE64Decoder;

/**
 *
 * @author santhosh
 */
public class ProgDecryption extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
      
   
static Container cont=null;

   static JFrame jf=new JFrame();
 int a,b,c,d,e1;
 static String path="";
 static String name1="";
   //static JPanel jp=new JPanel();
   static JButton jb=new JButton("WaterMark");
     static JButton ci=new JButton("Choose Watermark");
     static JButton jh=new JButton("Halftone");
     static JButton encry=new JButton("Encrypt");
static JTextField tf1=new JTextField("");
static JTextField tf2=new JTextField("");
static JLabel jl=new JLabel();
static JLabel share1icon=new JLabel("share1");
static JLabel share2icon=new JLabel("share2");
static JLabel share3icon=new JLabel("share3");
static JLabel share4icon=new JLabel("share4");
static JLabel share5icon=new JLabel("share5");
   static JMenuBar jmb=new JMenuBar();
    static JMenu jm=new JMenu("File");
   static JMenuItem jmi1=new JMenuItem("Open");
   static JMenuItem jmi3=new JMenuItem("Decode");
   static JMenuItem jmi2=new JMenuItem("Exit");
    public ProgDecryption(){
        jmb.setBackground(Color.BLACK);
        jmb.setBorder(null);
jm.setForeground(Color.LIGHT_GRAY);
        cont=getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.BLACK);
        jb.setBounds(50,300,200,50);
        jmb.setBounds(0,0,300,50);
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.yellow);
        jb.isBorderPainted();
jh.setBounds(50,375,200,50);
jh.setBackground(Color.BLACK);
jh.setForeground(Color.yellow);
        jh.addActionListener(this);
        encry.setBounds(50,450,200,50);
        encry.setBackground(Color.BLACK);
        encry.setForeground(Color.YELLOW);
        jl.setBounds(260,50,512,512);
        share1icon.setBounds(800,50,100,100);
        share2icon.setBounds(800,150,100,100);
        share3icon.setBounds(800,250,100,100);
        share4icon.setBounds(800,350,100,100);
        share5icon.setBounds(800,450,100,100);
         MouseListener listener = new DragMouseAdapter();
                jl.addMouseListener(listener);
                share1icon.addMouseListener(listener);
                share2icon.addMouseListener(listener);
                share3icon.addMouseListener(listener);
                share4icon.addMouseListener(listener);
                share5icon.addMouseListener(listener);
                jl.setTransferHandler(new TransferHandler("icon"));
                share1icon.setTransferHandler(new TransferHandler("icon"));
                share2icon.setTransferHandler(new TransferHandler("icon"));
                share3icon.setTransferHandler(new TransferHandler("icon"));
                share4icon.setTransferHandler(new TransferHandler("icon"));
                share5icon.setTransferHandler(new TransferHandler("icon"));
try{
     String loc=System.getProperty("user.dir");
    System.out.print(".............."+loc);
      File file1=new File(loc+"/src/images/download.jpg");
      File file2=new File(loc+"/src/images/download1.jpg");
       File file3=new File(loc+"/src/images/download2.jpg");
        File file4=new File(loc+"/src/images/download3.jpg");
         File file5=new File(loc+"/src/images/download4.jpg");
Image im1=ImageIO.read(file1);
Image im2=ImageIO.read(file2);
Image im3=ImageIO.read(file3);
Image im4=ImageIO.read(file4);
Image im5=ImageIO.read(file5);
Icon ic1=new ImageIcon(im1);
Icon ic2=new ImageIcon(im2);
Icon ic3=new ImageIcon(im3);
Icon ic4=new ImageIcon(im4);
Icon ic5=new ImageIcon(im5);

share1icon.setIcon(ic1);
share2icon.setIcon(ic2);
share3icon.setIcon(ic3);
share4icon.setIcon(ic4);
share5icon.setIcon(ic5);
        
        }
        catch(Exception e){}
       tf1.setBackground(Color.BLACK);
       tf1.setBounds(50,50,200,50);
       tf2.setBounds(50,100, 200,50);
       tf2.setBackground(Color.DARK_GRAY);
       tf1.setForeground(Color.yellow);
       tf2.setForeground(Color.YELLOW);
        ci.setBounds(50,200,200,50);
        jb.addActionListener(this);
        encry.addActionListener(this);
        ci.setBackground(Color.BLACK);
        ci.setForeground(Color.yellow);
         ci.addActionListener(this);
jmi1.addActionListener(this);
jmi2.addActionListener(this);
jmi3.addActionListener(this);

    jm.add(jmi1);
    jm.add(jmi3);
    jm.add(jmi2);
    jmb.add(jm);
    cont.add(tf1);
    cont.add(jmb);
    cont.add(jl);
    cont.add(share1icon);
    cont.add(share2icon);
    cont.add(share3icon);
    cont.add(share4icon);
    cont.add(share5icon);
    cont.setVisible(true);
    cont.setLocation(500,500);
    cont.setSize(900,600);
 JDialog jd=new JDialog();
    share2icon.setVisible(false);
    share3icon.setVisible(false);
    share4icon.setVisible(false);
    share5icon.setVisible(false);
    
    jd.add(cont);
    
  jd.setResizable(false);
  jd.setTitle("Progressive Visual Crytography");
    jd.setVisible(true);
    jd.setLocation(50,50);
    jd.setSize(950,600);
    jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }        
       
        
        public void actionPerformed(ActionEvent evt)
        {
            try
            {
        String open=(String)evt.getActionCommand();
        if(open.contains("Open"))
        {
        JFileChooser jfc=new JFileChooser();
           FileFilter filter=new FileNameExtensionFilter("JPEG Images","jpg","jpeg");
        jfc.setFileFilter(filter);
        int result=jfc.showOpenDialog(jfc);
        if(result==JFileChooser.APPROVE_OPTION)
        {
        tf1.setText(jfc.getSelectedFile().getAbsolutePath());
        try{
       jl.setIcon(new ImageIcon(ImageIO.read(new File(tf1.getText()))));
        }
        catch(Exception e)
        {}}
        }
        String decode=(String)evt.getActionCommand();
        if(decode.contains("Decode"))
        {
            Steganography model=new Steganography();
           
           JFileChooser jf=new JFileChooser();
          jf.showOpenDialog(jf);
          path=jf.getSelectedFile().getParent();
          String path1=jf.getSelectedFile().getAbsolutePath();
          String nmm=jf.getSelectedFile().getName();
          name1=nmm.substring(0,nmm.lastIndexOf("."));
          
        BufferedImage bbb=ImageIO.read(new File(path1));
              jl.setIcon(new ImageIcon(bbb));
              String message=model.decode(path, name1);
			System.out.println(path + ", " +name1);
             
             JPasswordField jps=new JPasswordField();
             jps.setBackground(Color.BLACK);
             jps.setForeground(Color.GREEN);
             JOptionPane.showConfirmDialog(null,jps,"Enter the Secret Key",JOptionPane.OK_CANCEL_OPTION);
             
        String ALGO = "AES";
        String keyValue=jps.getText();
        Key key = new SecretKeySpec(keyValue.getBytes(), ALGO);
        Cipher c = null;
     try {
                c = Cipher.getInstance(ALGO);
           
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(message);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
       
       
        if(decryptedValue!="")
        {
        JOptionPane.showMessageDialog(null,"the decrypted value is:"+"  "+decryptedValue);
        }
       
         }
            catch(Exception ex)
            {
               JOptionPane.showMessageDialog(null, "Enter valid Key");
            }
        }
         String exit=(String)evt.getActionCommand();
        if(exit.contains("Exit")){
        System.exit(0);
        }
            }
            catch(Exception ex)
            {
               // System.out.println(ex.getMessage());
            }
        }
         
        
        
         public static void main(String[] args) { 
   
        ProgDecryption pd=new ProgDecryption();
        
      
        }
         
         
class DragMouseAdapter extends MouseAdapter  {
        
public void mouseReleased(MouseEvent e)  {
   JLabel jj=(JLabel)e.getSource();
    decryption enc=new decryption();
        JComponent cmp = (JComponent) e.getSource();
        TransferHandler handler = cmp.getTransferHandler();
        if(jj.equals(share1icon))
        {
        handler.exportAsDrag(cmp, e, TransferHandler.LINK);
        
        
        Icon ic=jl.getIcon();
Image im=((ImageIcon)ic).getImage();
BufferedImage bb=(BufferedImage)im;
try{
BufferedImage bk=enc.getimage4(bb);
jl.setIcon(new ImageIcon(bk));

a=1;
share1icon.setVisible(false);
share2icon.setVisible(true);
}
catch(Exception ex)
{}
        }
 if(jj.equals(share2icon))
        {
        handler.exportAsDrag(cmp, e, TransferHandler.LINK);
        
        
        Icon ic1=jl.getIcon();
Image im1=((ImageIcon)ic1).getImage();
BufferedImage bb1=(BufferedImage)im1;
try{
BufferedImage bk1=enc.getimage3(bb1);
jl.setIcon(new ImageIcon(bk1));
b=1;
share2icon.setVisible(false);
share3icon.setVisible(true);
}
catch(Exception ex)
{}
    }
  if(jj.equals(share3icon))
        {
        handler.exportAsDrag(cmp, e, TransferHandler.LINK);
        
        
        Icon ic2=jl.getIcon();
Image im2=((ImageIcon)ic2).getImage();
BufferedImage bb2=(BufferedImage)im2;
try{
BufferedImage bk2=enc.getimage2(bb2);
jl.setIcon(new ImageIcon(bk2));
c=1;
share3icon.setVisible(false);
share4icon.setVisible(true);
}
catch(Exception ex)
{}
        }
 if(jj.equals(share4icon))
        {
        handler.exportAsDrag(cmp, e, TransferHandler.LINK);
        
        
        Icon ic3=jl.getIcon();
Image im3=((ImageIcon)ic3).getImage();
BufferedImage bb3=(BufferedImage)im3;
try{
BufferedImage bk3=enc.getimage1(bb3);
jl.setIcon(new ImageIcon(bk3));
d=1;
share4icon.setVisible(false);
share5icon.setVisible(true);
}
catch(Exception ex)
{}
}
  if(jj.equals(share5icon))
        {
        handler.exportAsDrag(cmp, e, TransferHandler.LINK);
        
        
        Icon ic4=jl.getIcon();
Image im4=((ImageIcon)ic4).getImage();
BufferedImage bb4=(BufferedImage)im4;
try{
BufferedImage bk4=enc.getimage(bb4);
ImageIO.write(bk4,"PNG",new File("F:/decrypted.png"));
jl.setIcon(new ImageIcon(bk4));
jl.setSize(512,512);
e1=1;
share5icon.setVisible(false);
}
catch(Exception ex)
{}
}
  int f=a+b+c+d+e1;
  if(f==5)
  {
      try{
      JFileChooser jff=new JFileChooser();
      
      FileFilter filter=new FileNameExtensionFilter(".png","png");
       jff.setFileFilter(filter);
      int result=jff.showSaveDialog(jff);
    if(result==JFileChooser.APPROVE_OPTION)
    {
     
      String path=jff.getSelectedFile().getAbsolutePath();
      //System.out.println(path);
       Icon ic4=jl.getIcon();
Image im4=((ImageIcon)ic4).getImage();
      ImageIO.write((BufferedImage)im4, "PNG", new File(path+filter.getDescription()));
      
  }
      }
    
  catch(Exception ex)
  {}
}
}
}

}
