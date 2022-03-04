package cn.com.cyg.nsrs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class NsrsApplicationTests {

    @Test
    void contextLoads() {
//        BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
//        //使用CryptPasswordEncoder编码器对密码“123456”加密
//        String encode = bCryptPasswordEncoder.encode("123456");
//        System.out.println(encode);

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println("encoder:"+encoder);
    }
}
