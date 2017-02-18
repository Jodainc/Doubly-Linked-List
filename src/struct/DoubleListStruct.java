package struct;
import javax.swing.JOptionPane;

import model.DoubleNode;
public class DoubleListStruct {
	private DoubleNode initial,end;
	public DoubleListStruct(){
		initial=end=null;
	}
	public boolean isEmpty(){
		return initial==null;
	}

	public void addInitial(int data){
		if(!(isEmpty())){
			initial = new DoubleNode(data, null, initial);
			initial.nextNode.lastNode=initial;
		}else{
			initial=end=new DoubleNode(data);
		}
	}
	public void addEnd(int data){
		if(!(isEmpty())){
			end = new DoubleNode(data, end, null);
			end.lastNode.nextNode=end;
		}else{
			initial=end=new DoubleNode(data);
		}
	}
	
	public void viewInitalEnd(){
		if(!(isEmpty())){
			String format = "<=>";
			DoubleNode aux = initial;
			while(aux!=null){
				format = format + "["+aux.dataNum+"]<=>";
						aux=aux.nextNode;
			}
			JOptionPane.showInputDialog(null, format);
			
		}
	}
	public void viewEndInitial(){
		if(!(isEmpty())){
			String format = "<=>";
			DoubleNode aux = end;
			while(aux!=null){
				format = format + "["+aux.dataNum+"]<=>";
						aux=aux.lastNode;
			}
			JOptionPane.showInputDialog(null, format);
			
		}
	}
}
