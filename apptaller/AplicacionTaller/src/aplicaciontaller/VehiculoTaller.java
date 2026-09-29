/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciontaller;

/**
 *
 * @author hecto
 */
public class VehiculoTaller {
    protected String placa;
    protected String propietario;

    public VehiculoTaller() {
        this.placa = "SIN-PLACA";
        this.propietario = "Desconocido";
    }
    public VehiculoTaller(String placa, String propietario) {
        if (placa == null || placa.trim().isEmpty())
        {
            throw new IllegalArgumentException("La placa no puede estar vacia");
        }
        if (propietario == null || propietario.trim().isEmpty())
        {
            throw new IllegalArgumentException("El propietario no puede estar vacio");
        }
        this.placa = placa;
        this.propietario = propietario;
    }

    public String getInfoVehiculo() {
        return "Placa: " + placa + " | Propietario: " + propietario;
    }
}
