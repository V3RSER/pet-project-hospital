package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;

public class FechaCitaActualizada extends DomainEvent {
    private final Fecha fecha;

    public FechaCitaActualizada(Fecha fecha) {
        super("paciente.fechacitaactualizada");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }

}
