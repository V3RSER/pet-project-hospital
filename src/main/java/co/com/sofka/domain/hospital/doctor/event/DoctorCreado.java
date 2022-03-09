package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.Nombre;

public class DoctorCreado extends DomainEvent {
    private final Nombre nombre;

    public DoctorCreado(Nombre nombre) {
        super("doctor.doctorcreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
