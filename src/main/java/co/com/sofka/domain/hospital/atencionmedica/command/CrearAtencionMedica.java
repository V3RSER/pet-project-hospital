package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class CrearAtencionMedica extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final IdDoctor idDoctor;
    private final IdPaciente idPaciente;

    public CrearAtencionMedica(IdAtencionMedica idAtencionMedica, IdDoctor idDoctor, IdPaciente idPaciente) {
        this.idAtencionMedica = idAtencionMedica;
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }
}
