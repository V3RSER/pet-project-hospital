package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.Nombre;

public class NombreEnfermeroActualizado extends DomainEvent {
    private final Nombre nombre;

    public NombreEnfermeroActualizado(Nombre nombre) {
        super("doctor.nombreenfermeroactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
