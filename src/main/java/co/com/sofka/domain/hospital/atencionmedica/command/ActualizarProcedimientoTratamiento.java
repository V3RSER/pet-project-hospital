package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.Procedimiento;

public class ActualizarProcedimientoTratamiento extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final Procedimiento procedimiento;

    public ActualizarProcedimientoTratamiento(IdAtencionMedica idAtencionMedica, Procedimiento procedimiento) {
        this.idAtencionMedica = idAtencionMedica;
        this.procedimiento = procedimiento;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public Procedimiento getProcedimiento() {
        return procedimiento;
    }
}
