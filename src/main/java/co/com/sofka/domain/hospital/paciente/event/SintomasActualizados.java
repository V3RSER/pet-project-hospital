package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.Sintomas;

public class SintomasActualizados extends DomainEvent {
    private final Sintomas sintomas;

    public SintomasActualizados(Sintomas sintomas){
        super("paciente.sintomasActualizados");
        this.sintomas=sintomas;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }
}
