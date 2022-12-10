package com.shubh.awscloud.couponservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shubh.awscloud.couponservice.model.Coupon;

@Repository
public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
