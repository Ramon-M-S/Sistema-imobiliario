package Q1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "locacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "imovel_id", nullable = false)
    private Imovel imovel;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente inquilino;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_termino", nullable = false)
    private LocalDate dataTermino;

    @Column(name = "valor_aluguel", nullable = false)
    private BigDecimal valorAluguel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusLocacao status = StatusLocacao.ATIVA;

    @OneToMany(mappedBy = "locacao", cascade = CascadeType.ALL)
    private List<Aluguel> alugueis = new ArrayList<>();

    @OneToMany(mappedBy = "locacao", cascade = CascadeType.ALL)
    private List<ServicoImovel> servicos = new ArrayList<>();
}
