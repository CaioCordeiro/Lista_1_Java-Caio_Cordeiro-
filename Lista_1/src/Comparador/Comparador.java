package Comparador;

import java.util.Scanner;

public class Comparador {
	public int arg1;
	public int arg2;
	public int arg3;

	public Comparador() {

	}

	public Comparador(int arg1, int arg2, int arg3) {
		this.setArg1(arg1);
		this.setArg2(arg2);
		this.setArg3(arg3);
	}

	public int getArg1() {
		return arg1;
	}

	public void setArg1(int arg1) {
		this.arg1 = arg1;
	}

	public int getArg2() {
		return arg2;
	}

	public void setArg2(int arg2) {
		this.arg2 = arg2;
	}

	public int getArg3() {
		return arg3;
	}

	public void setArg3(int arg3) {
		this.arg3 = arg3;
	}

	public int getMaior() {
		arg1 = this.getArg1();
		arg2 = this.getArg2();
		arg3 = this.getArg3();
		int maior = arg1;

		if (arg1 > arg2 && arg1 > arg3) {
			maior = arg1;
		}
		if (arg2 > arg1 && arg2 > arg3) {
			maior = arg2;
		}
		if (arg3 > arg1 && arg3 > arg2) {
			maior = arg3;
		}
		return maior;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arg1, arg2, arg3;
		arg1 = input.nextInt();
		arg2 = input.nextInt();
		arg3 = input.nextInt();
		Comparador comp = new Comparador(arg1, arg2, arg3);
		System.out.println(comp.getMaior());
		input.close();

	}
}
