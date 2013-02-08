package org.as.jtrello;


public class Config {

	private String authKey = null;
	private String secretKey = null;
	private String authToken = null;
	private String apiBaseUrl = null;
	
	private static Config instance = null;
	
	public static Config getInstance() {
		if (Config.instance == null) {
			Config.instance = new Config(null, null, null);
		}
		return Config.instance;
	}
	
	/**
	 * @param authKey
	 * @param secretKey
	 * @param authToken
	 * @return Returns an updatable instance of the 'config' object.
	 */
	public static Config getInstance(String authKey, String secretKey, String authToken) {
		if (Config.instance == null) {
			Config.instance = new Config(authKey, secretKey, authToken);
		} else {
			Config.instance.setAuthKey(authKey);
			Config.instance.setAuthToken(authToken);
			Config.instance.setSecretKey(secretKey);
		}
		return Config.instance;
	}
	
	/**
	 * @param authKey
	 * @param secretKey
	 * @param authToken
	 */
	private Config(String authKey, String secretKey, String authToken){
		this.authKey = authKey;
		this.secretKey = secretKey;
		this.authToken = authToken;
		this.apiBaseUrl = "https://api.trello.com/1";
	}

	public String getAuthKey() {
		return authKey;
	}

	private void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	
	public String getSecretKey() {
		return secretKey;
	}

	private void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getApiBaseUrl() {
		return apiBaseUrl;
	}
	
}
