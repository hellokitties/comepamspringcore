import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    static Client client;
    static ConsoleEventLog eventLogger;


    App(Client client, ConsoleEventLog eventLogger){
      this.client = client;
      this.eventLogger=eventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App)ctx.getBean("app");

        app.logEvent("Some event for user 1");
        app.logEvent("Some event for user 2");

    }

    public void logEvent(String msg) {

        String message = msg.replaceAll(client.getId(), client.getFullName());

    }
}
