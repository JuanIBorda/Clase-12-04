package org.tendenciasMusicales.Popularidades;


import org.tendenciasMusicales.Cancion;

public abstract class Popularidad {



    public abstract void reproducir(Cancion cancion);

    public String detalleCompletoPara(Cancion cancion){
        String detalle = "";
        detalle += this.icono();
        detalle += " - ";
        detalle += this.leyenda(cancion);
        return detalle;
    }
    protected abstract String icono();
    protected abstract String leyenda(Cancion cancion);
}

/*

 */