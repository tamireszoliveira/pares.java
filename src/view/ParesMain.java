package view;

import javax.swing.JOptionPane;

import controller.ParesController;

public class ParesMain {
	public static void main(String args[]) {
			/*3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
	números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
	diferentes de zero.*/
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor"));
		int vetor[]= new int [tamanho];
		for(int i = 0; i< vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Preencha o vetor"));
		}
		ParesController par = new ParesController();
		int pares = par.fpares(vetor);
		System.out.println(pares); 
	}
}
