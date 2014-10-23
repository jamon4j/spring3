import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjj.hello.HelloApi;


public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		HelloApi ha = (HelloApi) context.getBean("helloBean");
		String result = ha.helloSpring(5);
		System.out.println("result:"+result);
	}
}
