package org.adorsys.smart.smartboot.provider;

/**
 * Listen to provider events.
 * 
 * @author fpo
 *
 */
public interface ProviderEventListener {
    void onEvent(ProviderEvent event);
}
