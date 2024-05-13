package com.heima.wemedia.test;


import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.heima.model.wemedia.pojos.WmMaterial;
import com.heima.wemedia.WemediaApplication;
import com.heima.wemedia.mapper.WmMaterialMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@SpringBootTest(classes = WemediaApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class WeMediaTest {

    @Autowired
    WmMaterialMapper wmMaterialMapper;

    @Test
    public void createDTOSelectTest() {
        //获取数据库数据
        WmMaterial wmMaterial = wmMaterialMapper.selectOne(Wrappers.<WmMaterial>lambdaQuery()
                .eq(WmMaterial::getId, "87"));

        //打印
        if(wmMaterial != null){
            String url = wmMaterial.getUrl();
            log.info("url:{}", url);
            log.info("data:{}", wmMaterial);
        }
    }
}
