package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.IdEnfermero;
import co.com.sofka.domain.hospital.doctor.valor.Nombre;

public class EnfermeroAsignado extends DomainEvent {
    private final IdEnfermero idEnfermero;
    private final Nombre nombre;

    public EnfermeroAsignado(IdEnfermero idEnfermero, Nombre nombre){
        super("doctor.enfermeroasignado");
        this.idEnfermero=idEnfermero;
        this.nombre=nombre;
    }

    public IdEnfermero getIdEnfermero(){return idEnfermero;}

    public Nombre getNombre() {return nombre;}
}
