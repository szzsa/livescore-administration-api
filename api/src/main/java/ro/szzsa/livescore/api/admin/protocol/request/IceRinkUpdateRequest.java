package ro.szzsa.livescore.api.admin.protocol.request;

import ro.szzsa.livescore.model.IceRink;

/**
 *
 */
public class IceRinkUpdateRequest {

  private IceRink iceRink;

  public IceRink getIceRink() {
    return iceRink;
  }

  public void setIceRink(IceRink iceRink) {
    this.iceRink = iceRink;
  }
}
