package ro.szzsa.livescore.api.admin.client;

import ro.szzsa.utils.connector.Connector;
import ro.szzsa.utils.connector.Connectors;
import ro.szzsa.utils.converter.Converter;
import ro.szzsa.utils.converter.Converters;

public class AdministrationApiHttpClient implements AdministrationApiClient {

  private final String serverUrl;

  private final Connector connector;

  private final Converter converter;

  public AdministrationApiHttpClient(String serverUrl, String username, String password) {
    this.serverUrl = serverUrl;
    connector = Connectors.customHttpConnector().setUsername(username).setPassword(password).build();
    converter = Converters.createJsonConverter();
  }
}
