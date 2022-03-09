package co.com.sofka.domain.hospital.atencionmedica.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdDiagnostico;

public class RealizarDiagnostico extends Command {
    private final IdAtencionMedica idAtencionMedica;
    private final IdDiagnostico idDiagnostico;
    private final FormulaMedica formulaMedica;

    public RealizarDiagnostico(IdAtencionMedica idAtencionMedica, IdDiagnostico idDiagnostico, FormulaMedica formulaMedica) {
        this.idAtencionMedica = idAtencionMedica;
        this.idDiagnostico = idDiagnostico;
        this.formulaMedica = formulaMedica;
    }

    public IdAtencionMedica getIdAtencionMedica() {
        return idAtencionMedica;
    }

    public IdDiagnostico getIdDiagnostico() {
        return idDiagnostico;
    }

    public FormulaMedica getFormulaMedica() {
        return formulaMedica;
    }
}
