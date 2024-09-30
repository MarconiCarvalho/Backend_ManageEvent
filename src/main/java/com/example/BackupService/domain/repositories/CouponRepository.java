package com.example.BackupService.domain.repositories;

import com.example.BackupService.domain.cumpon.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CouponRepository extends JpaRepository<Coupon, UUID> {
}
