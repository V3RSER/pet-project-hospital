package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdDiagnostico;

public class Diagnostico extends Entity<IdDiagnostico> {
    private final FormulaMedica formulaMedica;

    public Diagnostico(IdDiagnostico idDiagnostico, FormulaMedica formulaMedica) {
        super(idDiagnostico);
        this.formulaMedica = formulaMedica;
    }

    public FormulaMedica formulaMedica() {
        return formulaMedica;
    }
}
