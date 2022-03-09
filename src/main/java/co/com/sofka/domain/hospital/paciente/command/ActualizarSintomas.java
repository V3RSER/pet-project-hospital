package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;
import co.com.sofka.domain.hospital.paciente.valor.Sintomas;

public class ActualizarSintomas extends Command {
    private final IdPaciente idPaciente;
    private final Sintomas sintomas;

    public ActualizarSintomas(IdPaciente idPaciente, Sintomas sintomas) {
        this.idPaciente = idPaciente;
        this.sintomas = sintomas;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }
}
