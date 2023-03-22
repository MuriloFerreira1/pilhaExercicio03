package view;

import javax.swing.JOptionPane;

import controller.FatController;

public class Principal {
	public static void main(String[] args) {
		int val=0;
		do {
			val=Integer.parseInt(JOptionPane.showInputDialog("Insira o valor"));
		if(val>10||val<0) {
			System.out.println("Valor inválido, insira novamente");
		}
		}while(val>10||val<0);
		
		FatController.fatorial(val);
	}	
	
}
