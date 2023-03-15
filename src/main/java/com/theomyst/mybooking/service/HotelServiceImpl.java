package com.theomyst.mybooking.service;

import com.theomyst.mybooking.domain.Hotel;
import com.theomyst.mybooking.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl extends BaseServiceImpl<Hotel> implements HotelService {

    private final HotelRepository hotelRepository;

    @Override
    public JpaRepository<Hotel, Long> getRepository() {
        return hotelRepository;
    }
}
