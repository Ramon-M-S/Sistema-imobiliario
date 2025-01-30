package Q1.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "profissional")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String registro;

    @OneToMany(mappedBy = "profissional", cascade = CascadeType.ALL)
    private List<ServicoImovel> servicos = new ArrayList<>();
}
