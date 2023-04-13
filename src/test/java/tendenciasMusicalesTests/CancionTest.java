package tendenciasMusicalesTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.tendenciasMusicales.Album;
import org.tendenciasMusicales.Artista;
import org.tendenciasMusicales.Cancion;
import org.tendenciasMusicales.Popularidades.EnAuge;
import org.tendenciasMusicales.Popularidades.Normal;

public class CancionTest {

    private Cancion cancion;
    private Artista artista;
    private Album album;

    @BeforeEach /*Lo corre 1 vez sola antes del test*/
    public void init(){
        this.artista = new Artista();

        this.album = new Album();
        this.album.setArtista(this.artista);
        this.album.setAnio(2002);
        this.album.setNombre("A Rush of Blood to the head");

        this.cancion = new Cancion("The Scientist");
        this.cancion.setAlbum(album);
    }


    @Test
    @DisplayName("“The Scientist” recién se lanza (tiene popularidad normal).")
    public  void cancionTienePopularidadNormal(){

        this.cancion.reproducir();

        Assertions.assertEquals(Normal.class.getName(), this.cancion.getPopularidad().getClass().getName()); /*Resultado Esperado, Resultado de donde lo obtengo, getClass devuelve la clase*/
        //getclass le pide a la instancia que le devuelva a que clase pertenece.
    }

    @Test
    @DisplayName("'The Scientist' esta en auge por superar por superar el minimo de reproducciones esperadas ")
    public void cancionPasaAEstarEnAuge(){
        Normal.setCantidadReproduccionesMaximas(3);

        this.cancion.reproducir();
        this.cancion.reproducir();
        this.cancion.reproducir();
        this.cancion.reproducir();

        Assertions.assertEquals(EnAuge.class.getName(), this.cancion.getPopularidad().getClass().getName());
    }
}
