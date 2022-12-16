package com.skypro.polimorfizm.support;

import com.skypro.polimorfizm.transport.Cars;
import com.skypro.polimorfizm.transport.Transport;
import com.skypro.polimorfizm.transport.Trucks;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

    private final Queue<Transport> transports = new ArrayDeque<>();

    private void add (Transport transport){
        transports.offer(transport);
    }

    public void addCars (Cars cars){
        addCars(cars);
    }

    public void addTrucks (Trucks trucks){
        addTrucks(trucks);
    }

    public void service(){
        if (!transports.isEmpty()){
            Transport transport = transports.poll();
            boolean result = transport.service();
            if (!result){
                transport.fixCar();
            }
        }
    }
}
