package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;
import co.com.sofka.domain.hospital.paciente.valor.IdAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.IdCita;

public class CitaAtendida extends DomainEvent {
    private final IdCita idCita;
    private final Fecha fecha;

    public CitaAtendida(IdCita idCita, Fecha fecha){
        super("paciente.citaatendida");
        this.fecha = fecha;
        this.idCita=idCita;
    }

    public IdCita getIdCita() {
        return idCita;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
