package com.shubh.awscloud.couponservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shubh.awscloud.couponservice.model.Coupon;
import com.shubh.awscloud.couponservice.repos.CouponRepo;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController{


@Autowired 
CouponRepo couponRepo;

	@RequestMapping(value = "/coupons", method = RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon){

		return couponRepo.save(coupon);

	}

	@RequestMapping(value = "/coupons/{code}", method = RequestMethod.GET)
	public Coupon getCoupon(@PathVariable("code") String code) {
		return couponRepo.findByCode(code);

	}
}
