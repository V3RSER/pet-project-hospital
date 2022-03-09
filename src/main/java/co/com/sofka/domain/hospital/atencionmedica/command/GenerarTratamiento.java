package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdTratamiento;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

public class GenerarTratamiento extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final IdTratamiento idTratamiento;
    private final Procedimiento procedimiento;

    public GenerarTratamiento(IdAtencionMedica idAtencionMedica, IdTratamiento idTratamiento, Procedimiento procedimiento) {
        this.idAtencionMedica = idAtencionMedica;
        this.idTratamiento = idTratamiento;
        this.procedimiento = procedimiento;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public IdTratamiento getIdTratamiento() {
        return idTratamiento;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }
}
