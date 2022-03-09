package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.DiagnosticoId;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;

public class Diagnostico extends Entity<DiagnosticoId> {
    private final FormulaMedica formulaMedica;

    public Diagnostico(DiagnosticoId diagnosticoId, FormulaMedica formulaMedica) {
        super(diagnosticoId);
        this.formulaMedica = formulaMedica;
    }

    public FormulaMedica formulaMedica() {
        return formulaMedica;
    }
}
