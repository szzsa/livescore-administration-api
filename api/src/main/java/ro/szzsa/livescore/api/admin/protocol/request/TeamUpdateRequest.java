package ro.szzsa.livescore.api.admin.protocol.request;

import ro.szzsa.livescore.model.Team;

/**
 *
 */
public class TeamUpdateRequest {
  private Team team;

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
