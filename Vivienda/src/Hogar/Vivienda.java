/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }

    /**
     * @return the precio
     */
    protected double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    protected int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    protected void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    protected double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    protected void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    protected boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    protected void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    protected String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    protected void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    protected String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    protected void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - descuento );
    }

    
}
