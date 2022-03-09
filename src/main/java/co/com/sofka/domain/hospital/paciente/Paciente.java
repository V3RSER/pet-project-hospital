package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.paciente.valor.Nombre;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;
import co.com.sofka.domain.hospital.paciente.valor.Sintomas;

import java.util.Map;

public class Paciente extends AggregateEvent<IdPaciente> {
    protected Sintomas sintomas;
    protected Nombre nombre;
    protected Map<String, Cita> citas;
    protected Afiliacion afiliacion;

    public Paciente(IdPaciente idPaciente) {
        super(idPaciente);
    }

    public Map<String, Cita> citas() {
        return citas;
    }
}