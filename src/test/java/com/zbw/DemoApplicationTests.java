package com.zbw;

import com.zbw.domain.User;
import com.zbw.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    public void contextLoads() {

        User user=userMapper.selectByPrimaryKey(1);
        if(null!=user){
            System.out.println(user.getUserName());
        }else{
            System.out.println("null");
        }
    }

}
