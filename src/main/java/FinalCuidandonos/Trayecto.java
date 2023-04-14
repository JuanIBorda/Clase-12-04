package FinalCuidandonos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Trayecto {

    private String origen;
    private String destino;
    private Persona transeunte; // persona que crea el viaje

    // bueno yo supongo que mas adelante voy a obtener los cuidadores de la base de datos a partir del usuario
    // filtrados por aquellos que pueden ser asignados al trayecto.


    List<Persona> cuidadores = new ArrayList<>();

    public Trayecto(String origen,String destino,Persona transeunte , List<Persona> cuidadores) {
        this.origen = origen;
        this.destino = destino;
        this.transeunte = transeunte;
        this.cuidadores = cuidadores;

        //cuidadores.stream().forEach(cuidador -> cuidador.notificar());

    } //Tome esta desiciòn porque supongo que tengo una pantalla para seleccionar esta info


    public void comenzar(){
        this.transeunte.desactivarNotificaciones();
    }

    public void finalizarViaje(){
        this.transeunte.activarNotificaciones();
    }

}
