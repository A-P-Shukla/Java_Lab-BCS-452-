import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Component; 
import org.springframework.context.ApplicationContext; 
import org.springframework.context.annotation.AnnotationConfigApplicationContext; 
@Component 
class Service { 
void serve() { 
System.out.println("Message from injected service!"); 
} 
} 
@Component 
class Client { 
@Autowired 
Service service; 
void doSomething() { 
service.serve(); 
} 
} 
public class SpringMain { 
public static void main(String[] args) { 
ApplicationContext context = new AnnotationConfigApplicationContext("your.package"); 
Client client = context.getBean(Client.class); 
client.doSomething(); 
} 
}
