/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciontaller;

/**
 *
 * @author hecto
 */
public class OrdenReparacion extends VehiculoTaller{
    private double costoManoDeObra;
    private int diasReparacion;

    public OrdenReparacion(String placa, String propietario, double costoManoDeObra, int diasReparacion) {
        super(placa, propietario); //[cite: 2]
        setCostoManoDeObra(costoManoDeObra);
        setDiasReparacion(diasReparacion);
    }

    public double getCostoManoDeObra() {
        return costoManoDeObra;
    }

    public void setCostoManoDeObra(double costoManoDeObra) {
        if (costoManoDeObra >= 0) {
            this.costoManoDeObra = costoManoDeObra;
        } else {
            throw new IllegalArgumentException("El costo de mano de obra no puede ser negativo.");
        }
    }

    public int getDiasReparacion() {
        return diasReparacion;
    }

    public void setDiasReparacion(int diasReparacion) {
        if (diasReparacion >= 0) {
            this.diasReparacion = diasReparacion;
        } else {
            throw new IllegalArgumentException("Los días de reparación no pueden ser negativos.");
        }
    }

    // Métodos de lógica / procesamiento
    public double calcularCostoTotalReparacion(double costoRefacciones) {
        if (costoRefacciones < 0) {
            throw new IllegalArgumentException("El costo de refacciones no puede ser negativo.");
        }
        return this.costoManoDeObra + costoRefacciones;
    }

    public void aplicarDescuentoTaller(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            this.costoManoDeObra -= this.costoManoDeObra * (porcentaje / 100.0);
        } else {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 1 y 100.");
        }
    }

    public void agregarDiasPlazo(int diasAdicionales) {
        if (diasAdicionales > 0) {
            this.diasReparacion += diasAdicionales;
        } else {
            throw new IllegalArgumentException("Los días adicionales deben ser mayores a cero.");
        }
    }

    // Método recursivo
    public double calcularMantenimientoPreventivoRecursivo(int ciclos) {
        if (ciclos <= 0) {
            return 0.0;
        }
        double costoBaseCiclo = this.diasReparacion * 150.0;
        return costoBaseCiclo + calcularMantenimientoPreventivoRecursivo(ciclos - 1);
    }
}
