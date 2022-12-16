/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prog.decryption;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.util.*;
import ij.*;
/**
 *
 * @author santhosh
 */
public class decryption {

    /**
     * @param args the command line arguments
     */
   
        

    public static void main(String[] args)throws Exception
    { //decryption encrypt=new decryption();
        //encrypt.random1();
        try{
       //BufferedImage bbq=new BufferedImage(512,512,BufferedImage.TYPE_INT_ARGB);

        BufferedImage buf=ImageIO.read(new File("D:\\share5.jpg"));
      
        int h=buf.getHeight();
        int w=buf.getWidth();
  BufferedImage original=getimage(buf);
  new ImagePlus("original",original).show();
  ImageIO.write(original,"JPG",new File("D:\\decryption.jpg"));
   BufferedImage share1encrypt=getimage1(original);
     new ImagePlus("share1", share1encrypt).show();

     ImageIO.write(share1encrypt, "JPG",new File("D:\\decryption1.jpg"));
      BufferedImage share2encrypt=getimage2(share1encrypt);
        new ImagePlus("share2",share2encrypt).show();
 
         ImageIO.write(share2encrypt, "JPG",new File("D:\\share2.jpg"));
 
       BufferedImage share3encrypt=getimage3(share2encrypt);
         new ImagePlus("share3",share3encrypt).show();

       BufferedImage share4encrypt=getimage4(share3encrypt);

        
              
             
         
    
    
       
    
      new ImagePlus("share4",share4encrypt).show();
    
  


    ImageIO.write(share4encrypt, "JPG",new File("E:\\share4.jpg"));
  
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
 
        return image;

    }
     
      public static BufferedImage getImageFromArray1(int width, int height, int[] pixels) {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
       WritableRaster raster = image.getRaster();
       raster.setPixels(0, 0, width,height, pixels);

        return image;

    }
     
   
     public static BufferedImage getimage(BufferedImage bi)
     {BufferedImage mg=new BufferedImage(512,512,BufferedImage.TYPE_INT_ARGB); 
     
         try
         {
             
                     
  
   BufferedReader share5redfile=new BufferedReader(new FileReader("D:/red/share5red.txt"));
       BufferedReader share5greenfile=new BufferedReader(new FileReader("D:/green/share5green.txt"));
        BufferedReader share5bluefile=new BufferedReader(new FileReader("D:/blue/share5blue.txt"));
 
    int red1,green1,blue1;
  int red2,green2,blue2; int red3,green3,blue3;
  int  red4,green4,blue4; String red5,green5,blue5;      int red,green,blue;
int bh=0,ah=0,ch=0,dh=0,eh=0;

    for(int i=0;i<512;i++)
         {
           
             for(int j=0;j<512;j++)
             {
              eh++; 
              
   
              red5=share5redfile.readLine();
        red=Integer.parseInt(red5);
              green5=share5greenfile.readLine();
                  blue5=share5bluefile.readLine();
                 green=Integer.parseInt(green5);
                 blue=Integer.parseInt(blue5);
              
               bi.setRGB(red,green,blue); 
                //System.out.println("thi"+red+","+green);
              

             }
             }
         }
         
catch(Exception e){}

return bi;

}
     
public static BufferedImage getimage1(BufferedImage bi1)
     {
   

         try
         {
     BufferedReader share4redfile=new BufferedReader(new FileReader("D:/red/share4red.txt"));
       BufferedReader share4greenfile=new BufferedReader(new FileReader("D:/green/share4green.txt"));
        BufferedReader share4bluefile=new BufferedReader(new FileReader("D:/blue/share4blue.txt"));
    String red4,blue4,green4;int red,green,blue;
      for(int i=0;i<512;i++)
         {
             for(int j=0;j<512;j++)
             {
         
     //int share1=bi1.getRGB(i, j);
     
 red4=share4redfile.readLine();
        red=Integer.parseInt(red4);
              green4=share4greenfile.readLine();
                  blue4=share4bluefile.readLine();
                 green=Integer.parseInt(green4);
                 blue=Integer.parseInt(blue4);
                //System.out.print((char)red5);
               bi1.setRGB(red,green,blue); 
               // System.out.println("sec"+red+","+green);
              
         }
         }
         }
         catch(Exception e){}
return bi1;

}

public static BufferedImage getimage2(BufferedImage bi2)
     {


         try
         {
     BufferedReader share3redfile=new BufferedReader(new FileReader("D:/red/share3red.txt"));
       BufferedReader share3greenfile=new BufferedReader(new FileReader("D:/green/share3green.txt"));
        BufferedReader share3bluefile=new BufferedReader(new FileReader("D:/blue/share3blue.txt"));
    String red3,blue3,green3;int red,green,blue;
    Random rd=new Random();int l=0;

      for(int i=0;i<512;i++)
         {
             for(int j=0;j<512;j++)
             {
l=rd.nextInt(512);
     //int share1=bi1.getRGB(i, j);

 red3=share3redfile.readLine();
        red=Integer.parseInt(red3);
              green3=share3greenfile.readLine();
                  blue3=share3bluefile.readLine();
                 green=Integer.parseInt(green3);
                 blue=Integer.parseInt(blue3);
                //System.out.print((char)red5);
               
                 
               bi2.setRGB(red,green,blue);
               // System.out.println(red+","+green);
                 
             }
         }
         }
         catch(Exception e){}
return bi2;

}
public static BufferedImage getimage3(BufferedImage bi3)
     {


         try
         {
     BufferedReader share3redfile=new BufferedReader(new FileReader("D:/red/share2red.txt"));
       BufferedReader share3greenfile=new BufferedReader(new FileReader("D:/green/share2green.txt"));
        BufferedReader share3bluefile=new BufferedReader(new FileReader("D:/blue/share2blue.txt"));
    String red3,blue3,green3;int red,green,blue;
    Random rd=new Random();
    int l=0;

      for(int i=0;i<512;i++)
         {
             for(int j=0;j<512;j++)
             {

     //int share1=bi1.getRGB(i, j);
l=rd.nextInt(512);
 red3=share3redfile.readLine();
        red=Integer.parseInt(red3);
              green3=share3greenfile.readLine();
                  blue3=share3bluefile.readLine();
                 green=Integer.parseInt(green3);
                 blue=Integer.parseInt(blue3);
                //System.out.print((char)red5);
                 if(green3!=null)
                 {
               bi3.setRGB(red,green,blue);
               // System.out.println(red+","+green);
                 }
         else{
 bi3.setRGB(red,l,blue);

 }
             }
         }
         }
         catch(Exception e){}
return bi3;

}
public static BufferedImage getimage4(BufferedImage bi4)
     {

WritableRaster rs=bi4.getRaster();

         try
         {
     BufferedReader share2redfile=new BufferedReader(new FileReader("D:/red/share1red.txt"));
       BufferedReader share2greenfile=new BufferedReader(new FileReader("D:/green/share1green.txt"));
        BufferedReader share2bluefile=new BufferedReader(new FileReader("D:/blue/share1blue.txt"));
    String red2,blue2,green2;int red,green,blue;
    Random rd=new Random();
    int l=0;
     int[] zzz=new int[3];
    zzz[0]=223;
        zzz[1]=105;
        zzz[2]=101;
  
      for(int i=0;i<512;i++)
         {
             for(int j=0;j<512;j++)
             {
l=rd.nextInt(512);
     //int share1=bi1.getRGB(i, j);
 
 red2=share2redfile.readLine();
        red=Integer.parseInt(red2);
              green2=share2greenfile.readLine();
                  blue2=share2bluefile.readLine();
                 green=Integer.parseInt(green2);
                 blue=Integer.parseInt(blue2);
                 if(green2!=null)
                          {

                //System.out.print((char)red5);
               bi4.setRGB(red,green,blue);
                 
                 }
                
         }
         }
         }
         catch(Exception e){}
return bi4;

}


}


