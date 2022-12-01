package com.bridgelabz;
//interface 

	public interface INode<K> {
		
		public K getKey();
		public void setKey(K Key);
		
		INode<K> getNext();
		public void setNext(INode<K> next);
		


}
