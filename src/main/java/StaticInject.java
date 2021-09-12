import com.google.inject.Inject;

public class StaticInject {

  private final ConstructorInject mConstructorInject;

  // Annotating a constructor with @Inject will
  // instances of class

  @Inject
  public StaticInject(ConstructorInject constructorInject){
    mConstructorInject = constructorInject;
  }

  @Override
  public String toString() {
    return "static " + mConstructorInject;
  }
}
