
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package progressive;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;
import javax.swing.plaf.InternalFrameUI;
import javax.imageio.*;
import java.awt.event.*;
import ij.ImagePlus;
import ij.process.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import sun.misc.*;
import java.io.*;
import java.sql.Statement;
//import java.lang.*;
import javax.imageio.ImageIO;

public class Main extends JFrame implements ActionListener,FocusListener  {
static Container cont=null;
NewJFrame login;
    JFrame jf=new JFrame();
 
   Statement st;
   static JButton jb=new JButton("WaterMark");
     static JButton ci=new JButton("Choose Watermark");
     static JButton jh=new JButton("Halftone");
     static JButton encry=new JButton("Hide Information");
static JTextField tf1=new JTextField("");
static JTextField tf2=new JTextField("");
static JTextField tf3=new JTextField("");
static JLabel jl=new JLabel("original");
static JLabel share1icon=new JLabel("share1");
static JLabel share2icon=new JLabel("share2");
static JLabel share3icon=new JLabel("share3");
static JLabel share4icon=new JLabel("share4");
static JLabel share5icon=new JLabel("share5");
   static JMenuBar jmb=new JMenuBar();
    static JMenu jm=new JMenu("File");
   static JMenuItem jmi1=new JMenuItem("Open");
   static JMenuItem jmi2=new JMenuItem("Exit");
  
    public Main(){
        jmb.setBackground(Color.BLACK);
        jmb.setBorder(null);
jm.setForeground(Color.GREEN);
        cont=getContentPane();
        cont.setLayout(null);
        cont.setBackground(Color.BLACK);
        jb.setBounds(50,250,150,50);
        jmb.setBounds(0,0,300,50);
        jb.setBackground(Color.BLACK);
        jb.setForeground(Color.GREEN);
        jb.isBorderPainted();
jh.setBounds(50,375,200,50);
jh.setBackground(Color.BLACK);
jh.setForeground(Color.GREEN);
        jh.addActionListener(this);
        encry.setBounds(50,300,150,50);
        encry.setBackground(Color.BLACK);
        encry.setForeground(Color.GREEN);
        jl.setBounds(260,50,512,512);
        //jl.setTransferHandler(new TransferHandler("text"));
        //jl.addMouseListener(new fl());
        jl.addMouseListener(new DragMouseAdapter());
        share1icon.setBounds(800,50,100,100);
        share2icon.setBounds(800,150,100,100);
        share3icon.setBounds(800,250,100,100);
        share4icon.setBounds(800,350,100,100);
        share5icon.setBounds(800,450,100,100);
       MouseListener listener = new DragMouseAdapter();
                jl.addMouseListener(listener);
                share1icon.addMouseListener(listener);
                share2icon.setVisible(false);
                share2icon.addMouseListener(listener);
                 share3icon.setVisible(false);
                share3icon.addMouseListener(listener);
                 share4icon.setVisible(false);
                share4icon.addMouseListener(listener);
                 share5icon.setVisible(false);
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
       tf1.setBounds(50,50,150,50);
       tf2.setBounds(50,100, 150,50);
       tf3.setBounds(50,150, 150,50);
       tf1.setBackground(Color.BLACK);
       tf1.setForeground(Color.GREEN);
       tf2.setBackground(Color.BLACK);
       tf2.setForeground(Color.GREEN);
       tf3.setBackground(Color.BLACK);
       tf3.setForeground(Color.GREEN);
       tf3.setText("Enter Secret Data");
       tf3.addFocusListener(this);
       ci.setBounds(50,200,150,50);
        jb.addActionListener(this);
        encry.addActionListener(this);
        ci.setBackground(Color.BLACK);
        ci.setForeground(Color.GREEN);
         ci.addActionListener(this);
jmi1.addActionListener(this);
jmi2.addActionListener(this);
//cont.add(jh);
    jm.add(jmi1);
    jm.add(jmi2);
    jmb.add(jm);
    cont.add(tf1);
    cont.add(tf2);
    cont.add(tf3);
    cont.add(jmb);
    cont.add(jl);
    cont.add(ci);
    cont.add(jb);
    cont.add(encry);
    cont.add(share1icon);
    cont.add(share2icon);
    cont.add(share3icon);
    cont.add(share4icon);
    cont.add(share5icon);
    cont.setVisible(true);
    cont.setLocation(500,500);
    cont.setSize(900,600);
   
  

JDialog dj=new JDialog();
dj.add(cont);
dj.setVisible(true);
dj.setLocation(100,50);
dj.setSize(950, 600);
 dj.setModal(true);
    
 //  dj.setDefaultLookAndFeelDecorated(true);     
 dj.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
 

    }
  

 private BufferedImage getbuf(BufferedImage b,int type)
 {
      BufferedImage b1=new BufferedImage(jl.getWidth(),jl.getHeight(),type);
  
	Graphics2D g = b1.createGraphics();
	g.drawImage(b, 0, 0,jl.getWidth(),jl.getHeight(), null);
	g.dispose();	
	g.setComposite(AlphaComposite.Src);
 
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
 
	    

  return b1 ;
 }
    public void actionPerformed(ActionEvent evt)
    {
        login=new NewJFrame();
        BufferedImage buf1=null;
      String san1=null;String san2=null;
       // String san1, san2;
      BufferedImage buf2=null;
    String open=(String)evt.getActionCommand();
    if(open.contains("Open"))
    {
    JFileChooser jf1=new JFileChooser();
    jf1.showOpenDialog(jf1);
    tf1.setText(jf1.getSelectedFile().getAbsolutePath());
    
  
   
    try{
         
       // System.out.println(login.jTextField1.getText());
        
    buf1=ImageIO.read(new File(jf1.getSelectedFile().getAbsolutePath()));
   // BufferedImage b=getbuf(buf1,buf1.getType());
    int wid=jl.getWidth();
    int hei=jl.getHeight();
     int wid1=buf1.getWidth();
    int hei1=buf1.getHeight();
    if((wid==wid1)&&(hei==hei1))
    {
     Icon ic=new ImageIcon(buf1);
    jl.setIcon(ic);
    System.out.println("/////"+login.uname);
        String qry="update detail set imgname='"+tf1.getText()+"' where uname='"+login.uname+"'";
            System.out.println(qry);
           st=new MyConnection().dbConnection();
           
         st.executeUpdate(qry);
    
   //jf.setContentPane(new ImageP(buf));
    }
    else
    {
        JOptionPane.showMessageDialog(jl,"The Image Size Should Be"+jl.getWidth()+"x"+jl.getHeight());
    }
    }
    catch(Exception e){
    e.getMessage();}
    }
 if(open.contains("Exit"))
    {
    System.exit(0);
    }
    String water=(String)evt.getActionCommand();
    if(water.contains("Choose Watermark"))
    {
     JFileChooser jf2=new JFileChooser();
    jf2.showOpenDialog(jf2);
    tf2.setText(jf2.getSelectedFile().getAbsolutePath());
    try{
   buf2=ImageIO.read(new File(jf2.getSelectedFile().getAbsolutePath()));
   System.out.println("santhosh");
    }
   
    catch(Exception e)
    {
        e.getMessage();
    }}
        
    String set=(String)evt.getActionCommand();
    if(set.contentEquals("WaterMark"))
    { BufferedImage buf3=null;BufferedImage buf4=null;
        // System.out.println("sandy");
        try{
           // System.out.println("sand");
         buf3=ImageIO.read(new File(tf1.getText()));
        buf4=ImageIO.read(new File(tf2.getText()));
 System.out.println(tf1.getText());

        
    int[] watermark=null;
    watermark=overlayimages1(getPixels(buf4),getPixels(buf3));
    
   // System.out.println("sandman");
   

   BufferedImage result=new BufferedImage(buf3.getHeight(),buf3.getHeight(),BufferedImage.TYPE_INT_RGB);
   result.setRGB(0, 0, buf3.getWidth(), buf3.getHeight(), watermark, 0, buf3.getWidth());
 //Image image=result.getScaledInstance(buf1.getWidth(),buf1.getHeight(),0);
  Image img=  new ImagePlus("Final watermark Result Image",result).getImage();
  BufferedImage bi= new ImagePlus("Final watermark Result Image",result).getBufferedImage();
   //Image img=new ImagePlus("waterMark",getImageFromArray(buf3.getWidth(),buf3.getHeight(),watermark)).getImage();
 //  int [] halftone=doErrorDiffuse(buf3.getWidth(),buf3.getHeight(),watermark);
  
/*BufferedImage rgbImage = new BufferedImage(512,512, BufferedImage.TYPE_INT_RGB);

        ColorConvertOp op = new ColorConvertOp(null);
        op.filter(bi, rgbImage);

        ImageIO.write(rgbImage, "JPEG", new File("C:\\example-rgb.jpg"));*/

   Icon ic1=new ImageIcon(bi);
   jl.setIcon(ic1);
//new ImagePlus("Final watermark Result Image", getImageFromArray(buf3.getWidth(),buf3.getHeight(), halftone)).show();

    // Image img1= new ImagePlus("water", getImageFromArray(buf3.getWidth(),buf3.getHeight(), halftone)).getImage();

    ImageIO.write(bi,"JPG",new File("C:\\watermark.jpg"));

System.out.println("you are succeeded");
   }
   catch(Exception e)
   {
   System.out.println(e.getMessage());
   }
    }
String half=(String)evt.getActionCommand();
if(half.contains("Halftone"))
{
BufferedImage buf5=null;
BufferedImage buf6=null;
try{
   File file=new File("C:\\watermark.jpg");
doFilter(file);
Image im=ImageIO.read(file);
Icon ic=new ImageIcon(im);
jl.setIcon(ic);
        //int [] watermark=getPixels(buf5);
       //  int [] halftone=doErrorDiffuse(buf5.getWidth(),buf5.getHeight(),watermark);
//new ImagePlus("Final watermark Result Image", getImageFromArray(buf5.getWidth(),buf5.getHeight(),halftone)).show();


}
catch(Exception e)
{}
}
String encr=(String)evt.getActionCommand();
if(encr.contains("Hide Information"))
{
   

    try{
        Steganography steg=new Steganography();
        BufferedImage image = steg.user_space(ImageIO.read(new File(tf1.getText())));
   String ALGO = "AES";
   byte[] keyValue =new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
   //String keyValue=tf2.getText();
     Key key = new SecretKeySpec(keyValue, ALGO);
    String secret =tf3.getText();
        
       // String passwordDec = testencrypt.decrypt(passwordEnc);

        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(secret.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
			 BufferedImage outimage= steg.add_text(image,encryptedValue);
                         Icon ic=new ImageIcon(outimage);
    jl.setIcon(ic); 
    JOptionPane.showMessageDialog(null,"The Data Hidden Into The Image");
  
    }
catch(Exception e)
{}

}
    }
      
    public static BufferedImage getImageFromArray(int width, int height, int[] pixels) {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        //WritableRaster raster = image.getRaster();
        //raster.setPixels(0, 0, width, height, pixels);
        image.setRGB(0,0,width,height, pixels, 0,width);
        return image;

    }
public void doFilter(File file)
{
    try{
Image image=ImageIO.read(file);
Image image1=null;
Image image2=null;
//Grayscale gray=new Grayscale();
//image1=Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image.getSource(),gray));

//ErrorDiffuseFilter EDFilter1 = new ErrorDiffuseFilter();
           // image2 = Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image1.getSource(), EDFilter1));

ImageIO.write(toBufferedImage(image2),"JPG",file);
    }
    catch(Exception e)
    {}
}
     public static BufferedImage toBufferedImage(Image image)
    {
        if(image instanceof BufferedImage)
            return (BufferedImage)image;
        image = (new ImageIcon(image)).getImage();
        boolean hasAlpha = false;
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
         int transparency = 1;
            if(hasAlpha)
                transparency = 2;
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();
            bimage = gc.createCompatibleImage(image.getWidth(null), image.getHeight(null), transparency);

        if(bimage == null)
        {
            int type = 1;
            if(hasAlpha)
                type = 2;
            bimage = new BufferedImage(image.getWidth(null), image.getHeight(null),BufferedImage.TYPE_INT_RGB);
        }
        Graphics g = bimage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bimage;
    }
     public static int[] getPixels(BufferedImage image) {

        int[] pixels;

        pixels= new int[image.getWidth() * image.getHeight()];


        return image.getRGB(0, 0, image.getWidth(), image.getHeight(), pixels, 0, image.getWidth());

    }
    
    public static void main(String[] args) {
        Main m=new Main();
        
        
    }

    public  int[] overlayimages1(int[] pixels1, int[] pixels2) {
        int[] pixels = new int[pixels1.length];
        for (int i = 0; i < pixels1.length; i++) {

            int p1CMYA = pixels1[i];
           
           /* int c1 = (p1CMYA >> 16) & 0xff;
            int m1 = (p1CMYA >> 8) & 0xff;
            int y1 = p1CMYA & 0xff;*/
            int[] cc=new int[3];
            cc[0]=(p1CMYA >> 16) & 0xff;
           cc[1]=(p1CMYA >> 8) & 0xff;
           cc[2]=p1CMYA & 0xff;
           int c=(255-cc[0]);
           int m=(255-cc[1]);
           int y=(255-cc[2]);
            //int p2RGB = 0xff000000  |  (255- c2) <<16 | (255- m2) << 8 | (255- y2);
            int p1RGB =  0xff000000|(255+c)<<16|(255+m)<<8|(255+y);

           // int p1RGB = 0xff000000 | (255- c1) << 16 | (255- m1) << 8 | (255- y1);

//int p1RGB = 0xff000000 |  c1  | m1 | y1;

            int p2CMYA = pixels2[i];
           int[] cc1=new int[3];
            /*int c2 = (p2CMYA >> 16) & 0xff;
            int m2 = (p2CMYA >> 8) & 0xff;
            int y2 = p2CMYA & 0xff;*/
           cc1[0]=(p2CMYA >> 16) & 0xff;
           cc1[1]=(p2CMYA >> 8) & 0xff;
           cc1[2]=p2CMYA & 0xff;
            int c1=(255-cc1[0]);
           int m1=(255-cc1[1]);
           int y1=(255-cc1[2]);
            //int p2RGB = 0xff000000  |  (255- c2) <<16 | (255- m2) << 8 | (255- y2);
            int p2RGB = 0xff000000|(c1)<<16|(m1)<<8|(y1);
          pixels[i] = p1RGB ^ p2RGB;
        }
        return pixels; 
    }

    public void focusGained(FocusEvent e) {
        tf3.setToolTipText("Enter the Secret Information");
       if(tf3.getText().contains("Enter Secret Data"))
       {
           tf3.setText("");
       }
       
    }

    /*public void focusLost(FocusEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
*/

    public void focusLost(FocusEvent e) {
       
    }


        
        
 class fl implements MouseListener{
    
 public void mouseEntered(MouseEvent fe)
 {
     
     JLabel jl1=(JLabel)fe.getSource();
     if(jl1.equals(share1icon))
     {
     try{
          
         Image im1=ImageIO.read(new File("C:\\share1.jpg"));
         if(im1!=null)
         {
 jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\share1.jpg"))));
 }
         else{
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\images1.jpg"))));
         
         }
     }
 catch(Exception e)
 {}}
    if(jl1.equals(share2icon))
     {
     try{
         Image im1=ImageIO.read(new File("C:\\share2.jpg"));
         if(im1!=null)
         {
 jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\share2.jpg"))));
 }
         else{
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\images2.jpg"))));
         }
     
     }
 catch(Exception e)
 {}  
 }
  if(jl1.equals(share3icon))
     {
     try{
          Image im1=ImageIO.read(new File("C:\\share3.jpg"));
          if(im1!=null)
          {
 jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\share3.jpg"))));
 }
          else{
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\images3.jpg"))));
          }
     
     }
     
 catch(Exception e)
 {}
     }
  if(jl1.equals(share4icon))
     {
     try{
         Image im1=ImageIO.read(new File("C:\\share4.jpg"));
         if(im1!=null)
         {
 jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\share4.jpg"))));
            
 }
     
     else{
  jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\images4.jpg"))));
  
  }
     }
 catch(Exception e)
 {}
     }
   if(jl1.equals(share5icon))
     {
     try{
       Image im1=ImageIO.read(new File("C:\\share5.jpg")); 
       if(im1!=null)
       {
 jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\share5.jpg"))));
 }
       else{
       jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\images5.jpg"))));
       }
     
     }
 catch(Exception e)
 {}
     }
 }
public void mouseExited(MouseEvent fe)
{
 JLabel jl1=(JLabel)fe.getSource();
     if(jl1.equals(share1icon))
     {
     try{
         Image im1=ImageIO.read(new File("C:\\first.jpg"));
         Image im11=ImageIO.read(new File("C:\\watermark.jpg"));
         Icon ic=new ImageIcon(im1);
         Icon ic1=new ImageIcon(im11);
         if(im1!=null)
         {
 //jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\first.jpg"))));
       jl.setIcon(ic);
         }
         
         else if(im11!=null)
         {
        // jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
          jl.setIcon(ic1);
         }
         else
         {
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\1.jpg"))));
         }
     }
     
 catch(Exception e)
 {}}
    if(jl1.equals(share2icon))
     {
     try{
         
 //jl1.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         Image im1=ImageIO.read(new File("C:\\first.jpg"));
         Image im11=ImageIO.read(new File("C:\\watermark.jpg"));
         
         if(im1!=null)
         {
        jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\first.jpg"))));
        }
         
         else if(im11!=null)
         {
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         
         }
         else
         {
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\1.jpg"))));
         }
 }
 catch(Exception e)
 {}  
 }
  if(jl1.equals(share3icon))
     {
     try{
         
 //jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         Image im1=ImageIO.read(new File("C:\\first.jpg"));
         Image im11=ImageIO.read(new File("C:\\watermark.jpg"));
         
         if(im1!=null)
         {
        jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\first.jpg"))));
        }
         
         else if(im11!=null)
         {
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         
         }
         else
         {
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\1.jpg"))));
         }
 }
 catch(Exception e)
 {}
     }
  if(jl1.equals(share4icon))
     {
     try{
         Image im1=ImageIO.read(new File("C:\\first.jpg"));
         Image im11=ImageIO.read(new File("C:\\watermark.jpg"));
         
         if(im1!=null)
         {
        jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\first.jpg"))));
        }
         
         else if(im11!=null)
         {
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         
         }
         else
         {
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\1.jpg"))));
         }
         
 //jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
 }
 catch(Exception e)
 {}
     }
   if(jl1.equals(share5icon))
     {
     try{
         Image im1=ImageIO.read(new File("C:\\first.jpg"));
         Image im11=ImageIO.read(new File("C:\\watermark.jpg"));
         
         if(im1!=null)
         {
        jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\first.jpg"))));
        }
         
       else  if(im11!=null)
         {
         jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
         
         }
         else
         {
          jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\1.jpg"))));
         }
// jl.setIcon(new ImageIcon(ImageIO.read(new File("C:\\watermark.jpg"))));
 }
 catch(Exception e)
 {}
     }
}

        public void mousePressed(MouseEvent e)
        {
           
        }
        

        public void mouseClicked(MouseEvent e) {
           
        }

        
        
        public void mouseReleased(MouseEvent e) {
           
        }


}

class DragMouseAdapter extends MouseAdapter  {
        
public void mouseReleased(MouseEvent e)  {
   JLabel jj=(JLabel)e.getSource();
    encryption enc=new encryption();
        JComponent c = (JComponent) e.getSource();
        TransferHandler handler = c.getTransferHandler();
        if(jj.equals(share1icon))
        {
        handler.exportAsDrag(c, e, TransferHandler.LINK);
        Icon ic=jl.getIcon();
Image im=((ImageIcon)ic).getImage();
BufferedImage bb=(BufferedImage)im;
try{
BufferedImage bk=encryption.getPixels(bb);
jl.setIcon(new ImageIcon(bk));
share2icon.setVisible(true);
share1icon.setVisible(false);
}
catch(Exception ex)
{}
        }
 if(jj.equals(share2icon))
        {
        handler.exportAsDrag(c, e, TransferHandler.LINK);
        
        
        Icon ic1=jl.getIcon();
Image im1=((ImageIcon)ic1).getImage();
BufferedImage bb1=(BufferedImage)im1;
try{
BufferedImage bk1=encryption.getPixels1(bb1);
jl.setIcon(new ImageIcon(bk1));
share3icon.setVisible(true);
share2icon.setVisible(false);
}
catch(Exception ex)
{}
    }
  if(jj.equals(share3icon))
        {
        handler.exportAsDrag(c, e, TransferHandler.LINK);
        
        
        Icon ic2=jl.getIcon();
Image im2=((ImageIcon)ic2).getImage();
BufferedImage bb2=(BufferedImage)im2;
try{
BufferedImage bk2=encryption.getPixels2(bb2);
jl.setIcon(new ImageIcon(bk2));
share4icon.setVisible(true);
share3icon.setVisible(false);
}
catch(Exception ex)
{}
        }
 if(jj.equals(share4icon))
        {
        handler.exportAsDrag(c, e, TransferHandler.LINK);
        
        
        Icon ic3=jl.getIcon();
Image im3=((ImageIcon)ic3).getImage();
BufferedImage bb3=(BufferedImage)im3;
try{
BufferedImage bk3=encryption.getPixels3(bb3);
jl.setIcon(new ImageIcon(bk3));
share5icon.setVisible(true);
share4icon.setVisible(false);
}
catch(Exception ex)
{}
}
  if(jj.equals(share5icon))
        {
        handler.exportAsDrag(c, e, TransferHandler.LINK);
        
        
        Icon ic4=jl.getIcon();
Image im4=((ImageIcon)ic4).getImage();
BufferedImage bb4=(BufferedImage)im4;
try{
BufferedImage bk4=encryption.getPixels4(bb4);
jl.setIcon(new ImageIcon(bk4));
share1icon.setVisible(true);
//share2icon.setVisible(true);
//share3icon.setVisible(true);
share5icon.setVisible(false);
}
catch(Exception ex)
{}
}
}
}
}
 
