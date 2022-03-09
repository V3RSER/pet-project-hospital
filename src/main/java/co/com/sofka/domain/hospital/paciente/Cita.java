package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.paciente.valor.IdCita;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;

public class Cita extends Entity<IdCita> {
    private final Fecha fecha;

    public Cita(IdCita idCita, Fecha fecha) {
        super(idCita);
        this.fecha = fecha;
    }

    public Fecha fecha() {
        return fecha;
    }
}
