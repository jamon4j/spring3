package junit.test;

import static org.junit.Assert.*;

import java.security.Permissions;

import org.junit.Test;

import com.zjj.aop.CglibProxyFactory;
import com.zjj.aop.JDKProxyFactory;
import com.zjj.service.IPersonService;
import com.zjj.service.impl.PersonService;

public class AopTest {

	@Test
	public void test() {
		JDKProxyFactory factory = new JDKProxyFactory();
		IPersonService service = (IPersonService) factory.createProxyInstance(new PersonService("zjj"));
		service.add();
	}

}
