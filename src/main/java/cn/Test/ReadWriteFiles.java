package cn.Test;

import java.io.*;

/**
 * @author 10237
 * @date 2021-03-01 15:33
 */
public class ReadWriteFiles {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileReader = new FileReader("D:\\临时文件夹\\蓝桥视频及Markdown笔记\\视频\\2021-02-24（视频）\\尝试.txt");

            fileWriter = new FileWriter("D:\\临时文件夹\\蓝桥视频及Markdown笔记\\视频\\2021-02-24（视频）\\复制t文件.txt");

            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            /*int read = fileReader.read();
            while (read!=-1){
                System.out.print((char)read);
                read = fileReader.read();
            }*/

            /*String readline = null;    //等价于上面的代码
            while ((readline = bufferedReader.readLine()) != null) {
                System.out.println(readline);
                readline = bufferedReader.readLine();
            }*/

            String readline = null;
            while ((readline = bufferedReader.readLine()) != null) {
                bufferedWriter.write(readline);
                readline = bufferedReader.readLine();
                bufferedWriter.newLine();

            }
           // bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
