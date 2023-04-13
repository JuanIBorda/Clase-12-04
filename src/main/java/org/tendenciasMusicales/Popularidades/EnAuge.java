package org.tendenciasMusicales.Popularidades;


import org.tendenciasMusicales.Cancion;

public class EnAuge extends Popularidad{

    private static int cantidadReproduccionesMaximas = 50000;
    private int cantMaxDislikes = 5000;
    private int cantMaxLikes = 20000;


    private int cantidadReproducciones = 0;

    public EnAuge(){

    }

    public void reproducir(Cancion cancion) {
        this.cantidadReproducciones++;
        if (this.cantidadReproducciones > cantidadReproduccionesMaximas && cancion.getCantLikes() > cantMaxLikes){
            cancion.setPopularidad(new EnTendencia());
        } else  {
                if(this.cantMaxDislikes > cantMaxDislikes);
                }
    }
    public String detalleCompletoPara(Cancion cancion) {
        return  Icono.ROCKET.texto() + " - " + cancion.getAlbum().getArtista() + " - " + cancion.getAlbum().getNombre();
    }

    @Override
    protected String icono() {
        return "Poner icono";
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return "Poner icono";
    }
}
