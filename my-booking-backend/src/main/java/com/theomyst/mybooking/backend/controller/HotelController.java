package com.theomyst.mybooking.backend.controller;

import com.theomyst.mybooking.backend.domain.Hotel;
import com.theomyst.mybooking.backend.service.BaseService;
import com.theomyst.mybooking.backend.service.HotelService;
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
