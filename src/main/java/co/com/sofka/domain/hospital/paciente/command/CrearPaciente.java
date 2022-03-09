package co.com.sofka.domain.hospital.paciente.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;
import co.com.sofka.domain.hospital.paciente.valor.Nombre;

public class CrearPaciente extends Command {
    private final IdPaciente idPaciente;
    private final Nombre nombre;

    public CrearPaciente(IdPaciente idPaciente, Nombre nombre) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
