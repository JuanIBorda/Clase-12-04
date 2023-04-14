package FinalCuidandonos;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Persona {
    String nombre;
    String apellido;
    String direccion;
    String Sexo;
    boolean notificacionesEnCelular = true;
    boolean usuarioPasivo = true;

    List<Persona> contactos = new ArrayList<>(); // los que podes seleccionar para que te cuiden

    public void iniciarViaje() {
        //Trayecto trayecto = new Trayecto(this,origen,destino,contactos)
    }

    List<Trayecto> trayectosParaAceptarCuidado = new ArrayList<>();
    /*
    Una persona tiene contactos y elige de ahi a sus cuidadores?
    O no los conoces hasta el momento de solicitar un viaje
    */
    public boolean notificacionesActivadas(){
        return notificacionesEnCelular;
    }
    public void desactivarNotificaciones(){
         this.notificacionesEnCelular = false;
    }
    public void activarNotificaciones(){
        this.notificacionesEnCelular = true;
    }

    public boolean usuarioPasivo(){
        return usuarioPasivo;
    }

    //Donde iria codeada la notificacion? Pense una clase System que notifique y administre
}
