import com.google.inject.Guice;
import com.google.inject.Module;

public class Main {

  private static IHelloWorldService service;

  public static void main(String[] args) {

    Main main = new Main();

    // Setup injector
    Module module = new HelloWorldModule();
    Guice.createInjector(module);

    // Normally you would inject this but create class normally to demonstrate
    // different ways to get injection functional in instated class
    service = new HelloWorldServiceImpl();
    main.testGuice();
  }

  public void testGuice()
  {
    service.sayHello(); //call the service
  }
}