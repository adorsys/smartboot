package org.adorsys.smart.smartboot.provider;

/**
 * The SPI marker interface. Each scheme implemented by the product will have to present
 * a service provider interface.
 * 
 * @author fpo
 *
 */
public interface Spi {

	/**
	 * True if this service is internal. Will be used to send out warning when
	 * user of the hosting product provide their own SPI.
	 * 
	 * Generally internal SPI are more open for changes, than external SPI.
	 * 
	 * @return
	 */
    public boolean isInternal();
    
    /**
     * The name of this service. This is unique in the extends of services used by this server.
     * 
     * This is not the name of a concrete service implementation but the name of the service itself. The name
     * of the concrete service provider is defined by the {@link ProviderFactory}#getId() method.
     * 
     * @return
     */
    public String getName();
    
    /**
     * The provide class.
     * 
     * @return
     */
    public Class<? extends Provider> getProviderClass();
    
    /**
     * The class use to load the service provider.
     * 
     * The provider factory must have a no argument constructor for the instantiation.
     *  
     * @return
     */
    public Class<? extends ProviderFactory> getProviderFactoryClass();
}
