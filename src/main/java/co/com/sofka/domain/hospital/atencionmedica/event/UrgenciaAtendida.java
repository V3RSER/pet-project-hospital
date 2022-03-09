package co.com.sofka.domain.hospital.atencionmedica.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.hospital.atencionmedica.valor.Urgencia;

public class UrgenciaAtendida extends DomainEvent {
    private final Urgencia urgencia;
    public UrgenciaAtendida(Urgencia urgencia){
        super("atencionmedica.urgenciaatendida");
        this.urgencia=urgencia;
    }

    public Urgencia getUrgencia() {
        return urgencia;
    }
}
