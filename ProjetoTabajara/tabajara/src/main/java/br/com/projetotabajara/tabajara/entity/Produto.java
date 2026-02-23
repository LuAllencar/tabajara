package br.com.projetotabajara.tabajara.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import lombok.AllArgsConstructor;
import lombok.Data;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idProduto;

    @Column(nullable = false, length = 40)
    private String descricaoProduto;

    private Double valorProduto;

    @Column(nullable = false, length = 10)
    private String unidadeProduto;

    @Column(nullable = false, length = 30)
    private String marcaProduto;
}
