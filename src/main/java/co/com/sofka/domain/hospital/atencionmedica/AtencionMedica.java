package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.atencionmedica.event.*;
import co.com.sofka.domain.hospital.atencionmedica.valor.*;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class AtencionMedica extends AggregateEvent<IdAtencionMedica> {
    protected Urgencia urgencia;
    protected Diagnostico diagnostico;
    protected Tratamiento tratamiento;
    protected IdPaciente idPaciente;
    protected IdDoctor idDoctor;

    public AtencionMedica(IdAtencionMedica idAtencionMedica, IdDoctor idDoctor, IdPaciente idPaciente) {
        super(idAtencionMedica);
        appendChange(new AtencionMedicaCreada(idPaciente, idDoctor)).apply();
    }

    public void realizarDiagnostico(IdDiagnostico idDiagnostico, FormulaMedica formulaMedica) {
        appendChange(new DiagnosticoRealizado(idDiagnostico, formulaMedica)).apply();
    }

    public void actualizarFormulaMedica(FormulaMedica formulaMedica) {
        appendChange(new FormulaMedicaActualizada(formulaMedica)).apply();
    }

    public void generarTratamiento(IdTratamiento idTratamiento, Procedimiento procedimiento) {
        appendChange(new TratamientoGenerado(idTratamiento, procedimiento)).apply();
    }

    public void actualizarProcedimientoTratamiento(Procedimiento procedimiento) {
        appendChange(new ProcedimientoTratamientoActualizado(procedimiento)).apply();
    }

    public void atenderUrgencia(Urgencia urgencia) {
        appendChange(new UrgenciaAtendida(urgencia)).apply();
    }

    public Urgencia urgencia() {
        return urgencia;
    }

    public Diagnostico diagnostico() {
        return diagnostico;
    }

    public Tratamiento tratamiento() {
        return tratamiento;
    }

    public IdPaciente idPaciente() {
        return idPaciente;
    }

    public IdDoctor idDoctor() {
        return idDoctor;
    }
}