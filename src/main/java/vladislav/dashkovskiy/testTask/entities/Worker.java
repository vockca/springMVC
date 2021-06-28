package vladislav.dashkovskiy.testTask.entities;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "workers")
public class Worker { // annotation pattern
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public String name;

    public int age;

    public String skills;

    public boolean isBusy;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    public Organization organization;

    public String project;

    public void setIsBusy(boolean busy) {
        isBusy = busy;
    }

    public boolean getIsBusy() {
        return isBusy;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
