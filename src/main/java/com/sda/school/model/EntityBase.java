package com.sda.school.model;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class EntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", unique = true, updatable = false, nullable = false)
    private Long id;

    @Column (name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column (name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreateAt(Date createAt) {
        this.createdAt = createAt;
    }
    public Date getUpdateAt() {
        return updateAt;
    }

    @PreUpdate
    protected void preUpdate() {
        this.updateAt = new Date();
    }

    @PrePersist
    protected void prePersist(){
        this.createdAt = new Date();
    }

}
