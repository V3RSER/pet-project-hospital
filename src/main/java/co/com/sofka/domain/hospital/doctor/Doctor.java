package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.doctor.event.*;
import co.com.sofka.domain.hospital.doctor.valor.*;

import java.util.Set;

public class Doctor extends AggregateEvent<IdDoctor> {
    protected Nombre nombre;
    protected Funcion funcion;
    protected Set<Enfermero> enfermeros;

    public Doctor(IdDoctor entityId, Nombre nombre) {
        super(entityId);
        appendChange(new DoctorCreado(nombre)).apply();
    }
    public void asignarEnfermero(IdEnfermero entityId, Nombre nombre){
        appendChange(new EnfermeroAsignado(entityId,nombre)).apply();
    }
    public void crearFuncion(IdFuncion entityId, TipoDeFuncion tipoDeFuncion){
        appendChange(new FuncionCreada(entityId,tipoDeFuncion)).apply();
    }
    public void actualizarNombreEnfermero(Nombre nombre){
        appendChange(new NombreEnfermeroActualizado(nombre)).apply();
    }
    public void actualizarTipoDeFuncion(TipoDeFuncion tipoDeFuncion){
        appendChange(new TipoDeFuncionActualizada(tipoDeFuncion)).apply();
    }
    public void crearTipoDeFuncion(TipoDeFuncion tipoDeFuncion){
        appendChange(new TipoDeFuncionCreada(tipoDeFuncion)).apply();
    }
}
