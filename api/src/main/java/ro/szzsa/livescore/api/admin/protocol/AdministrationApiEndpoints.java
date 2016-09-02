package ro.szzsa.livescore.api.admin.protocol;

/**
 * Administration REST API endpoints exposed by the server and used by admin apps.
 */
public final class AdministrationApiEndpoints {

  public static final String ADMINISTRATION_API_ROOT_PATH = "/api/admin";

  public static final String ADMINISTRATION_API_V1_ROOT_PATH = ADMINISTRATION_API_ROOT_PATH + "/v1";

  private AdministrationApiEndpoints() {
    throw new UnsupportedOperationException();
  }
}
