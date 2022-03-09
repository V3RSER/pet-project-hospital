package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.Urgencia;

public class AtenderUrgencia extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final Urgencia urgencia;

    public AtenderUrgencia(IdAtencionMedica idAtencionMedica, Urgencia urgencia) {
        this.idAtencionMedica = idAtencionMedica;
        this.urgencia = urgencia;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }
}
