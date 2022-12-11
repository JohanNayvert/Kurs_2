package com.skypro.Polimorfizm.Support;

import com.skypro.Polimorfizm.Transport.Cars;
import com.skypro.Polimorfizm.Transport.Transport;
import com.skypro.Polimorfizm.Transport.Trucks;

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
