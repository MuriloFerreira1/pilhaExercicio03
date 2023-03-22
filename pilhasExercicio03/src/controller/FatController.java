package controller;

import java.util.Iterator;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	public static int fatorial(int valor) {
		Pilha p = new Pilha();
		int calc=1;
		for (int i = valor; i > 0;i--) {
			p.push(i);
		}
		while(!p.isEmpty()) {
			try {
				calc=calc*p.pop();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return calc;
	}
}
