package com.example.design.action.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {

	private List<Object> list = new ArrayList<Object>();

	public void add(Object obj) {
		this.list.add(obj);
	}

	public void remove(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return this.list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public MyIterator createIterator() {
		return new ConcreteIterator();
	}

	private class ConcreteIterator implements MyIterator {

		private int cursor;

		@Override
		public void first() {
			// TODO Auto-generated method stub
			cursor = 0;
		}

		@Override
		public void next() {
			// TODO Auto-generated method stub
			if (cursor < list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return cursor < list.size();
		}

		@Override
		public boolean isFirst() {
			// TODO Auto-generated method stub
			return cursor == 0;
		}

		@Override
		public boolean isLast() {
			// TODO Auto-generated method stub
			return cursor == list.size()-1;
		}

		@Override
		public Object getCurrentObj() {
			// TODO Auto-generated method stub
			return list.get(cursor);
		}
	}

}
