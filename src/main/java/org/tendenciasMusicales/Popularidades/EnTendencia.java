package org.tendenciasMusicales.Popularidades;

import org.tendenciasMusicales.Cancion;

public class EnTendencia extends Popularidad {

    public void reproducir(Cancion cancion) {
        this.moverANormalSiEsPosible(cancion);
    }

    public String detalleCompletoPara(Cancion cancion) {
        return Icono.FIRE.texto() + " - " + cancion.getAlbum().getArtista() + " - " + cancion.getAlbum().getNombre();
    }

    @Override
    protected String icono() {
        return "Poner icono";
    }

    @Override
    protected String leyenda(Cancion cancion) {
     return "Poner icono";
    }


    public void moverANormalSiEsPosible(Cancion cancion){

    }
}
