package ro.szzsa.livescore.api.admin.client;

import java.util.List;

import ro.szzsa.livescore.api.admin.client.exception.AdministrationApiException;
import ro.szzsa.livescore.model.IceRink;
import ro.szzsa.livescore.model.Team;

/**
 * Client of admin API.
 */
public interface AdministrationApiClient {

  List<Team> getTeams() throws AdministrationApiException;

  void updateTeam(Team team) throws AdministrationApiException;

  void deleteTeam(Team team) throws AdministrationApiException;

  List<IceRink> getIceRinks() throws AdministrationApiException;

  void updateIceRink(IceRink team) throws AdministrationApiException;

  void deleteIceRink(IceRink team) throws AdministrationApiException;
}
