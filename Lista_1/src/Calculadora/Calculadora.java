package Calculadora;

import java.util.Scanner;

public class Calculadora {
	public Calculadora() {

	}

	public double somar(double arg1, double arg2) {
		double res;
		res = arg1 + arg2;
		return res;
	}

	public double subtrair(double arg1, double arg2) {
		double res;
		res = arg1 - arg2;
		return res;
	}

	public double multipicar(double arg1, double arg2) {
		double res;
		res = arg1 * arg2;
		return res;
	}

	public double dividir(double arg1, double arg2) {
		double res;
		res = arg1 / arg2;
		return res;
	}

	public static void main(String[] args) {
		double arg1;
		char oper;
		double arg2;
		double res;
		Calculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		arg1 = input.nextDouble();
		oper = input.next().charAt(0);
		arg2 = input.nextDouble();

		if (oper == '+') {
			res = calc.somar(arg1, arg2);
			System.out.println(res);
		}
		if (oper == '-') {
			res = calc.subtrair(arg1, arg2);
			System.out.println(res);
		}
		if (oper == '*') {
			res = calc.multipicar(arg1, arg2);
			System.out.println(res);
		}
		if (oper == '/') {
			res = calc.dividir(arg1, arg2);
			System.out.println(res);
		}
		input.close();

	}
}
