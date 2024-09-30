package com.example.BackupService.domain.cumpon;

import com.example.BackupService.domain.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity(name = "TB_Coupons")
@Table(name = "TB_Coupons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer discount;
    private String code;
    private Date valid;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;


}
