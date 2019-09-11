package com.space.service;

import com.space.controller.ShipOrder;
import com.space.model.Ship;
import com.space.model.ShipType;
import com.space.repository.ShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShipServiceImpl implements ShipService {

    private ShipRepo shipRepository;

    @Autowired
    public void setShipRepository(ShipRepo shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Override
    public Page<Ship> getAllShips(Specification<Ship> specification, Pageable sortedByName) {
        return shipRepository.findAll(specification, sortedByName);
    }

    @Override
    public List<Ship> getAllShips(Specification<Ship> specification) {
        return shipRepository.findAll(specification);
    }

    @Override
    public Ship createShip(Ship requestShip) {
        return null;
    }

    @Override
    public Ship getShip(Long id) {
        return null;
    }

    @Override
    public Ship editShip(Long id, Ship ship) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Long checkAndParseId(String id) {
        return null;
    }

    @Override
    public Specification<Ship> filterByPlanet(String planet) {
        return null;
    }

    @Override
    public Specification<Ship> filterByName(String name) {
        return null;
    }

    @Override
    public Specification<Ship> filterByShipType(ShipType shipType) {
        return null;
    }

    @Override
    public Specification<Ship> filterByDate(Long after, Long before) {
        return null;
    }

    @Override
    public Specification<Ship> filterByUsage(Boolean isUsed) {
        return null;
    }

    @Override
    public Specification<Ship> filterBySpeed(Double min, Double max) {
        return null;
    }

    @Override
    public Specification<Ship> filterByCrewSize(Integer min, Integer max) {
        return null;
    }

    @Override
    public Specification<Ship> filterByRating(Double min, Double max) {
        return null;
    }


}
