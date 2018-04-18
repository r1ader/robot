package test;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * 屏幕上查找指定图片
 *
 * @author Jeby Sun
 * @date 2014-09-13
 * @website http://www.jebysun.com
 */
public class ImageFind {

    BufferedImage screenShotImage;    //屏幕截图
    BufferedImage keyImage;           //查找目标图片

    int scrShotImgWidth;              //屏幕截图宽度
    int scrShotImgHeight;             //屏幕截图高度

    int keyImgWidth;                  //查找目标图片宽度
    int keyImgHeight;                 //查找目标图片高度

    int[][] screenShotImageRGBData;   //屏幕截图RGB数据
    int[][] keyImageRGBData;          //查找目标图片RGB数据

    int[][][] findImgData;            //查找结果，目标图标位于屏幕截图上的坐标数据 
    boolean debug=true;
    public ImageFind(String keyImagePath) {
        try {
            
            BufferedImage screenshot = (new Robot()).createScreenCapture(new Rectangle(0,  
                    0,1900,1000));
            screenShotImage = screenshot;
            
        keyImage = this.getBfImageFromPath(keyImagePath);
        screenShotImageRGBData = this.getImageGRB(screenShotImage);
        keyImageRGBData = this.getImageGRB(keyImage);
        scrShotImgWidth = screenShotImage.getWidth();
        scrShotImgHeight = screenShotImage.getHeight();
        keyImgWidth = keyImage.getWidth();
        keyImgHeight = keyImage.getHeight();

//开始查找
        this.findImage();
        } catch (AWTException ex) {
            Logger.getLogger(ImageFind.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * 全屏截图
     *
     * @return 返回BufferedImage
     */
    public BufferedImage getFullScreenShot() {
        BufferedImage bfImage = null;
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        try {
            Robot robot = new Robot();
            bfImage = robot.createScreenCapture(new Rectangle(0, 0, width, height));
        } catch (AWTException e) {
            e.printStackTrace();
        }
        return bfImage;
    }

    /**
     * 从本地文件读取目标图片
     *
     * @param keyImagePath - 图片绝对路径
     * @return 本地图片的BufferedImage对象
     */
    public BufferedImage getBfImageFromPath(String keyImagePath) {
        BufferedImage bfImage = null;
        try {
            bfImage = ImageIO.read(new File(keyImagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bfImage;
    }

    /**
     * 根据BufferedImage获取图片RGB数组
     *
     * @param bfImage
     * @return
     */
    public int[][] getImageGRB(BufferedImage bfImage) {
        int width = bfImage.getWidth();
        int height = bfImage.getHeight();
        int[][] result = new int[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                //使用getRGB(w, h)获取该点的颜色值是ARGB，而在实际应用中使用的是RGB，所以需要将ARGB转化成RGB，即bufImg.getRGB(w, h) & 0xFFFFFF。
                result[h][w] = bfImage.getRGB(w, h) & 0xFFFFFF;
            }
        }
        return result;
    }

    /**
     * 查找图片
     */
    public void findImage() {
//        System.out.println(keyImageRGBData[0][0]+" "+keyImageRGBData[0][1]+" "+keyImageRGBData[0][2]);
        findImgData = new int[keyImgHeight][keyImgWidth][2];
        //遍历屏幕截图像素点数据
//        System.out.println(keyImageRGBData[5][5]);
//        System.out.println(screenShotImageRGBData[5][5]);
        for (int y = 0; y < scrShotImgHeight - keyImgHeight; y++) {
            for (int x = 0; x < scrShotImgWidth - keyImgWidth; x++) {
//                if(y%100==0&&x%100==0)
//                    System.out.println(x+","+y);
                //根据目标图的尺寸，得到目标图四个角映射到屏幕截图上的四个点，
                //判断截图上对应的四个点与图B的四个角像素点的值是否相同，
                //如果相同就将屏幕截图上映射范围内的所有的点与目标图的所有的点进行比较。
                if ((keyImageRGBData[0][0] ^ screenShotImageRGBData[y][x]) <=1
                        && (keyImageRGBData[0][keyImgWidth - 1] ^ screenShotImageRGBData[y][x + keyImgWidth - 1]) <=1
                        && (keyImageRGBData[keyImgHeight - 1][keyImgWidth - 1] ^ screenShotImageRGBData[y + keyImgHeight - 1][x + keyImgWidth - 1]) <=1
                        && (keyImageRGBData[keyImgHeight - 1][0] ^ screenShotImageRGBData[y + keyImgHeight - 1][x]) <=1) {
//                    if(debug)
                        System.out.println("Yes");
                    boolean isFinded = isMatchAll(y, x);
//                    boolean isFinded = true;
                    //如果比较结果完全相同，则说明图片找到，填充查找到的位置坐标数据到查找结果数组。
                    if (isFinded) {

                        for (int h = 0; h < keyImgHeight; h++) {
                            for (int w = 0; w < keyImgWidth; w++) {
                                findImgData[h][w][0] = y + h;
                                findImgData[h][w][1] = x + w;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /**
     * 判断屏幕截图上目标图映射范围内的全部点是否全部和小图的点一一对应。
     *
     * @param y - 与目标图左上角像素点想匹配的屏幕截图y坐标
     * @param x - 与目标图左上角像素点想匹配的屏幕截图x坐标
     * @return
     */
    public boolean isMatchAll(int y, int x) {
        int biggerY = 0;
        int biggerX = 0;
        int xor = 0;
        for (int smallerY = 0; smallerY < keyImgHeight; smallerY++) {
            biggerY = y + smallerY;
            for (int smallerX = 0; smallerX < keyImgWidth; smallerX++) {
                biggerX = x + smallerX;
                if (biggerY >= scrShotImgHeight || biggerX >= scrShotImgWidth) {
                    return false;
                }
                xor = keyImageRGBData[smallerY][smallerX] ^ screenShotImageRGBData[biggerY][biggerX];
                if (xor != 0) {
                    return false;
                }
            }
            biggerX = x;
        }
        return true;
    }

    /**
     * 输出查找到的坐标数据
     */
    private void printFindData() {
        System.out.println(this.findImgData[0][0][1] + "," + this.findImgData[0][0][0]);
//        for (int y = 0; y < keyImgHeight; y++) {
//            for (int x = 0; x < keyImgWidth; x++) {
//                System.out.print("(" + this.findImgData[y][x][0] + ", " + this.findImgData[y][x][1] + ")");
//            }
//            System.out.println();
//        }
    }
    
    public void debugOn(){
        debug=true;
    }
    
    public void debugOff(){
        debug=false;
    }
    
    public int getPosX(){
        return this.findImgData[0][0][1];
    }
    
    public int getPosY(){
        return this.findImgData[0][0][0];
    }

//    public static void main(String[] args) {
//        String keyImagePath = "C:/key.png";
//        ImageFindDemo demo = new ImageFindDemo(keyImagePath);
//        int x = demo.findImgData[0][0][1];
//        int y = demo.findImgData[0][0][0];
//        System.out.println(x + "," + y);
//        Moveto(x,y);
//    }

}
