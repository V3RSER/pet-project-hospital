package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.paciente.event.*;
import co.com.sofka.domain.hospital.paciente.valor.*;

import java.util.Map;

public class Paciente extends AggregateEvent<IdPaciente> {
    protected Sintomas sintomas;
    protected Nombre nombre;
    protected Map<String, Cita> citas;
    protected Afiliacion afiliacion;

    public Paciente(IdPaciente idPaciente, Nombre nombre) {
        super(idPaciente);
        appendChange(new PacienteCreado(nombre)).apply();
    }
    public void crearafiliacion(IdAfiliacion idAfiliacion, CaracteristicasAfiliacion caracteristicasAfiliacion){
        appendChange(new AfiliacionCreada(idAfiliacion,caracteristicasAfiliacion)).apply();
    }

    public void actualizarCaracteristicasDeAfiliacion(CaracteristicasAfiliacion caracteristicasAfiliacion){
        appendChange(new CaracteristicasdeAfiliacionActualizadas(caracteristicasAfiliacion)).apply();
    }
    public void atenderCita(IdCita idCita, Fecha fecha){
        appendChange(new CitaAtendida(idCita,fecha)).apply();
    }

    public void actualizarFechaCita(Fecha fecha){
        appendChange(new FechaCitaActualizada(fecha)).apply();
    }

    public void actualizarSintomas(Sintomas sintomas){
        appendChange(new SintomasActualizados(sintomas)).apply();
    }

    public void obtenerSintomas(Sintomas sintomas){
        appendChange(new SintomasObtenidos(sintomas)).apply();
    }



    public Map<String, Cita> citas() {
        return citas;
    }
}