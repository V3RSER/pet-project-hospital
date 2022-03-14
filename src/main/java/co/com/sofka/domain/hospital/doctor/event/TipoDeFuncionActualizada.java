package co.com.sofka.domain.hospital.doctor.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

import java.util.Objects;

public class TipoDeFuncionActualizada extends DomainEvent {
    private TipoDeFuncion tipoDeFuncion;

    public TipoDeFuncionActualizada(TipoDeFuncion tipoDeFuncion) {
        super("doctor.tipodefuncionactualizada");
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public void actualizarTipoDeFuncion(TipoDeFuncion tipoDeFuncion) {
        this.tipoDeFuncion = Objects.requireNonNull(tipoDeFuncion, "La modificarTipoFuncion no debe ser nula");
    }

    public TipoDeFuncion getTipoDeFuncion() {
        return tipoDeFuncion;
    }
}
