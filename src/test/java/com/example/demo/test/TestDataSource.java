package com.example.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDataSource {

    @Resource
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        // 查看配置数据源信息
        System.out.println("数据源" + dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println("数据连接" + connection);
        System.out.println("数据连接地址" + connection.getMetaData().getURL());

    }
}
