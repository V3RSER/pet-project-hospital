package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;

public class FormulaMedicaActualizada extends DomainEvent {
    private final FormulaMedica formulaMedica;

    public FormulaMedicaActualizada(FormulaMedica formulaMedica) {
        super("atencionmedica.formulamedicaactualizada");
        this.formulaMedica = formulaMedica;
    }

    public FormulaMedica getFormulaMedica() {
        return formulaMedica;
    }
}
