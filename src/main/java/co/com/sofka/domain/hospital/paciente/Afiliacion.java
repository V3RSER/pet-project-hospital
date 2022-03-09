package co.com.sofka.domain.hospital.paciente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.hospital.doctor.valor.TipoDeFuncion;
import co.com.sofka.domain.hospital.paciente.valor.IdAfiliacion;
import co.com.sofka.domain.hospital.paciente.valor.CaracteristicasAfiliacion;

import java.util.Objects;

public class Afiliacion extends Entity<IdAfiliacion> {
    private CaracteristicasAfiliacion caracteristicasAfiliacion;

    public Afiliacion(IdAfiliacion idAfiliacion, CaracteristicasAfiliacion caracteristicasAfiliacion) {
        super(idAfiliacion);
        this.caracteristicasAfiliacion = caracteristicasAfiliacion;
    }

    public CaracteristicasAfiliacion caracteristicasAfiliacion() {
        return caracteristicasAfiliacion;
    }

    public void actualizarCaracteristicasDeAfiliacion(CaracteristicasAfiliacion caracteristicasAfiliacion){
        this.caracteristicasAfiliacion = Objects.requireNonNull(caracteristicasAfiliacion);
    }
}
