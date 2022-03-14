package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.hospital.paciente.event.*;

import java.util.ArrayList;

public class PacienteChange extends EventChange {
    public PacienteChange(Paciente paciente) {
        apply((PacienteCreado event) -> {
            paciente.nombre = event.getNombre();
            paciente.citas = new ArrayList<>();
        });

        apply((AfiliacionCreada event) -> {
            paciente.afiliacion = new Afiliacion(event.getIdAfiliacion(), event.getCaracteristicasAfiliacion());
        });

        apply((CaracteristicasdeAfiliacionActualizadas event) -> {
            paciente.afiliacion.actualizarCaracteristicasDeAfiliacion(event.getCaracteristicasAfiliacion());
        });

        apply((CitaAtendida event) -> {
            paciente.citas.add(new Cita(event.getIdCita(), event.getFecha()));
        });

        apply((FechaCitaActualizada event) -> {
            paciente.citas.stream()
                    .filter(cita -> cita.identity().value().equals(event.getIdCita().value()))
                    .forEach(cita -> cita.actualizarFecha(event.getFecha())
                    );
        });

        apply((SintomasObtenidos event) -> {
            paciente.sintomas = event.getSintomas();
        });

        apply((SintomasActualizados event) -> {
            paciente.sintomas = event.getSintomas();
        });
    }
}