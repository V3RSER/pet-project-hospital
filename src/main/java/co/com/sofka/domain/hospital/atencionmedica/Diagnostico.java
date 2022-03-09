package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdDiagnostico;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;

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
