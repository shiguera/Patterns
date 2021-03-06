package com.mlab.patterns;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 * Implementación básica para derivar las clases de Observables.<br/>
 * Implementa los métodos <em>registerObserver(), removeObserver(), 
 * notifyObservers(), startNotifications() y stopNotifications()</em><br/>
 * 
 * @author shiguera
 *
 */
public class AbstractObservable implements Observable {
	private final Logger LOG = Logger.getLogger(getClass().getName());
	List<Observer> observers; 
	//protected boolean isNotificationStopped;
	protected boolean isNotificationEnabled;
	protected AbstractObservable() {
		this.observers= new ArrayList<Observer>();
		this.isNotificationEnabled = true;
		
	}
	
	@Override
	public boolean registerObserver(Observer o) {
		return this.observers.add(o);
	}

	@Override
	public boolean removeObserver(Observer o) {
		return this.observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		if(this.isNotificationEnabled) {
			for(Observer o: this.observers) {
				o.update();
			}
		}
	}

	@Override
	public void stopNotifications() {
		this.isNotificationEnabled = false;
	}

	@Override
	public void startNotifications() {
		this.isNotificationEnabled = true;
	}
	

}
