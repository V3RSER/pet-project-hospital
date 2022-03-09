package co.com.sofka.domain.hospital.paciente.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CaracteristicasAfiliacion implements ValueObject<CaracteristicasAfiliacion.Props> {
    private final String tipoAfiliacion;
    private final String cobertura;

    public CaracteristicasAfiliacion(String tipoAfiliacion, String cobertura) {
        this.tipoAfiliacion = Objects.requireNonNull(tipoAfiliacion);
        this.cobertura = Objects.requireNonNull(cobertura);

        if (this.tipoAfiliacion.isBlank()) {
            throw new IllegalArgumentException("El tipo de afiliación no puede estar vacío");
        }

        if (this.cobertura.isBlank()) {
            throw new IllegalArgumentException("La cobertura no puede estar vacía");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoAfiliacion() {
                return tipoAfiliacion;
            }

            @Override
            public String cobertura() {
                return cobertura;
            }
        };
    }

    public interface Props {
        String tipoAfiliacion();

        String cobertura();
    }
}
