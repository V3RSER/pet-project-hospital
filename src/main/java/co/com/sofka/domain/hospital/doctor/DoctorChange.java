package co.com.sofka.domain.hospital.doctor;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.hospital.doctor.event.DoctorCreado;
import co.com.sofka.domain.hospital.doctor.event.EnfermeroAsignado;
import co.com.sofka.domain.hospital.doctor.event.FuncionCreada;
import co.com.sofka.domain.hospital.doctor.event.TipoDeFuncionActualizada;

import java.util.ArrayList;

public class DoctorChange extends EventChange {
    public DoctorChange(Doctor doctor) {
        apply((DoctorCreado event) -> {
            doctor.nombre = event.getNombre();
            doctor.enfermeros = new ArrayList<>();
        });

        apply((EnfermeroAsignado event) -> {
            doctor.enfermeros.add(new Enfermero(event.getIdEnfermero(), event.getNombre()));
        });

        apply((FuncionCreada event) -> {
            doctor.funcion = new Funcion(event.getIdFuncion(), event.getTipoDeFuncion());
        });

        apply((NombreEnfermeroActualizado event) -> {
            doctor.enfermeros.stream()
                    .filter(enfermero -> enfermero.identity().value().equals(event.getIdEnfermero().value()))
                    .forEach(enfermero -> enfermero.actualizarNombre(event.getNombre())
                    );
        });

        apply((TipoDeFuncionActualizada event) -> {
            doctor.funcion.actualizarTipoDeFuncion(event.getTipoDeFuncion());
        });
    }
}
