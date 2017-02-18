package view;

import java.util.Scanner;

import javax.swing.JOptionPane;

import struct.DoubleListStruct;

public class DoublyList {

	public static void main(String[] args) {
		 Scanner inpute = new Scanner(System.in);
			int number= 0;
			int option = 0;
			DoubleListStruct linked = new DoubleListStruct();
		  do {
			 try {
					option  = Integer.parseInt(JOptionPane.showInputDialog(null,
							"-1. add Firts element \n"
							+ "-2 add Final element \n"
							+ "-3	View End to Head\n"
							+ "-4	View Head to End\n"
							+ "-9. exit \n","input option"));
					switch (option) {
					case 1:
						number  = Integer.parseInt(JOptionPane.showInputDialog(null,
								"-1. digit element \n","input number"));
						linked.addInitial(number);
						break;
					case 2:
						number  = Integer.parseInt(JOptionPane.showInputDialog(null,
								"-1. digit element \n","input number"));
						linked.addEnd(number);
						break;
					case 3:
						linked.viewEndInitial();
						break;
					case 4:
						linked.viewInitalEnd();
						break;
					default: 
						break;
					}
				 
			 		} catch (Exception e) {		
			 			
			 			}
			  
			  
		} while (option !=9);
		}

	}
