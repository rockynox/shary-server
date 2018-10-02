package fr.hobbit.sharyserver.domain.posts;

import fr.hobbit.sharyserver.domain.AuditEntity;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Article extends AuditEntity {

    String link;
}
