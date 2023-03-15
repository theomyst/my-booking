package com.theomyst.mybooking.controller;

import com.theomyst.mybooking.domain.Hotel;
import com.theomyst.mybooking.service.BaseService;
import com.theomyst.mybooking.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels")
public class HotelController extends AbstractController<Hotel> {

    private final HotelService hotelService;

    @Override
    protected BaseService<Hotel, Long> getBaseService() {
        return hotelService;
    }
}
