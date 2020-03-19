package com.example.myamazon.models;

import com.example.myamazon.enumType.JobRole;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contributor")
public class Contributor extends BaseEntity {

    @Column
    private JobRole jobRole;

    public JobRole getJobRole() {
        return jobRole;
    }

    public void setJobRole(JobRole jobRole) {
        this.jobRole = jobRole;
    }
}
