package ro.szzsa.livescore.api.admin.client.converter;

/**
 * Converts objects to/from {@link String} representation.
 */
public interface Converter {

  String toString(Object object);

  <T> T fromString(String string, Class<T> type);
}