package ro.szzsa.livescore.api.admin.client;

/**
 * Factory methods for {@link AdministrationApiClient} instances.
 */
public final class AdministrationApiClients {

  private AdministrationApiClients() {
    throw new UnsupportedOperationException();
  }

  public static AdministrationApiClient createHttpClient() {
    return new AdministrationApiHttpClient();
  }
}
