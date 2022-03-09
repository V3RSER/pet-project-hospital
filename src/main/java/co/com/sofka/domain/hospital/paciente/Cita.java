package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.paciente.valor.CitaId;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;

public class Cita extends Entity<CitaId> {
    private final Fecha fecha;

    public Cita(CitaId citaId, Fecha fecha) {
        super(citaId);
        this.fecha = fecha;
    }

    public Fecha fecha() {
        return fecha;
    }
}
