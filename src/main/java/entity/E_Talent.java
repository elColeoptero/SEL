package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_talent", schema = "sel_poo")
public class E_Talent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_TALENT")
    private int idTalent;
    @NonNull
    @Basic
    @Column(name = "ID_MEMBRE")
    private int idMembre;
    @NonNull
    @Basic
    @Column(name = "ID_COMPETENCE")
    private int idCompetence;
    @NonNull
    @Basic
    @Column(name = "DetailCompetence")
    private String detailCompetence;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Talent e_Talent = (E_Talent) o;
        return idTalent == e_Talent.idTalent && idMembre == e_Talent.idMembre && idCompetence == e_Talent.idCompetence && Objects.equals(detailCompetence, e_Talent.detailCompetence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTalent, idMembre, idCompetence, detailCompetence);
    }
}
