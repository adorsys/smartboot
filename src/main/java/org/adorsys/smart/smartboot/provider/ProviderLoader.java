package org.adorsys.smart.smartboot.provider;

import java.util.List;

/**
 * Host server specific way of loading providers. The loading of providers might be tightly
 * coupled to the way the host application loads modules.
 * 
 * @author fpo
 *
 */
public interface ProviderLoader {

    public List<ProviderFactory> load(Spi spi);

}
