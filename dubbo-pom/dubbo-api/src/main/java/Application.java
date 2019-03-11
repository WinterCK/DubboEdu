import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.dubbo.api.service.HelloService;

public class Application {
	public static void main(String[] args) throws Exception {
		 System.setProperty("java.net.preferIPv4Stack", "true");
	     ServiceConfig<HelloService> service = new ServiceConfig<>();
	     service.setApplication(new ApplicationConfig("first-dubbo-provider"));
//	     service.setRegistry(new RegistryConfig("multicast://224.5.6.7:1234"));
//	     service.setRegistry(new RegistryConfig("zookeeper://127.0.0.1:2181"));
	     service.setInterface(HelloService.class);
//	     service.setRef(new GreetingsServiceImpl());
	     service.export();
	     System.out.println("first-dubbo-provider is running.");
	     System.in.read();
	}

}
