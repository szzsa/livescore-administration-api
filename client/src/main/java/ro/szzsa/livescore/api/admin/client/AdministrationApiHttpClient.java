package ro.szzsa.livescore.api.admin.client;

import java.util.List;

import ro.szzsa.livescore.api.admin.client.exception.AdministrationApiException;
import ro.szzsa.livescore.api.admin.protocol.AdministrationApiEndpoints;
import ro.szzsa.livescore.api.admin.protocol.request.IceRinkUpdateRequest;
import ro.szzsa.livescore.api.admin.protocol.request.TeamUpdateRequest;
import ro.szzsa.livescore.api.admin.protocol.response.GetIceRinksResponse;
import ro.szzsa.livescore.api.admin.protocol.response.GetTeamsResponse;
import ro.szzsa.livescore.model.IceRink;
import ro.szzsa.livescore.model.Team;
import ro.szzsa.utils.connector.Connector;
import ro.szzsa.utils.connector.Connectors;
import ro.szzsa.utils.connector.Request;
import ro.szzsa.utils.converter.Converter;
import ro.szzsa.utils.converter.Converters;

public class AdministrationApiHttpClient implements AdministrationApiClient {

  private final String serverUrl;

  private final Connector connector;

  private final Converter converter;

  public AdministrationApiHttpClient(String serverUrl, String username, String password) {
    this.serverUrl = serverUrl;
    connector = Connectors.withCredentials(username, password).build();
    converter = Converters.createJsonConverter();
  }

  public AdministrationApiHttpClient(String serverUrl, Connector connector) {
    this.serverUrl = serverUrl;
    this.connector = connector;
    converter = Converters.createJsonConverter();
  }

  @Override
  public List<Team> getTeams() throws AdministrationApiException {
    try {
      Request request = new Request(serverUrl + AdministrationApiEndpoints.GET_TEAMS_URL);

      String response = connector.sendRequest(request);
      GetTeamsResponse responsePayload = converter.fromString(response, GetTeamsResponse.class);

      return responsePayload.getTeams();
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }

  @Override
  public void updateTeam(Team team) throws AdministrationApiException {
    try {
      TeamUpdateRequest requestPayload = new TeamUpdateRequest();
      requestPayload.setTeam(team);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + AdministrationApiEndpoints.UPDATE_TEAM_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }

  @Override
  public void deleteTeam(Team team) throws AdministrationApiException {
    try {
      TeamUpdateRequest requestPayload = new TeamUpdateRequest();
      requestPayload.setTeam(team);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + AdministrationApiEndpoints.DELETE_TEAM_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }

  @Override
  public List<IceRink> getIceRinks() throws AdministrationApiException {
    try {
      Request request = new Request(serverUrl + AdministrationApiEndpoints.GET_ICE_RINKS_URL);

      String response = connector.sendRequest(request);

      GetIceRinksResponse responsePayload = converter.fromString(response, GetIceRinksResponse.class);

      return responsePayload.getIceRinks();
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }

  @Override
  public void updateIceRink(IceRink iceRink) throws AdministrationApiException {
    try {
      IceRinkUpdateRequest requestPayload = new IceRinkUpdateRequest();
      requestPayload.setIceRink(iceRink);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + AdministrationApiEndpoints.UPDATE_ICE_RINK_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }

  @Override
  public void deleteIceRink(IceRink iceRink) throws AdministrationApiException {
    try {
      IceRinkUpdateRequest requestPayload = new IceRinkUpdateRequest();
      requestPayload.setIceRink(iceRink);
      String message = converter.toString(requestPayload);
      Request request = new Request(serverUrl + AdministrationApiEndpoints.DELETE_ICE_RINK_URL, message);

      connector.sendRequest(request);
    } catch (Exception e) {
      throw new AdministrationApiException(e);
    }
  }
}
