package model;

public class DoubleNode {
	public DoubleNode nextNode,lastNode;
	public int dataNum;
		public 	DoubleNode(int data,DoubleNode last,DoubleNode next){
			dataNum = data;
			nextNode=next;
			lastNode =last;
		}
		public 	DoubleNode(int data){
			this(data,null,null);
		}
		
}
