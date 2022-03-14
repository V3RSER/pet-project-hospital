package co.com.sofka.domain.hospital.atencionmedica;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.domain.hospital.atencionmedica.event.*;

public class AtencionMedicaChange extends EventChange {
    public AtencionMedicaChange(AtencionMedica atencionMedica) {
        apply((AtencionMedicaCreada event) -> {
            atencionMedica.idDoctor = event.getIdDoctor();
            atencionMedica.idPaciente = event.getIdPaciente();
        });

        apply((DiagnosticoRealizado event) -> {
            atencionMedica.diagnostico = new Diagnostico(event.getIdDiagnostico(), event.getFormulaMedica());
        });

        apply((FormulaMedicaActualizada event) -> {
            atencionMedica.diagnostico.actualizarFormulaMedica(event.getFormulaMedica());
        });

        apply((TratamientoGenerado event) -> {
            atencionMedica.tratamiento = new Tratamiento(event.getIdTratamiento(), event.getProcedimiento());
        });

        apply((ProcedimientoTratamientoActualizado event) -> {
            atencionMedica.tratamiento().actualizarProcedimiento(event.getProcedimiento());
        });

        apply((UrgenciaAtendida event) -> {
            atencionMedica.urgencia = event.getUrgencia();
        });
    }
}