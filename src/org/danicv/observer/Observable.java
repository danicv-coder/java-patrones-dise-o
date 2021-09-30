package org.danicv.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
	protected List<Observer> observers = new ArrayList<>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObserver() {
		for (Observer obs : observers) {
			obs.update(this);
		}
	}
}
