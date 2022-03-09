package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeFuncion implements ValueObject<TipoDeFuncion.Props> {
    private final String tipoFuncion;
    private final String caracteristicasFuncion;

    public TipoDeFuncion(String tipoFuncion, String caracteristicasFuncion) {
        this.tipoFuncion = Objects.requireNonNull(tipoFuncion);
        this.caracteristicasFuncion = Objects.requireNonNull(caracteristicasFuncion);

        if (this.tipoFuncion.isBlank()) {
            throw new IllegalArgumentException("El tipo de función no puede estar vacío");
        }

        if (this.caracteristicasFuncion.isBlank()) {
            throw new IllegalArgumentException("Las características de la función no puede estar vacías");
        }

        if (this.caracteristicasFuncion.length() <= 10) {
            throw new IllegalArgumentException("Las características no puede ser tan cortas");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String tipoFuncion() {
                return tipoFuncion;
            }

            @Override
            public String caracteristicasFuncion() {
                return caracteristicasFuncion;
            }
        };
    }

    public interface Props {
        String tipoFuncion();

        String caracteristicasFuncion();
    }
}