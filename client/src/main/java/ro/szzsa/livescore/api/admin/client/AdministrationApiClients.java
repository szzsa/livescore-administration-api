package ro.szzsa.livescore.api.admin.client;

/**
 * Factory methods for {@link AdministrationApiClient} instances.
 */
public final class AdministrationApiClients {

  private AdministrationApiClients() {
    throw new UnsupportedOperationException();
  }

  public static AdministrationApiClient createHttpClient(String serverUrl, String username, String password) {
    return new AdministrationApiHttpClient(serverUrl, username, password);
  }
}
