package org.tendenciasMusicales.Popularidades;

import lombok.Getter;
import lombok.Setter;
import org.tendenciasMusicales.Cancion;

@Setter
@Getter
public class Normal extends Popularidad{

    private static int cantidadReproduccionesMaximas = 1000;
    /*
    Es un atributo de la clase, no de los objetos,
    si modificamos la variable desde un objeto => se modifica en todos
    */

    private int cantidadRepoducciones;

    public Normal(){
        this.cantidadRepoducciones = 0;
    }
    public void reproducir(Cancion cancion) {
        this.cantidadRepoducciones ++ ;
        if(this.cantidadRepoducciones > cantidadReproduccionesMaximas){
            cancion.setPopularidad(new EnAuge());
        }

    }

    public String detalleCompletoPara(Cancion cancion) {
        return Icono.MUSICAL_NOTE.texto() + " - " + cancion.getAlbum().getArtista() + " - " + cancion.getAlbum().getNombre();
    }

    @Override
    protected String icono() {
    return "Poner icono";
    }

    @Override
    protected String leyenda(Cancion cancion) {
        return "Poner Icono";
    }

    public static void setCantidadReproduccionesMaximas(int cantidadReproduccionesMaximas) {
        Normal.cantidadReproduccionesMaximas = cantidadReproduccionesMaximas;
    }
}
