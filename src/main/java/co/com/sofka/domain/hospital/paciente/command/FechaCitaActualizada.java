package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;
import co.com.sofka.domain.hospital.paciente.valor.IdCita;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class FechaCitaActualizada extends Command {
    private final IdPaciente idPaciente;
    private final IdCita idCita;
    private final Fecha fecha;

    public FechaCitaActualizada(IdPaciente idPaciente, IdCita idCita, Fecha fecha) {
        this.idPaciente = idPaciente;
        this.idCita = idCita;
        this.fecha = fecha;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public IdCita getIdCita() {
        return idCita;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
