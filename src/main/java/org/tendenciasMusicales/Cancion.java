package org.tendenciasMusicales;

import lombok.Getter;
import lombok.Setter;
import org.tendenciasMusicales.Popularidades.EnAuge;
import org.tendenciasMusicales.Popularidades.Normal;
import org.tendenciasMusicales.Popularidades.Popularidad;

import java.time.LocalDateTime;

@Setter
@Getter
public class Cancion {

    private String nombre;
    private int cantReproducciones;
    private int cantLikes;
    private int cantDisLikes;
    private Album album;
    private Popularidad popularidad;

    private LocalDateTime fechaHoraUltVez ;

    public Cancion(String nombre){
        this.nombre = nombre;
        this.cantReproducciones = 0;
        this.cantLikes = 0;
        this.cantDisLikes = 0;
        this.popularidad = new Normal();
    }

    public void reproducir() {
        this.cantReproducciones++;
        this.popularidad.reproducir(this);
        this.fechaHoraUltVez = LocalDateTime.now();
    }

    public String detalleCompleto(){
        return"hola";
    }

    public void detalle(){
        this.popularidad.detalleCompletoPara(this);
    }


}