package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_categorie", schema = "sel_poo")
public class E_Categorie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_CATEGORIE")
    private int idCategorie;
    @NonNull
    @Basic
    @Column(name = "CATEGORIE")
    private String categorie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Categorie that = (E_Categorie) o;
        return idCategorie == that.idCategorie && Objects.equals(categorie, that.categorie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategorie, categorie);
    }


}
