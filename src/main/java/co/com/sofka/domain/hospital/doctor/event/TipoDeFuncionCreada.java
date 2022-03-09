package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

public class TipoDeFuncionCreada extends DomainEvent {
    private final TipoDeFuncion tipoDeFuncion;

    public TipoDeFuncionCreada(TipoDeFuncion tipoDeFuncion){
        super("doctor.tipodefuncioncreada");
        this.tipoDeFuncion=tipoDeFuncion;
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
