package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.IdAtencionMedica;
import co.com.sofka.domain.hospital.atencionmedica.valor.Urgencia;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;

import java.util.List;

public class AtencionMedica extends AggregateEvent<IdAtencionMedica> {
    protected List<Urgencia> urgencias;
    protected Diagnostico diagnostico;
    protected Tratamiento tratamiento;
    protected IdPaciente idPaciente;
    protected IdDoctor idDoctor;

    public AtencionMedica(IdAtencionMedica idAtencionMedica) {
        super(idAtencionMedica);
    }

    public List<Urgencia> urgencias() {
        return urgencias;
    }
}