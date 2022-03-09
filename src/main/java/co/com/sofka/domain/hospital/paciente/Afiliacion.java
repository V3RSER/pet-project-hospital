package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.paciente.valor.AfiliacionId;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;

public class Afiliacion extends Entity<AfiliacionId> {
    private CaracteristicasAfiliacion caracteristicas;

    public Afiliacion(AfiliacionId afiliacionId, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        super(afiliacionId);
        this.caracteristicas = caracteristicasAfiliacion;
    }

    public CaracteristicasAfiliacion caracteristicasAfiliacion() {
        return caracteristicas;
    }
}
