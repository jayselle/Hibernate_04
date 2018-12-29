package entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue("contratado")
public class Contratado extends Empleado{

    @Column(name = "pago_por_hora")
    private float pago_por_hora;

    @Column(name = "periodo_contrato")
    private String periodo_contrato;

    public Contratado(String nombre, float pago_por_hora, String periodo_contrato) {
        super(nombre);
        this.pago_por_hora = pago_por_hora;
        this.periodo_contrato = periodo_contrato;
    }

    public float getPago_por_hora() {
        return pago_por_hora;
    }

    public void setPago_por_hora(float pago_por_hora) {
        this.pago_por_hora = pago_por_hora;
    }

    public String getPeriodo_contrato() {
        return periodo_contrato;
    }

    public void setPeriodo_contrato(String periodo_contrato) {
        this.periodo_contrato = periodo_contrato;
    }

    @Override
    public String toString() {
        return "Contratado{" +
                "pago_por_hora=" + pago_por_hora +
                ", periodo_contrato='" + periodo_contrato + '\'' +
                "} " + super.toString();
    }
}
