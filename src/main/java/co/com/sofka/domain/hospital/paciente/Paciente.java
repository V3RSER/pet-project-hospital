package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.paciente.valor.Nombre;
import co.com.sofka.domain.hospital.paciente.valor.PacienteId;
import co.com.sofka.domain.hospital.paciente.valor.Sintomas;

import java.util.Map;

public class Paciente extends AggregateEvent<PacienteId> {
    protected Sintomas sintomas;
    protected Nombre nombre;
    protected Map<String, Cita> citas;
    protected Afiliacion afiliacion;

    public Paciente(PacienteId pacienteId) {
        super(pacienteId);
    }

    public Map<String, Cita> citas() {
        return citas;
    }
}