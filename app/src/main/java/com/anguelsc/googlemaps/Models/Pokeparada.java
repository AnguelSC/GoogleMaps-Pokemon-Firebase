package com.anguelsc.googlemaps.Models;

import android.os.Parcelable;

/**
 * Created by Adrian-OTI on 29/08/2016.
 */
public class Pokeparada{
    private double latitud;
    private double longitud;
    private String nombre;

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
