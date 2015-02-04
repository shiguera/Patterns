package com.mlab.patterns;

public interface Composite {
	boolean addComponent(CompositeObserver o);
	boolean removeComponent(CompositeObserver o);
	CompositeObserver getComponent(int index);
}
