package ro.szzsa.livescore.api.admin.protocol.response;

import java.util.List;

import ro.szzsa.livescore.model.Team;

/**
 *
 */
public class GetTeamsResponse {
  private List<Team> teams;

  public List<Team> getTeams() {
    return teams;
  }

  public void setTeams(List<Team> teams) {
    this.teams = teams;
  }
}
