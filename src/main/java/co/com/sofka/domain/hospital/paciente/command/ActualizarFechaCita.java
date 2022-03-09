package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.Fecha;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class ActualizarFechaCita extends Command {
    private final IdPaciente idPaciente;
    private final Fecha fecha;

    public ActualizarFechaCita(IdPaciente idPaciente, Fecha fecha) {
        this.idPaciente = idPaciente;
        this.fecha = fecha;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
