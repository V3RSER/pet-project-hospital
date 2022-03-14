package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.event.*;
import co.com.sofka.domain.hospital.paciente.valor.*;
import co.com.sofka.domain.hospital.valor.Nombre;

import java.util.List;

public class Paciente extends AggregateEvent<IdPaciente> {
    protected Sintomas sintomas;
    protected Nombre nombre;
    protected List<Cita> citas;
    protected Afiliacion afiliacion;

    public Paciente(IdPaciente idPaciente, Nombre nombre) {
        super(idPaciente);
        appendChange(new PacienteCreado(nombre)).apply();
        subscribe(new PacienteChange(this));
    }

    public Paciente(IdPaciente idPaciente) {
        super(idPaciente);
        subscribe(new PacienteChange(this));
    }

    public static Paciente from(IdPaciente idPaciente, List<DomainEvent> retrieveEvents) {
        var paciente = new Paciente(idPaciente);
        retrieveEvents.forEach(paciente::applyEvent);
        return paciente;
    }

    public void crearAfiliacion(IdAfiliacion idAfiliacion, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        appendChange(new AfiliacionCreada(idAfiliacion, caracteristicasAfiliacion)).apply();
    }

    public void actualizarCaracteristicasDeAfiliacion(CaracteristicasAfiliacion caracteristicasAfiliacion) {
        appendChange(new CaracteristicasdeAfiliacionActualizadas(caracteristicasAfiliacion)).apply();
    }

    public void atenderCita(IdCita idCita, Fecha fecha) {
        appendChange(new CitaAtendida(idCita, fecha)).apply();
    }

    public void actualizarFechaCita(IdCita idCita, Fecha fecha) {
        appendChange(new FechaCitaActualizada(idCita, fecha)).apply();
    }

    public void obtenerSintomas(Sintomas sintomas) {
        appendChange(new SintomasObtenidos(sintomas)).apply();
    }

    public void actualizarSintomas(Sintomas sintomas) {
        appendChange(new SintomasActualizados(sintomas)).apply();
    }

    public List<Cita> citas() {
        return citas;
    }
}