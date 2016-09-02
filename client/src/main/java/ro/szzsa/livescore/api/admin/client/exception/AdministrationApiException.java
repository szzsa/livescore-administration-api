package ro.szzsa.livescore.api.admin.client.exception;

/**
 *
 */
public class AdministrationApiException extends Exception {

  public AdministrationApiException() {
  }

  public AdministrationApiException(String detailMessage) {
    super(detailMessage);
  }

  public AdministrationApiException(String detailMessage, Throwable throwable) {
    super(detailMessage, throwable);
  }

  public AdministrationApiException(Throwable throwable) {
    super(throwable);
  }
}
