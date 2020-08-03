package com.example.jpademo.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    @ManyToMany
    @JoinTable(name = "student_subject",
            joinColumns = {@JoinColumn(
                    name = "student_id",
                    referencedColumnName = "id")},

            inverseJoinColumns = {@JoinColumn(
                    name = "subject_id",
                    referencedColumnName = "id")}
    )
   @JsonIgnore
    private Set<Subject> subjects;

    @ManyToMany
    @JoinTable(name = "group_member",
            joinColumns = {@JoinColumn(
                    name = "student_id",
                    referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(
                    name = "group_id",
                    referencedColumnName = "id")}
    )
     @JsonIgnore
    private Set<Group> groups;
}
