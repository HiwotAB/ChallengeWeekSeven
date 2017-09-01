package com.hiwotab.roboresumeapplication.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class EduAchievements {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    @Size(min=2,max=100)
    private String eduType;

    @NotEmpty
    @Size(min=2,max=50)
    private String uniName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy")
    private Date grdYear;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="resume_id")
    private Resume resume;


    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEduType() {return eduType;   }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public Date getGrdYear() {
        return grdYear;
    }

    public void setGrdYear(Date grdYear) {
        this.grdYear = grdYear;
    }

}
