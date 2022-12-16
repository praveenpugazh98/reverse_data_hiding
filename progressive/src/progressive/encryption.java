/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package progressive;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.*;
import java.util.*;
import ij.*;
/**
 *
 * @author santhosh
 */
public class encryption {

    /**
     * @param args the command line arguments
     */
    
      


      

    public static void main(String[] args)throws Exception
    { //encryption encrypt=new encryption();
        //encrypt.random1();
        try{
       //BufferedImage bbq=new BufferedImage(512,512,BufferedImage.TYPE_INT_ARGB);

        BufferedImage buf=ImageIO.read(new File("C:\\1.jpg"));
      /*   BufferedImage share1=ImageIO.read(new File("C:\\images1.jpg"));
          BufferedImage share2=ImageIO.read(new File("C:\\images2.jpg"));
           BufferedImage share3=ImageIO.read(new File("C:\\images3.jpg"));
            BufferedImage share4=ImageIO.read(new File("C:\\images4.jpg"));
             BufferedImage share5=ImageIO.read(new File("C:\\images5.jpg"));*/
            //  BufferedImage share6=ImageIO.read(new File("C:\\images6.jpg"));
        int h=buf.getHeight();
        int w=buf.getWidth();
         new ImagePlus("original",buf).show();
         ImageIO.write(buf,"JPG",new File("D:\\first.jpg"));
  //BufferedImage original=getPixels(buf);
   BufferedImage share1encrypt=getPixels(buf);
    new ImagePlus("share1", share1encrypt).show();
    ImageIO.write(share1encrypt, "JPG",new File("D:\\share1.jpg"));
      BufferedImage share2encrypt=getPixels1(share1encrypt);
       new ImagePlus("share2",share2encrypt).show();
        ImageIO.write(share2encrypt, "JPG",new File("D:\\share2.jpg"));
       BufferedImage share3encrypt=getPixels2(share2encrypt);
        new ImagePlus("share3",share3encrypt).show();
         ImageIO.write(share3encrypt, "JPG",new File("D:\\share3.jpg"));
        BufferedImage share4encrypt=getPixels3(share3encrypt);
        new ImagePlus("share4",share4encrypt).show();
        ImageIO.write(share4encrypt, "JPG",new File("D:\\share4.jpg"));
         BufferedImage share5encrypt=getPixels4(share4encrypt);
         /* BufferedImage image1 = getimage1(buf,share1encrypt);
           BufferedImage image2 = getimage2(buf,share2encrypt);
            BufferedImage image3 = getimage3(buf,share3encrypt);
             BufferedImage image4 = getimage4(buf,share4encrypt);
              BufferedImage image5 = getimage5(buf,share5encrypt);*/
               
              
             
         
     
      
    
     
      
      new ImagePlus("share5",share5encrypt).show();
 
  ImageIO.write(share5encrypt, "JPG",new File("D:\\share5.jpg"));
     
               }
    catch(Exception e)
    {
    System.out.println(e);
    }
    }
     public static BufferedImage getImageFromArray(int width, int height, int[] pixels) {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       WritableRaster raster = image.getRaster();
       raster.setPixels(0, 0, width, height, pixels);
 //image.setRGB(0,0,width,height, pixels, 0,width);
        return image;

    }
     
      public static BufferedImage getImageFromArray1(int width, int height, int[] pixels) {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       WritableRaster raster = image.getRaster();
       raster.setPixels(0, 0, width,height, pixels);
 //image.setRGB(0,0,width,height, pixels, 0,width);
        return image;

    }
     
     public static BufferedImage getPixels(BufferedImage buf) throws Exception
     {
           
 
     
         Random rand1=new Random();
            Random rand2=new Random();
        
          try{
              File f1=new File("D:/red");
              File f2=new File("D:/green");
              File f3=new File("D:/blue");
              if(!(f1.isDirectory()))
              {
                  f1.mkdir();
              }
              if(!(f2.isDirectory()))
              {
                  f2.mkdir();
              }
              if(!(f3.isDirectory()))
              {
                  f3.mkdir();
              }
              FileWriter share1redfile=new FileWriter("D:/red/share1red.txt");
              FileWriter share1greenfile=new FileWriter("D:/green/share1green.txt");
             FileWriter share1bluefile=new FileWriter("D:/blue/share1blue.txt");
             
              
            
              PrintWriter share1redout=new PrintWriter(share1redfile);
              PrintWriter share1greenout=new PrintWriter(share1greenfile);
             PrintWriter share1blueout=new PrintWriter(share1bluefile);
          
       Thread t=new Thread();
int a=0,b=0,c=0,d=0,e=0,k=0,l=0;int g=0;
         for(int i=0;i<512;i++)
         {
             int r1=rand1.nextInt(512);
           
             for(int j=0;j<512;j++)
             {
   
            int r2=rand2.nextInt(512);

int ccc=buf.getRGB(i,j);
 //k++;
 // System.out.println("ccc is"+ccc+","+a++);
// System.out.println("rrr"+r1+","+r2+","+(ccc));
  WritableRaster ras=buf.getRaster();
       
 //int ccc1=buf.getRGB(i,j);
 //System.out.println("iii"+i+","+j+","+(sss[0]&0xff));
 
         int[] aaa=new int[3];
             
        
        aaa[0]=(ccc >>16)& 0xff;
        aaa[1]=(ccc >>8) & 0xff;
        aaa[2]=(ccc) & 0xff;
     
     if(((aaa[0])>=0) && ((aaa[0])<120))
      {
       //System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
        a++;
         // System.out.println("a is"+a);
 
    share1redout.println(i);
        share1greenout.println(j);
        int r=buf.getRGB(r1, r2);
         int s=buf.getRGB(i,j);
     
      buf.setRGB(i,j,0);
       // ras.setPixel(r1,r2,aaa);
        
       share1blueout.println(ccc);
       
        }
            else
        {
         
        }    
     }
         }
          share1redout.close();
            share1greenout.close();       
          share1blueout.close();   
        }
        catch(Exception e){}
         
            
     return buf;    
}
      public static BufferedImage getPixels1(BufferedImage buf1)
     {
           
 
     
         Random rand1=new Random();
            Random rand2=new Random();
        try{
              
            
              FileWriter share2redfile=new FileWriter("D:\\red/share2red.txt");
              FileWriter share2greenfile=new FileWriter("D:/green/share2green.txt");
     PrintWriter share2redout=new PrintWriter(share2redfile);
              PrintWriter share2greenout=new PrintWriter(share2greenfile);
               FileWriter share2bluefile=new FileWriter("D:\\blue\\share2blue.txt");
      PrintWriter share2blueout=new PrintWriter(share2bluefile);
    
              for(int i=0;i<512;i++)
         {
              int r1=rand1.nextInt(512);
             for(int j=0;j<512;j++)
             {
   
            int r2=rand2.nextInt(512);

  int ccc=buf1.getRGB(i,j);
 
  

         int[] aaa=new int[3];
             
        
        aaa[0]=(ccc >>16)& 0xff;
        aaa[1]=(ccc >>8) & 0xff;
        aaa[2]=(ccc) & 0xff;//
         WritableRaster ras=buf1.getRaster();
        if(((aaa[0])>=120)&& ((aaa[0])<165))
        {
           
         
      share2redout.println(i);
     buf1.setRGB(i,j,0);
        // System.out.println(" sec value is"+i+","+j);
        share2greenout.println(j);
        //System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
       //ras.setPixel(r1,r2,aaa);
     
       share2blueout.println(ccc);
        
                
            }
        else
        {
        // System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
        }
          }
         }
               share2redout.close();
            share2greenout.close();       
          share2blueout.close();   
        }
        catch(Exception e){}
               
     return buf1;
          }
      
       public static BufferedImage getPixels2(BufferedImage buf2)
     {
           
 
     
         Random rand1=new Random();
            Random rand2=new Random();
        try{
              
              FileWriter share3redfile=new FileWriter("D:/red/share3red.txt");
             
              FileWriter share3greenfile=new FileWriter("D:/green/share3green.txt");
      PrintWriter share3redout=new PrintWriter(share3redfile);
              PrintWriter share3greenout=new PrintWriter(share3greenfile);
               FileWriter share3bluefile=new FileWriter("D:\\blue\\share3blue.txt");
      PrintWriter share3blueout=new PrintWriter(share3bluefile);
    
              for(int i=0;i<512;i++)
         {
              int r1=rand1.nextInt(512);
             for(int j=0;j<512;j++)
             {
   
            int r2=rand2.nextInt(512);

  int ccc=buf2.getRGB(i,j);
 
  

         int[] aaa=new int[3];
             
        
        aaa[0]=(ccc >>16)& 0xff;
        aaa[1]=(ccc >>8) & 0xff;
        aaa[2]=(ccc) & 0xff;//
         WritableRaster ras=buf2.getRaster();
        if(((aaa[0])>=165)&& ((aaa[0])<201))
        {
           
         
      share3redout.println(i);
     buf2.setRGB(i,j,0);
        // System.out.println(" sec value is"+i+","+j);
        share3greenout.println(j);
        //System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
       //ras.setPixel(r1,r2,aaa);
     
       share3blueout.println(ccc);
        
                
            }
        else
        {
        // System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
        }
          }
         }
               share3redout.close();
            share3greenout.close();       
          share3blueout.close();   
        }
        catch(Exception e){}
              
     return buf2;
          }
      
       public static BufferedImage getPixels3(BufferedImage buf3) 
     {
           
 
     
         Random rand1=new Random();
            Random rand2=new Random();
        try{
              
              FileWriter share4redfile=new FileWriter("D:/red/share4red.txt");
              FileWriter share4bluefile=new FileWriter("D:\\blue\\share4blue.txt");
              FileWriter share4greenfile=new FileWriter("D:/green/share4green.txt");
      PrintWriter share4redout=new PrintWriter(share4redfile);
              PrintWriter share4greenout=new PrintWriter(share4greenfile);
              
      PrintWriter share4blueout=new PrintWriter(share4bluefile);
    
              for(int i=0;i<512;i++)
         {
             int r1=rand1.nextInt(512);
             for(int j=0;j<512;j++)
             {
    
            int r2=rand2.nextInt(512);

  int ccc=buf3.getRGB(i,j);
 
  

         int[] aaa=new int[3];
             
        
        aaa[0]=(ccc >>16)& 0xff;
        aaa[1]=(ccc >>8) & 0xff;
        aaa[2]=(ccc) & 0xff;
        // WritableRaster ras=buf.getRaster();
        if(((aaa[0]>200))&& ((aaa[0])<=220))
        {
          buf3.setRGB(i,j,0); 
        
       //System.out.println(" first value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
     
         // System.out.println("a is"+a);
       share4redout.println(i);
        share4greenout.println(j);
       // System.out.println(" for value is"+i+","+j);
       //ras.setPixel(r1,r2,aaa);
    
     share4blueout.println(ccc);
        
                
            }
        else
        {
         //System.out.println(" third value is"+aaa[0]+","+aaa[1]+","+aaa[2]);
        }
          }}
              share4redout.close();
            share4greenout.close();       
          share4blueout.close();    
        }
        catch(Exception e){}
               
     return buf3;
          }
      
       public static BufferedImage getPixels4(BufferedImage buf4)throws Exception
     {
           
 //BufferedImage bb=ImageIO.read(new File("C:\\images.jpeg"));
         BufferedImage bb=new BufferedImage(buf4.getWidth(),buf4.getHeight(),BufferedImage.TYPE_INT_RGB);
     WritableRaster rr=bb.getRaster();
         Random rand1=new Random();
            Random rand2=new Random();
              WritableRaster ras=buf4.getRaster();
        
        try{
              
              FileWriter share5redfile=new FileWriter("D:/red/share5red.txt");
             FileWriter share5bluefile=new FileWriter("D:\\blue\\share5blue.txt");
              FileWriter share5greenfile=new FileWriter("D:/green/share5green.txt");
      PrintWriter share5redout=new PrintWriter(share5redfile);
              PrintWriter share5greenout=new PrintWriter(share5greenfile);
               
      PrintWriter share5blueout=new PrintWriter(share5bluefile);
    Random rrd=new Random();
              for(int i=0;i<512;i++)
         {
             int r1=rand1.nextInt(512);
             for(int j=0;j<512;j++)
             {
    
            int r2=rand2.nextInt(512);
int rr1=rrd.nextInt(256);
int rr2=rrd.nextInt(256);
int rr3=rrd.nextInt(256);
  int ccc=buf4.getRGB(i,j);
   int[] zzz=new int[3];
    zzz[0]=rr1;
        zzz[1]=rr2;
        zzz[2]=rr3;
  

         int[] aaa=new int[3];
             
        
        aaa[0]=(ccc >>16)& 0xff;
        aaa[1]=(ccc >>8) & 0xff;
        aaa[2]=(ccc) & 0xff;
        
        if(((aaa[0]>220))&& ((aaa[0])<=255))
        {
            
        
      
      //buf4.setRGB(i,j,0);
         ras.setPixel(i,j,zzz);
       share5redout.println(i);
        share5greenout.println(j);
    
       share5blueout.println(ccc);
        
                
            }
        else
        {
                   
        }
      rr.setPixel(i,j,zzz);
      
          }
         }
               share5redout.close();
            share5greenout.close();       
          share5blueout.close();   
        }
        catch(Exception e){}
          
      ImageIO.write(bb,"JPG",new File("F:\\Encrypted.jpg"));
     return bb;
          }
      
       
     

  public static int[] getPixels11(BufferedImage image) {

        // pixels ;
 int[] l = new int[ image.getWidth()*image.getHeight()];
 int[]  pixels =new int[ image.getWidth()*image.getHeight()];

for(int i=0;i<511;i++){
    for(int j=0;j<511;j++){
         //int l=image.getRGB(i,j);
        l=image.getRGB(i,j,512, 512, pixels, 0,512);
         //pixels =new int[l & 0xff];
        
    }
}
       
      return l;

    }
  
  
  public static  int[] overlayimages1(int[] pixels1, int[] pixels2) {
        int[] pixels = new int[pixels1.length];
        for (int i = 0; i < 255; i++) {

            int p1CMYA = pixels1[i];
           
            int c1 = (p1CMYA >> 16) & 0xff;
            int m1 = (p1CMYA >> 8) & 0xff;
            int y1 = p1CMYA & 0xff;

            int p1RGB = 0xff000000 | (255 - c1) << 16 | (255 - m1) << 8 | (255 - y1);


            int p2CMYA = pixels2[i];
            
            int c2 = (p2CMYA >> 16) & 0xff;
            int m2 = (p2CMYA >> 8) & 0xff;
            int y2 = p2CMYA & 0xff;

            int p2RGB = 0xff000000  |  (255 - c2) << 16 | (255 - m2) << 8 | (255 - y2);
          pixels[i] = p1RGB ^ p2RGB;
        }
        return pixels; 
    }
}


