package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;
import co.com.sofka.domain.hospital.paciente.valor.IdCita;

import java.util.Objects;

public class Cita extends Entity<IdCita> {
    private Fecha fecha;

    public Cita(IdCita idCita, Fecha fecha) {
        super(idCita);
        this.fecha = fecha;
    }

    public void actualizarFecha(Fecha fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    }

    public Fecha fecha() {
        return fecha;
    }

}
