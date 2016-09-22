package ro.szzsa.livescore.api.admin.client;

/**
 * Factory methods for {@link AdministrationApiClient} instances.
 */
public final class AdministrationApiClients {

  private AdministrationApiClients() {
    throw new UnsupportedOperationException();
  }

  public static AdministrationApiClient createDefaultHttpClient(String serverUrl, String username, String password) {
    return new AdministrationApiHttpClient(serverUrl, username, password);
  }

  public static AdministrationApiHttpClientBuilder createCustomHttpClient(String serverUrl, String username, String password) {
    return new AdministrationApiHttpClientBuilder(serverUrl, username, password);
  }
}
