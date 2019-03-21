package Medidas;
import java.util.Scanner;

public class ConversorDeMedidas {
	public String converterMassa(Medidas arg1, Medidas arg2) {
		String res1=arg1.getMassa()+" "+arg1.getUnidadeDeMassa();
		if(arg1.getUnidadeDeMassa().contentEquals("kg") && arg2.getUnidadeDeMassa().contentEquals("lb")) {
			res1 = (arg1.getMassa()*2.2046) +" " + "lb";
		}
		if(arg1.getUnidadeDeMassa().contentEquals("lb") && arg2.getUnidadeDeMassa().contentEquals("kg")) {
			res1 = (arg1.getMassa()/2.2046)+" " + "kg";
		}
		return (res1);
	}
	public String converterTemperatura(Medidas arg1, Medidas arg2) {
		String res1=arg1.getTemperatura() +" " + arg1.getUnidadeDeTemperatura() ;
		if(arg1.getUnidadeDeTemperatura().contentEquals("C") && arg2.getUnidadeDeTemperatura().contentEquals("F")) {
			res1 = ((arg1.getTemperatura()*1.8)+32) + " " + "F";
		}
		if(arg1.getUnidadeDeTemperatura().contentEquals("F") && arg2.getUnidadeDeTemperatura().contentEquals("C")) {
			res1 = ((arg1.getTemperatura()-32)/1.8) + " " + "C";
		}
		return res1;
	}
	public String converterDistancia(Medidas arg1, Medidas arg2) {
		String res=arg1.getDistancia() +" " + arg1.getUnidadeDeDistancia();
		if(arg1.getUnidadeDeDistancia().contentEquals("km") && arg2.getUnidadeDeDistancia().contentEquals("mi")) {
			res = (arg1.getDistancia()/1.609)+" "+ "mi";
			
		}
		if(arg1.getUnidadeDeDistancia().contentEquals("mi") && arg2.getUnidadeDeDistancia().contentEquals("km")) {
			res = (arg1.getDistancia()*1.609)+" "+ "km";
			
		}
		return res;
	}
	public static void main(String[] args) {
		double uni;
		String med,med2;
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor e a medida assim => <unidade><espaço><medida>");
		uni = input.nextDouble();
		med = input.next();
		System.out.println("Insira a unidade para transformar");
		med2= input.next();
		System.out.println();
		System.out.printf("%f %s => %s \n",uni,med,med2);
		Medidas medidas1 = new Medidas();
		Medidas medidas2 = new Medidas();
		ConversorDeMedidas conversor = new ConversorDeMedidas();
		if(med.contentEquals("kg") | med.contentEquals("lb")) {
			medidas1.setMassa(uni);
			medidas1.setUnidadeDeMassa(med);
			medidas2.setUnidadeDeMassa(med2);
			System.out.println(conversor.converterMassa(medidas1,medidas2));
		}
		if(med.contentEquals("km") | med.contentEquals("mi")) {
			medidas1.setDistancia(uni);
			medidas1.setUnidadeDeDistancia(med);
			medidas2.setUnidadeDeDistancia(med2);
			System.out.println(conversor.converterDistancia(medidas1,medidas2));
		}
		if(med.contentEquals("C") | med.contentEquals("F")) {
			medidas1.setTemperatura(uni);
			medidas1.setUnidadeDeTemperatura(med);
			medidas2.setUnidadeDeTemperatura(med2);
			System.out.println(conversor.converterTemperatura(medidas1,medidas2));
		}
		input.close();
	}
}
