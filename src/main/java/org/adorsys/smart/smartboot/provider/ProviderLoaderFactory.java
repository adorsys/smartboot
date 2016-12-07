package org.adorsys.smart.smartboot.provider;

/**
 * 
 * @author fpo
 *
 */
public interface ProviderLoaderFactory {

	public boolean supports(String type);

	public ProviderLoader create(ClassLoader baseClassLoader, String resource);

}
