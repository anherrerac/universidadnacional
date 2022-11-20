/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadnacional;

/**
 *
 * @author andre
 */
class Pitagoras{
	public static double calcular_hipotenusa(double a,double b) {
		double hipotenusa;
		hipotenusa= Math.sqrt(Math.pow(a, 2)+ Math.pow(b,2));
		return hipotenusa;
	}
}