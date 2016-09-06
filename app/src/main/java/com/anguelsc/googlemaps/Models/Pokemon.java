package com.anguelsc.googlemaps.Models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Adrian-OTI on 29/08/2016.
 */
public class Pokemon implements Parcelable {
    private double latitud;
    private double longitud;
    private String nombre;

    public Pokemon(Parcel parcel) {
        setNombre(parcel.readString());
        setLatitud(parcel.readDouble());
        setLongitud(parcel.readDouble());
    }
    public Pokemon(String nombre, double latitud, double longitud){
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static final Parcelable.Creator<Pokemon> CREATOR = new Parcelable.Creator<Pokemon>(){
        @Override
        public Pokemon createFromParcel(Parcel source) {
            return new Pokemon(source);
        }
        @Override
        public Pokemon[] newArray(int size) {
            return new Pokemon[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getNombre());
        parcel.writeDouble(getLatitud());
        parcel.writeDouble(getLongitud());
    }

}
