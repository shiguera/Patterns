package com.mlab.patterns;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCompositeObserver implements CompositeObserver {

	protected Observable observable;
	protected List<CompositeObserver> components;
	
	// Constructor
	protected AbstractCompositeObserver(Observable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
		this.components = new ArrayList<CompositeObserver>();
	}
	
	@Override
	public Observable getObservable() {
		return observable;
	}

	@Override
	public void update() {
		for(CompositeObserver o: components) {
			o.update();
		}
	}

	@Override
	public boolean addComponent(CompositeObserver o) {
		return components.add(o);
	}

	@Override
	public boolean removeComponent(CompositeObserver o) {
		return components.remove(o);
	}

	@Override
	public CompositeObserver getComponent(int index) {
		return components.get(index);
	}

}
