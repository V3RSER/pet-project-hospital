package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.AtencionMedicaId;
import co.com.sofka.domain.hospital.atencionmedica.valor.Urgencia;
import co.com.sofka.domain.hospital.paciente.valor.PacienteId;

import java.util.List;

public class AtencionMedica extends AggregateEvent<AtencionMedicaId> {
    protected List<Urgencia> urgencias;
    protected Diagnostico diagnostico;
    protected Tratamiento tratamiento;
    protected PacienteId pacienteId;
    protected DoctorId doctorId;

    public AtencionMedica(AtencionMedicaId atencionMedicaId) {
        super(atencionMedicaId);
    }

    public List<Urgencia> urgencias() {
        return urgencias;
    }
}