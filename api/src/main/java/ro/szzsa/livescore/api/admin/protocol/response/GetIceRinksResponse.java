package ro.szzsa.livescore.api.admin.protocol.response;

import java.util.List;

import ro.szzsa.livescore.model.IceRink;

/**
 *
 */
public class GetIceRinksResponse {
  private List<IceRink> iceRinks;

  public List<IceRink> getIceRinks() {
    return iceRinks;
  }

  public void setIceRinks(List<IceRink> iceRinks) {
    this.iceRinks = iceRinks;
  }
}
