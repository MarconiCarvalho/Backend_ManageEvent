package com.example.BackupService.domain.address;

import com.example.BackupService.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "TB_Address")
@Table(name = "TB_Address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Serializable {

    private  final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID  id;
    private String uf;
    private String city;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
