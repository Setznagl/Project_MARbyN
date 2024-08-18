package com.javaacademy.ufn.marbyn.Model.SysUserModel;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
public class SysUser {

    public SysUser() {
        //Empty constructor
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonManagedReference
    @OneToMany(mappedBy = "fk_user" , fetch = FetchType.EAGER)
    private List<UserProfile> userProfiles;

    //////////////////////////////////////////////////////////////////////////////

    @Column( nullable = false , length = 30 )
    private String name;

    @Column( nullable = false /*, unique = true*/ , length = 50 )
    private String email;

    @Column( nullable = false , length = 20 )
    private String password;

}
