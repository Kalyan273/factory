package com.factory.appraisal.vehiclesearchapp.persistence.model;

import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance
public class IdEntity {



  /* @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "id")
    private Long id;*/


        private Boolean valid;

   /* public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

        public Boolean getValid() {
            return valid;
        }

        public void setValid(Boolean valid) {
            this.valid = valid;
        }
    }
