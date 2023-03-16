package com.theomyst.mybooking.backend.service;

import com.theomyst.mybooking.backend.domain.Hotel;
import com.theomyst.mybooking.backend.repository.HotelRepository;
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
