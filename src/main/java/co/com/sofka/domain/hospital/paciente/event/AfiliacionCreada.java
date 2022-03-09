package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.IdAfiliacion;

public class AfiliacionCreada extends DomainEvent {
    private final CaracteristicasAfiliacion caracteristicasAfiliacion;
    private final IdAfiliacion idAfiliacion;

    public AfiliacionCreada(IdAfiliacion idAfiliacion,CaracteristicasAfiliacion caracteristicasAfiliacion){
        super("paciente.afiliacioncreada");
        this.caracteristicasAfiliacion = caracteristicasAfiliacion;
        this.idAfiliacion=idAfiliacion;
    }

    public CaracteristicasAfiliacion getCaracteristicasAfiliacion() {
        return caracteristicasAfiliacion;
    }
}
