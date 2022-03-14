package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;
import co.com.sofka.domain.hospital.paciente.valor.IdCita;

public class FechaCitaActualizada extends DomainEvent {
    private final IdCita idCita;
    private final Fecha fecha;

    public FechaCitaActualizada(IdCita idCita, Fecha fecha) {
        super("paciente.fechacitaactualizada");
        this.idCita = idCita;
        this.fecha = fecha;
    }

    public IdCita getIdCita() {
        return idCita;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
