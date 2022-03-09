package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

public class TipoDeFuncionActualizada extends DomainEvent {
    private final TipoDeFuncion tipoDeFuncion;

    public TipoDeFuncionActualizada(TipoDeFuncion tipoDeFuncion) {
        super("doctor.tipodefuncionactualizada");
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
