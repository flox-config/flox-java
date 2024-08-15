package de.flox.config.model;

public interface IFloxObject<T> {
	T getValue();
	void setValue(T value);
}
