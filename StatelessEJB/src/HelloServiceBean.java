import javax.ejb.Stateless;

/**
 * @author Andrey Belkin
 */
@Stateless
public class HelloServiceBean implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
