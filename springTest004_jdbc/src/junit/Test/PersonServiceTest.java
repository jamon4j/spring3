package junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjj.pojo.PersonPo;
import com.zjj.service.IPersonService;

public class PersonServiceTest {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IPersonService service = (IPersonService) ac.getBean("personService");
		try{
			service.delete(5);
		}catch(Exception e){
			e.printStackTrace();
		}
		/*for(int i=0;i<5;i++)
		{
			PersonPo person = new PersonPo("zjj"+i);
			service.save(person);
		}
		PersonPo person1 = service.getPerson(3);
		System.out.println(person1.toString());
		
		List<PersonPo> persons = service.getAllPerson();
		for(PersonPo person:persons){
			System.out.println(person.toString());
		}
		
		PersonPo person = new PersonPo("lj",2);
		service.update(person);
		service.delete(4);
		
		persons = service.getAllPerson();
		for(PersonPo person:persons){
			System.out.println(person.toString());
		}*/
	}
}
