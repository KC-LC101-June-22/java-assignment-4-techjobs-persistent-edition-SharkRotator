package org.launchcode.techjobs.persistent.models;

import org.thymeleaf.expression.Lists;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn (name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @Size(max = 50,message = "Name must be less than 50 characters")
    @NotBlank(message = "Location required.")
    private String location;



    //public Employer(String location) {
     //    this.location = location;
    // }

    public Employer(){}
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
