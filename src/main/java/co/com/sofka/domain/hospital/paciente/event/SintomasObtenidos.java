package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.Sintomas;

public class SintomasObtenidos extends DomainEvent {
    private final Sintomas sintomas;

    public SintomasObtenidos(Sintomas sintomas){
        super("paciente.sintomasObtenidos");
        this.sintomas=sintomas;
    }

    public Sintomas getSintomas() {
        return sintomas;
    }
}
