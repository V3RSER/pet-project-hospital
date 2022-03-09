package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.paciente.valor.IdAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;

public class Afiliacion extends Entity<IdAfiliacion> {
    private CaracteristicasAfiliacion caracteristicas;

    public Afiliacion(IdAfiliacion idAfiliacion, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        super(idAfiliacion);
        this.caracteristicas = caracteristicasAfiliacion;
    }

    public CaracteristicasAfiliacion caracteristicasAfiliacion() {
        return caracteristicas;
    }
}
