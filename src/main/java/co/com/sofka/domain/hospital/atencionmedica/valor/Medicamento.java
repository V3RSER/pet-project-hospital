package co.com.sofka.domain.hospital.atencionmedica.valor;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Medicamento implements ValueObject<Medicamento.Props> {
    private final String nombre;
    private final Double dosisGramos;
    private final Double intervaloHora;

    public Medicamento(String nombre, Double dosisGramos, Double intervaloHora) {
        this.nombre = Objects.requireNonNull(nombre);
        this.dosisGramos = Objects.requireNonNull(dosisGramos);
        this.intervaloHora = Objects.requireNonNull(intervaloHora);

        if (this.nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        if (this.dosisGramos <= 0) {
            throw new IllegalArgumentException("Debes ingresar una dosis en gramos válida");
        }

        if (this.intervaloHora <= 0) {
            throw new IllegalArgumentException("Debes ingresar un intervalo en hora válido");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public Double dosisGramos() {
                return dosisGramos;
            }

            @Override
            public Double intervaloHora() {
                return intervaloHora;
            }
        };
    }

    public interface Props {
        String nombre();

        Double dosisGramos();

        Double intervaloHora();
    }
}
