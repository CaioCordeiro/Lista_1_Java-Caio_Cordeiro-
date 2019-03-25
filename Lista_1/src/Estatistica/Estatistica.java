package Estatistica;

import java.lang.Math;
import java.util.Scanner;

public class Estatistica {
	public int maiorValor;

	public Estatistica(int maiorValor) {
		this.setMaiorValor(maiorValor);
	}

	public void setMaiorValor(int maiorValor) {
		this.maiorValor = maiorValor;
	}

	public int getMaiorValor() {
		return maiorValor;
	}

	public int somaZeroMaiorValor(int value) {
		int res = 0;
		do {
			res = res + value;
			value--;
		} while (value > 0);
		return res;
	}

	public double mediaZeroMaiorValor(int value) {
		double res = (this.somaZeroMaiorValor(value)) / value;
		return res;
	}

	public double varianciaZeroMaiorValor(int value) {
		double media;
		double sum = 0;
		double res;
		int[] arr;
		arr = new int[value + 1];
		for (int i = 0; i <= value; i++) {
			arr[i] = i;
		}
		media = this.mediaZeroMaiorValor(value);
		for (int j = 0; j <= value; j++) {
			sum = (arr[j] - media) * (arr[j] - media);
		}
		res = Math.sqrt((sum / value));
		return res;
	}

	public void parZeroMaiorValor(int value) {
		int i = 0;
		while (i <= value) {
			if (i % 2 != 0) {
				System.out.println(i + " é impar");
			} else {
				System.out.println(i + " é par");
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int value;
		value = input.nextInt();
		Estatistica est = new Estatistica(value);
		System.out.println(est.somaZeroMaiorValor(value));
		System.out.println(est.mediaZeroMaiorValor(value));
		System.out.println(est.varianciaZeroMaiorValor(value));
		est.parZeroMaiorValor(value);
		input.close();

	}
}
