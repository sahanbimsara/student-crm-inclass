package edu.icet.ecom.model.dto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class StudentDTO {

    private long id;

    private String name;

    private String address;

    private int age;

    private String email;



}