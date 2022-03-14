package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.event.DoctorCreado;
import co.com.sofka.domain.hospital.doctor.event.EnfermeroAsignado;
import co.com.sofka.domain.hospital.doctor.event.FuncionCreada;
import co.com.sofka.domain.hospital.doctor.event.TipoDeFuncionActualizada;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.doctor.valor.IdEnfermero;
import co.com.sofka.domain.hospital.doctor.valor.IdFuncion;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;
import co.com.sofka.domain.hospital.valor.Nombre;

import java.util.List;

public class Doctor extends AggregateEvent<IdDoctor> {
    protected Nombre nombre;
    protected Funcion funcion;
    protected List<Enfermero> enfermeros;

    public Doctor(IdDoctor idDoctor, Nombre nombre) {
        super(idDoctor);
        appendChange(new DoctorCreado(nombre)).apply();
        subscribe(new DoctorChange(this));
    }

    public Doctor(IdDoctor idDoctor) {
        super(idDoctor);
        subscribe(new DoctorChange(this));
    }

    public static Doctor from(IdDoctor idDoctor, List<DomainEvent> retrieveEvents) {
        var doctor = new Doctor(idDoctor);
        retrieveEvents.forEach(doctor::applyEvent);
        return doctor;
    }

    public void asignarEnfermero(IdEnfermero entityId, Nombre nombre) {
        appendChange(new EnfermeroAsignado(entityId, nombre)).apply();
    }

    public void crearFuncion(IdFuncion entityId, TipoDeFuncion tipoDeFuncion) {
        appendChange(new FuncionCreada(entityId, tipoDeFuncion)).apply();
    }

    public void actualizarNombreEnfermero(IdEnfermero idEnfermero, Nombre nombre) {
        appendChange(new NombreEnfermeroActualizado(idEnfermero, nombre)).apply();
    }

    public void actualizarTipoDeFuncion(TipoDeFuncion tipoDeFuncion) {
        appendChange(new TipoDeFuncionActualizada(tipoDeFuncion)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Funcion funcion() {
        return funcion;
    }

    public List<Enfermero> enfermeros() {
        return enfermeros;
    }
}
