package org.adorsys.smart.smartboot.provider;

import org.adorsys.smart.smartboot.config.SmartConfig;
import org.adorsys.smart.smartboot.session.SmartSession;
import org.adorsys.smart.smartboot.session.SmartSessionFactory;

/**
 * The bootstrapping host component will discover all factories. 
 * 
 * a) For each of them, the init() method will be called.
 * b) After all provider factories are initialized, the postInit() will be called on each 
 * of them again. Given application the opportunity to execute operation similar to post construct in CDI.
 * c) During application shutdown, the close() method will be called.
 *
 * Only one instance of a factory must exists per server.
 * 
 * @inspiredFrom: Keycloak
 * 
 * @see java.util.ServiceLoader
 * 
 * @author fpo
 *
 * @param <T> : The provider class.
 */
public interface ProviderFactory<T extends Provider> {

	/**
	 * Create an instance of the service provider.
	 * 
	 * @param session
	 * @return
	 */
    public T create(SmartSession session);

    /**
     * Called once when the factory is created. 
     * 
     * @param config : Wrapper around the provider configuration. We assume each server will have 
     * a common configuration scheme for all providers.
     */
    public void init(SmartConfig config);

    /**
     * Called after all provider factories have been initialized
     */
    public void postInit(SmartSessionFactory factory);

    /**
     * Called when the server shuts down.
     *
     */
    public void close();

    /**
     * Returns the identifier of this provider factory.
     * 
     * @return
     */
    public String getId();

}
