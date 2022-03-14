
package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;

public class ActualizarFormulaMedica extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final FormulaMedica formulaMedica;

    public ActualizarFormulaMedica(IdAtencionMedica idAtencionMedica, FormulaMedica formulaMedica) {
        this.idAtencionMedica = idAtencionMedica;
        this.formulaMedica = formulaMedica;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public FormulaMedica getFormulaMedica() {
        return formulaMedica;
    }
}
