import com.google.inject.Inject;

public class HelloWorldServiceImpl implements IHelloWorldService {

  // These classes are instantiated by using the @Inject attribute

  @Inject
  private static StaticInject mStaticInject;

  @Inject
  private static Drive mDrive1;

  @Inject
  private static Drive mDrive2;

  @Override
  public void sayHello() {
    System.out.println("Hello, " + mStaticInject + " " + mDrive1 + " " + mDrive2 + " world!");
  }
}