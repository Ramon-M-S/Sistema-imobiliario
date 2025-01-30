package Q1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "aluguel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locacao_id", nullable = false)
    private Locacao locacao;

    @Column(name = "data_vencimento", nullable = false)
    private LocalDate dataVencimento;

    @Column(name = "data_pagamento")
    private LocalDate dataPagamento;

    @Column(name = "valor_pago", nullable = false)
    private BigDecimal valorPago;

    @Column(name = "multa")
    private BigDecimal multa;
}
