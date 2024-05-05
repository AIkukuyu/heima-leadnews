package com.heima.minio.test;


import com.heima.file.service.FileStorageService;
import com.heima.minio.MinIOApplication;
import io.minio.BucketExistsArgs;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest(classes = MinIOApplication.class)
@RunWith(SpringRunner.class)
public class MinioTest {
    @Autowired
    private FileStorageService fileStorageService;

    //把
    @Test
    public void test() throws FileNotFoundException {
//        FileInputStream fileInputStream = new FileInputStream("E:BUPT\\java\\project\\heima-leadnews\\plugins\\css\\index.css");
//        String path = fileStorageService.uploadHtmlFile("", ".html", fileInputStream);
//        System.out.println(path);
    }

    public static void main(String[] args)  {
        try {

            FileInputStream fileInputStream = new FileInputStream
                    ("e:\\BUPT\\java\\project\\heima-leadnews\\plugins\\js\\index.js");

            //1.获取minio的链接信息，创建一个minio的客户端
            MinioClient minioClient = MinioClient.builder()
                    .endpoint("http://81.70.34.138:9000")
                    .credentials("minio", "minio123")
                    .build();

            //上传
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("plugins/js/index.js")    //文件名称
                    .contentType("text/js")                 //文件类型
                    .bucket("leadnews")                //桶名称 与minio管理界面创建的桶一致即可
                    .stream(fileInputStream, fileInputStream.available(), -1)
                    .build();

            minioClient.putObject(putObjectArgs);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
