import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import bean.Animal;
import bean.Bird;
import bean.Chicken;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { Animal.class })
public class LibraryTest {
	@Autowired
	private Animal a;

	@Autowired
	private Bird b;

	@Autowired
	private Chicken c;

	@Test
	public void testSpringWebMVC() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a.getB());
	}
}
