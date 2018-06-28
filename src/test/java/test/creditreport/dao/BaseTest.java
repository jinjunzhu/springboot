package test.boot.dao;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import test.support.SpringTxTestCase;
/**
 * @Author:jinjunzhu
 * @Date:2018年4月11日
 */
public class BaseTest extends SpringTxTestCase{
	
	@Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
      logger.info("test server port:8080 ");
      assertTrue(this.restTemplate.getForObject("http://localhost:8080/test",String.class).contains("greeting"));
      logger.info("test server port: " + 8080);
    }

    @Test
    public void testPass(){
        String pass = "123456";
        BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
        String hashPass = encode.encode(pass);
        logger.info("加密后密码:"+hashPass);

    }

}
