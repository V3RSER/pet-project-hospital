package co.com.sofka.domain.hospital.atencionmedica.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.FormulaMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdDiagnostico;

public class DiagnosticoRealizado extends DomainEvent {
    private final IdDiagnostico idDiagnostico;
    private final FormulaMedica formulaMedica;

    public DiagnosticoRealizado(IdDiagnostico idDiagnostico, FormulaMedica formulaMedica) {
        super("atencionmedica.diagnosticorealizado");
        this.idDiagnostico = idDiagnostico;
        this.formulaMedica = formulaMedica;
    }
}
