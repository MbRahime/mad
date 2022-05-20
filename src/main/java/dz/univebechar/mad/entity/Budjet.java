package dz.univebechar.mad.entity;

import javax.persistence.*;

@Entity
public class Budjet {
    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private double credit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}