package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_membre", schema = "sel_poo", catalog = "")
public class E_Membre {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID_MEMBRE")
    private int idMembre;
    @NonNull
    @Basic
    @Column(name = "NOM_MEMBRE")
    private String nomMembre;
    @NonNull
    @Basic
    @Column(name = "PRENOM_MEMBRE")
    private String prenomMembre;
    @NonNull
    @Basic
    @Column(name = "MAIL_MEMBRE")
    private String mailMembre;
    @NonNull
    @Basic
    @Column(name = "STATUT")
    private String statut;
    @NonNull
    @Basic
    @Column(name = "SOLDE_HEURE")
    private int soldeHeure;
    @NonNull
    @Basic
    @Column(name = "SOLDE_ECU")
    private int soldeEcu;
    @NonNull
    @Basic
    @Column(name = "TYPE_MEMBRE")
    private String typeMembre;
    @NonNull
    @Basic
    @Column(name = "HABITANT")
    private Integer habitant;
    @NonNull
    @Basic
    @Column(name = "RAISON_SOCIALE")
    private String raisonSociale;
    @NonNull
    @Basic
    @Column(name = "CLIENT_COMPTE_ECU")
    private int clientCompteEcu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        E_Membre e_tMembre = (E_Membre) o;
        return idMembre == e_tMembre.idMembre && soldeHeure == e_tMembre.soldeHeure && soldeEcu == e_tMembre.soldeEcu && clientCompteEcu == e_tMembre.clientCompteEcu && Objects.equals(nomMembre, e_tMembre.nomMembre) && Objects.equals(prenomMembre, e_tMembre.prenomMembre) && Objects.equals(mailMembre, e_tMembre.mailMembre) && Objects.equals(statut, e_tMembre.statut) && Objects.equals(typeMembre, e_tMembre.typeMembre) && Objects.equals(habitant, e_tMembre.habitant) && Objects.equals(raisonSociale, e_tMembre.raisonSociale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMembre, nomMembre, prenomMembre, mailMembre, statut, soldeHeure, soldeEcu, typeMembre, habitant, raisonSociale, clientCompteEcu);
    }
}
