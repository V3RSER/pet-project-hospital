package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.IdEnfermero;
import co.com.sofka.domain.hospital.valor.Nombre;

public class NombreEnfermeroActualizado extends DomainEvent {
    private final IdEnfermero idEnfermero;
    private final Nombre nombre;

    public NombreEnfermeroActualizado(IdEnfermero idEnfermero, Nombre nombre) {
        super("doctor.nombreenfermeroactualizado");
        this.idEnfermero = idEnfermero;
        this.nombre = nombre;
    }

    public IdEnfermero getIdEnfermero() {
        return idEnfermero;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
