package com.mlab.patterns;

public abstract class AbstractSingleObserver implements CompositeObserver {

	protected Observable observable;
	
	protected AbstractSingleObserver(Observable observable) {
		this.observable = observable;
		this.observable.registerObserver(this);
	}
	@Override
	public Observable getObservable() {
		return observable;
	}

	@Override
	public boolean addComponent(CompositeObserver o) {
		// ignore method for AbstractSingleObserver
		return false;
	}

	@Override
	public boolean removeComponent(CompositeObserver o) {
		// ignore method for AbstractSingleObserver
		return false;
	}

	@Override
	public CompositeObserver getComponent(int index) {
		// ignore method for AbstractSingleObserver
		return null;
	}

}
