package co.com.sofka.domain.hospital.atencionmedica.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.doctor.valor.IdDoctor;
import co.com.sofka.domain.hospital.paciente.valor.IdPaciente;

public class AtencionMedicaCreada extends DomainEvent {
    private final IdPaciente idPaciente;
    private final IdDoctor idDoctor;

    public AtencionMedicaCreada(IdPaciente idPaciente, IdDoctor idDoctor) {
        super("atencionmedica.atencionmedicacreada");
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
    }

    public IdPaciente getIdPaciente() {
        return idPaciente;
    }

    public IdDoctor getIdDoctor() {
        return idDoctor;
    }
}
