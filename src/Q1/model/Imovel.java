package Q1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "imovel")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String endereco;

    @Column(name = "valor_aluguel_sugerido", nullable = false)
    private BigDecimal valorAluguelSugerido;

    @Column(nullable = false)
    private boolean disponivel = true;

    @Column(nullable = false)
    private boolean ativo = true;

    @OneToMany(mappedBy = "imovel", cascade = CascadeType.ALL)
    private List<Locacao> locacoes = new ArrayList<>();

}
