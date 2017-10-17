package com.zhaiqianfeng.springdata.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Data
@Entity
public class User implements Serializable {
    @Id
    private int userId;
    private String name;
    private int age;
    private String addr;
}