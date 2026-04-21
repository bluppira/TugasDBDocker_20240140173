package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table (name = "NIM_20240140173")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String id;
    @Column (nullable = false)
    private String name;
    @Column (nullable = false, unique = true)
    private  String nim;
}
