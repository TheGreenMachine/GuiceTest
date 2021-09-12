import com.google.inject.Provider;

public class DriveProvider implements Provider<Drive> {

  // demonstrates using a provider could be more advanced logic like yaml
  // in this case use boolean to create 2 different types
  private static boolean created;

  @Override
  public Drive get() {
    if(created) return new SwerveDrive();
    created = true;
    return  new TankDrive();
  }
}
