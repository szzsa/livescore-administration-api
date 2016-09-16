package ro.szzsa.livescore.api.admin.protocol;

import ro.szzsa.livescore.api.admin.protocol.request.IceRinkUpdateRequest;
import ro.szzsa.livescore.api.admin.protocol.request.TeamUpdateRequest;
import ro.szzsa.livescore.api.admin.protocol.response.GetIceRinksResponse;
import ro.szzsa.livescore.api.admin.protocol.response.GetTeamsResponse;

/**
 * Administration REST API endpoints exposed by the server and used by admin apps.
 */
public final class AdministrationApiEndpoints {

  public static final String ADMINISTRATION_API_ROOT_PATH = "/api/admin";

  public static final String ADMINISTRATION_API_V1_ROOT_PATH = ADMINISTRATION_API_ROOT_PATH + "/v1";

  public static final String GET_TEAMS_PATH = "/teams/get";

  public static final String UPDATE_TEAM_PATH = "/team/update";

  public static final String DELETE_TEAM_PATH = "/team/delete";

  public static final String GET_ICE_RINKS_PATH = "/icerinks/get";

  public static final String UPDATE_ICE_RINK_PATH = "/icerink/update";

  public static final String DELETE_ICE_RINK_PATH = "/icerink/delete";

  /**
   * Endpoint for teams retrieval.
   *
   * @see GetTeamsResponse
   */
  public static final String GET_TEAMS_URL = ADMINISTRATION_API_V1_ROOT_PATH + GET_TEAMS_PATH;

  /**
   * Endpoint for team update.
   *
   * @see TeamUpdateRequest
   */
  public static final String UPDATE_TEAM_URL = ADMINISTRATION_API_V1_ROOT_PATH + UPDATE_TEAM_PATH;

  /**
   * Endpoint for team removal.
   *
   * @see TeamUpdateRequest
   */
  public static final String DELETE_TEAM_URL = ADMINISTRATION_API_V1_ROOT_PATH + DELETE_TEAM_PATH;

  /**
   * Endpoint for ice rink retrieval.
   *
   * @see GetIceRinksResponse
   */
  public static final String GET_ICE_RINKS_URL = ADMINISTRATION_API_V1_ROOT_PATH + GET_ICE_RINKS_PATH;

  /**
   * Endpoint for ice rink update.
   *
   * @see IceRinkUpdateRequest
   */
  public static final String UPDATE_ICE_RINK_URL = ADMINISTRATION_API_V1_ROOT_PATH + UPDATE_ICE_RINK_PATH;

  /**
   * Endpoint for ice rink removal.
   *
   * @see IceRinkUpdateRequest
   */
  public static final String DELETE_ICE_RINK_URL = ADMINISTRATION_API_V1_ROOT_PATH + DELETE_ICE_RINK_PATH;

  private AdministrationApiEndpoints() {
    throw new UnsupportedOperationException();
  }
}
