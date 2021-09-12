import com.google.inject.AbstractModule;

public class HelloWorldModule extends AbstractModule {
  protected void configure() {

    // You do not need to bind classes that are standalone i.e. the ConstructorInject class

    // since HelloWorldServiceImpl is not injected you need to tell the injector to do
    // static injection.  All other class injected from HelloWorldServiceImpl will be
    // injected automatically.
    requestStaticInjection(HelloWorldServiceImpl.class);

    // this will bind a class to a provider
    bind(Drive.class).toProvider(DriveProvider.class);
  }
}