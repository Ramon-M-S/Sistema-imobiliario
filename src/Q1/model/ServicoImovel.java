package Q1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "servico_imovel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicoImovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "locacao_id", nullable = false)
    private Locacao locacao;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;

    @Column(nullable = false)
    private String descricao;

    @Column(name = "data_servico", nullable = false)
    private LocalDate dataServico;

    @Column(nullable = false)
    private BigDecimal custo;
}
