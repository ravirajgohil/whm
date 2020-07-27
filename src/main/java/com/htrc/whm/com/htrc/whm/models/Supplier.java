package com.htrc.whm.com.htrc.whm.models;

import lombok.*;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
public class Supplier {
//    @Id
    private int id;
    private String name;
    private String city;
}
