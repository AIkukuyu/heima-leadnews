package com.heima.wemedia.test;

import com.heima.common.aliyun.GreenImageScan;
import com.heima.common.aliyun.GreenTextScan;
import com.heima.file.service.FileStorageService;
import com.heima.wemedia.WemediaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = WemediaApplication.class)
@RunWith(SpringRunner.class)
public class AliyunTest {

    @Autowired
    private GreenTextScan greenTextScan;

    @Autowired
    private GreenImageScan greenImageScan;

    @Autowired
    private FileStorageService fileStorageService;

    /**
     * 测试文本
     * @throws Exception
     */
    @Test
    public void testScanText() throws Exception {
        Map map = greenTextScan.greeTextScan("我是一个好人，冰毒");
        System.out.println(map);
    }

    /**
     * 测试图片
     * @throws Exception
     */
    @Test
    public void testScanImage() throws Exception {
        byte[] bytes = fileStorageService
                .downLoadFile("http://81.70.34.138:9000/leadnews/2024/05/07/a1dcaa5b789d47f087ad80351c364370.jpg");
        List<String > list = new ArrayList<>();
        list.add("http://81.70.34.138:9000/leadnews/2024/05/07/a1dcaa5b789d47f087ad80351c364370.jpg");
        Map map = greenImageScan.imageScan("");
        System.out.println(map);
    }
}