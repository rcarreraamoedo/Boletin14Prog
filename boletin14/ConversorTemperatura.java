/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author rcarreraamoedo
 */
public class ConversorTemperatura {
    
    public void temperaturaFharenheit (float grados) throws TemperaturaErradaExcepcion{
        if (grados < 80)
            throw new TemperaturaErradaExcepcion ("***No se puede con menos de 80ºC****");
        float Fharenheit = (float) (9.0/5.0*grados+32.4);
        System.out.println("Temperatura en Fharenheit: "+Fharenheit);
    }
    public void CentigradosaReamur (float centigrados) throws TemperaturaErradaExcepcion{
        float Reamur = (float) (4.0/5.0*centigrados);
        System.out.println("Temperatura en Reamur: "+Reamur);
    }
}
