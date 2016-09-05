package ro.szzsa.livescore.api.admin.client;

import ro.szzsa.livescore.api.admin.client.converter.Converter;
import ro.szzsa.livescore.api.admin.client.converter.Converters;
import ro.szzsa.utils.connector.Connector;
import ro.szzsa.utils.connector.Connectors;

public class AdministrationApiHttpClient implements AdministrationApiClient {

  private final String serverUrl;

  private Connector connector = Connectors.createHttpConnector();

  private Converter converter = Converters.createJsonConverter();

  public AdministrationApiHttpClient(String serverUrl) {
    this.serverUrl = serverUrl;
  }
}
