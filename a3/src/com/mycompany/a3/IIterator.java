package com.mycompany.a3;

public interface IIterator {
	boolean hasNext();
	GameObject getNext();
	int getIndex();
	Object objectAt(int i);
	void remove();
}
