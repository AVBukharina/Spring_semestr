package ru.itis.springbootdemo.models;

import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;


@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class FileInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String storageFileName;
    private String originalFileName;
    private String type;
    private Long size;
    private String url;

}
