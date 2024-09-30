package com.example.BackupService.domain.event;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.DateTimeException;
import java.util.UUID;

@Entity(name = "TB_Event")
@Table(name = "TB_Event")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;

    private String description;

    private DateTimeException date;
    private Boolean remote;

    private String img_url;

    private String event_url;
}
