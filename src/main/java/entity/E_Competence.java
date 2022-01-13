package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "t_competence", schema = "sel_poo", catalog = "")
public class E_Competence {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_COMPETENCE")
    private int idCompetence;
    @NonNull
    @Basic
    @Column(name = "COMPETENCE")
    private String competence;
    @NonNull
    @ManyToOne
    @JoinColumn(name="ID_CATEGORIE")
    private E_Categorie categorie;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Competence that = (E_Competence) o;
        return idCompetence == that.idCompetence && Objects.equals(categorie,that.categorie) && Objects.equals(competence, that.competence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCompetence, competence, categorie);
    }
}
