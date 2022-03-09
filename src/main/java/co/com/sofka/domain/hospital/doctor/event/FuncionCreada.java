package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.IdFuncion;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

public class FuncionCreada extends DomainEvent {
    private final IdFuncion idFuncion;
    private final TipoDeFuncion tipoDeFuncion;

    public FuncionCreada(IdFuncion idFuncion, TipoDeFuncion tipoDeFuncion){
        super("doctor.funcioncreada");
        this.idFuncion= idFuncion;
        this.tipoDeFuncion=tipoDeFuncion;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
