package com.mlab.patterns;


/**
 * Reune el patrón Observer y el patrón Composite
 * Las clases {@link CompositeObserver} se pueden registrar como observadores de las 
 * clases {@link Observable}. Disponen de un método
 * <em>update()</em> que podrá ser llamado por el {@link Observable}
 * para avisar de modificaciones.<br/>
 *  
 * @author shiguera
 *
 */
public interface CompositeObserver extends Composite, Observer{
	
	
}
