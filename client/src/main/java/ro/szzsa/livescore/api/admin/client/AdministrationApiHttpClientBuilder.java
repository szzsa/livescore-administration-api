package ro.szzsa.livescore.api.admin.client;

import ro.szzsa.utils.connector.HttpConnectorBuilder;
import ro.szzsa.utils.connector.log.Logger;

/**
 *
 */
public final class AdministrationApiHttpClientBuilder {

  private final String serverUrl;

  private HttpConnectorBuilder connectorBuilder;

  public AdministrationApiHttpClientBuilder(String serverUrl, String username, String password) {
    this.serverUrl = serverUrl;
    connectorBuilder = new HttpConnectorBuilder(username, password);
  }

  public AdministrationApiHttpClientBuilder setSocketTimeout(int socketTimeout) {
    connectorBuilder.setSocketTimeout(socketTimeout);
    return this;
  }

  public AdministrationApiHttpClientBuilder setConnectionTimeout(int connectionTimeout) {
    connectorBuilder.setConnectionTimeout(connectionTimeout);
    return this;
  }

  public AdministrationApiHttpClientBuilder setNumberOfRetries(int numberOfRetries) {
    connectorBuilder.setNumberOfRetries(numberOfRetries);
    return this;
  }

  public AdministrationApiHttpClientBuilder setLogger(Logger logger) {
    connectorBuilder.setLogger(logger);
    return this;
  }

  public AdministrationApiHttpClient build() {
    return new AdministrationApiHttpClient(serverUrl, connectorBuilder.build());
  }
}
