package com.tijolocwb.ecommerce.checkout.service;

import com.tijolocwb.ecommerce.checkout.entity.CheckoutEntity;
import com.tijolocwb.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
