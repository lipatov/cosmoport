package com.space.controller;

import com.space.repository.ShipRepo;
import com.space.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShipController {

    @Autowired
    private ShipRepo shipRepository;

    @Autowired
    private ShipService shipService;
}
