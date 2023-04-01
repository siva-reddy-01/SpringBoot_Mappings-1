package com.cdk.springdatajpa.entity;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name="employee_details")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;

    //address_add_Id
    // @OneToOne(cascade=CascadeType.ALL)
    //@JoinColumn(name="fk_add_id")

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_emp_id",referencedColumnName = "emp_id")
    private List<Address> address;

}
