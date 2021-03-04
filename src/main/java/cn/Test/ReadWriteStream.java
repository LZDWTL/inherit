package cn.Test;

import java.io.*;

/**
 * @author 10237
 * @date 2021-03-01 15:33
 */
public class ReadWriteStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileInputStream = new FileInputStream("D:\\临时文件夹\\蓝桥视频及Markdown笔记\\视频\\2021-02-24（视频）\\01、编程题讲解（Map的应用）.wmv");

            fileOutputStream = new FileOutputStream("D:\\临时文件夹\\蓝桥视频及Markdown笔记\\视频\\2021-02-24（视频）\\复制视频.wmv");

            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            byte[] bys = new byte[1024];
            int len;
            String readline = null;
            while ((len = bufferedInputStream.read(bys)) != -1) {
                bufferedOutputStream.write(bys, 0, len);

            }
           // bufferedOutputStream.flush();   此处复制视频无论有没有这行代码都不影响，为啥？
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedOutputStream.close();
                bufferedInputStream.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
