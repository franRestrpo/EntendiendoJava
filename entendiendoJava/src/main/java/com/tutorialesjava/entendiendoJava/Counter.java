package com.tutorialesjava.entendiendoJava;

import java.util.Iterator;

public class Counter implements Iterable<Integer> {

	private int start;
	private int end;

	public Counter(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int i = start;

			@Override
			public boolean hasNext() {
				return i < end;
			}

			@Override
			public Integer next() {
				return i++;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
