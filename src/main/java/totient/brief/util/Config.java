package totient.brief.util;

import java.util.ResourceBundle;

public enum Config {
  CONF;
  
  private final ResourceBundle props = ResourceBundle.getBundle("config");
  private final String REDIS_URI = "redis.uri";
  private final String REDIS_SERVER = "redis.server";
  private final String REDIS_PORT = "redis.port";
  private final String REDIS_DB = "redis.db";
  private final String REDIS_PWD = "redis.pwd";
  private final String HTTPS_ADDR = "https.addr";
  
  public String getRedisServer() {
    return props.getString(REDIS_SERVER);
  }

  public int getRedisPort() {
    return Integer.parseInt(props.getString(REDIS_PORT));
  }

  public String getRedisPassword() {
    return props.getString(REDIS_PWD);
  }

  public int getRedisDB() {
    return Integer.parseInt(props.getString(REDIS_DB));
  }

  public String getRedisUri() {
    return props.getString(REDIS_URI);
  }

  public String getHttpAddr() {
    return props.getString(HTTPS_ADDR);
  }

}
