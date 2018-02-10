package xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liux on 17-3-5.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("helloMessage.xml");

        try {
            Person person = (Person) ctx.getBean("person");
            String s = person.personSayHello();
            System.out.println("s: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
              ((ClassPathXmlApplicationContext)ctx).close();
        }
    }
}