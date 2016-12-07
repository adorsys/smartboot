package org.adorsys.smart.smartboot.provider;

import java.util.Map;

/**
 * Marker interface for {@link ProviderFactory} that can show operational info
 * to servers.
 * 
 * @author fpo
 */
public interface ServerInfoAwareProviderFactory {

	/**
	 * Return actual info about the provider. This info contains informations
	 * about providers configuration and operational conditions (eg. errors in
	 * connection to remote systems etc) which is shown on "Server Info" page
	 * then.
	 * 
	 * @return Map with keys describing value and relevant values itself
	 */
	public Map<String, String> getOperationalInfo();

}
