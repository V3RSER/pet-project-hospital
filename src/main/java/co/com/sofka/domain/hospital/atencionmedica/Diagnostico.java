package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdDiagnostico;

import java.util.Objects;

public class Diagnostico extends Entity<IdDiagnostico> {
    private FormulaMedica formulaMedica;

    public Diagnostico(IdDiagnostico idDiagnostico, FormulaMedica formulaMedica) {
        super(idDiagnostico);
        this.formulaMedica = formulaMedica;
    }

    public void actualizarFormulaMedica(FormulaMedica formulaMedica) {
        this.formulaMedica = Objects.requireNonNull(formulaMedica, "La formula médica no debe ser nula");
    }

    public FormulaMedica formulaMedica() {
        return formulaMedica;
    }
}
