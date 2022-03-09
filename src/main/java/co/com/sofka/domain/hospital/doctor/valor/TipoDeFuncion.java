package co.com.sofka.domain.hospital.doctor.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoDeFuncion implements ValueObject<TipoDeFuncion.Props> {
    private final String tipoFuncion;
    private final String caracteristicasFuncion;

    public TipoDeFuncion(String tipoAfiliacion, String cobertura) {
        this.tipoFuncion = Objects.requireNonNull(tipoAfiliacion);
        this.caracteristicasFuncion = Objects.requireNonNull(cobertura);
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