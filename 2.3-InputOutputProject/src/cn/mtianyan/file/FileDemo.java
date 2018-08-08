package cn.mtianyan.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File directory = new File("");
        String pathBase = directory.getAbsolutePath();
        // 创建File对象
//        File file1 = new File(pathBase+"/src/cn/mtianyan/file/hi.txt");
        File file = new File(pathBase);
        File file1 = new File(file,"/src/cn/mtianyan/file/hi.txt");
        System.out.println("是否是目录:"+file1.isDirectory());
        System.out.println("是否是文件:"+file1.isFile());


        // 创建单级目录
        File file2 = new File(pathBase,"Mtianyan");
        if (!file2.exists()){
            file2.mkdir();
        }

        // 创建多级目录
        File file3 = new File(pathBase,"Mtianyan2/mtianyan");
        if (!file3.exists()){
            file3.mkdirs();
        }

        File file4 = new File(file,"/src/cn/mtianyan/file/error.txt");
        if (!file4.exists()){
            file4.createNewFile();
        }
    }
}
