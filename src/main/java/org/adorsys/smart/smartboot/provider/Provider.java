package org.adorsys.smart.smartboot.provider;

/**
 * Marker Interface for smart boot providers.
 * 
 * @see java.util.ServiceLoader
 * 
 * @author fpo
 *
 */
public interface Provider {
    public void close();
}
