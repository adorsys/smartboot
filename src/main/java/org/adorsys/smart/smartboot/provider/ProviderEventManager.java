package org.adorsys.smart.smartboot.provider;

/**
 * Manages provider event listeners.
 * 
 * @author fpo
 *
 */
public interface ProviderEventManager {
	public void register(ProviderEventListener listener);

	public void unregister(ProviderEventListener listener);

	public void publish(ProviderEvent event);
}
