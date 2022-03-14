package co.com.sofka.domain.hospital.paciente.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;

public class CaracteristicasdeAfiliacionActualizadas extends DomainEvent {
    private final CaracteristicasAfiliacion caracteristicasAfiliacion;

    public CaracteristicasdeAfiliacionActualizadas(CaracteristicasAfiliacion caracteristicasAfiliacion) {
        super("paciente.caracteristicaafiliacionactualizada");
        this.caracteristicasAfiliacion = caracteristicasAfiliacion;
    }

    public CaracteristicasAfiliacion getCaracteristicasAfiliacion() {
        return caracteristicasAfiliacion;
    }
}
