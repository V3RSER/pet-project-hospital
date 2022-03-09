package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.doctor.valor.IdFuncion;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;

import java.util.Objects;

public class Funcion extends Entity<IdFuncion> {
    private TipoDeFuncion tipoDeFuncion;

    public Funcion(IdFuncion entityId, TipoDeFuncion tipoDeFuncion) {
        super(entityId);
        this.tipoDeFuncion=tipoDeFuncion;
    }

    public void crearTipoDeFuncion(TipoDeFuncion tipoDeFuncion){
        this.tipoDeFuncion = tipoDeFuncion;
    }

    public void actualizarTipoDeFuncion(TipoDeFuncion tipoDeFuncion){
        this.tipoDeFuncion = Objects.requireNonNull(tipoDeFuncion);
    }

    public TipoDeFuncion tipoDeFuncion() {
        return tipoDeFuncion;
    }
}
