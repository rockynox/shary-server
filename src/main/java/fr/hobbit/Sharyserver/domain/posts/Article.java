package fr.hobbit.Sharyserver.domain.posts;

import fr.hobbit.Sharyserver.domain.AuditEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Article extends AuditEntity {

    String link;
}
