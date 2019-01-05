package com.FlorentL00.Paris;

import com.FlorentL00.Paris.Bus;
import com.FlorentL00.Paris.Parisien;
import com.FlorentL00.Paris.Taxi;

public class Main {
    public static void main(String[] args) {
        Parisien florent = new Parisien();

        Bus theBus = new Bus();
        florent.seDeplacer(theBus);

        Taxi theTaxi = new Taxi();
        florent.seDeplacer(theTaxi);

        MoyenDeLocomotion taxi2 = new Taxi();
        florent.seDeplacer(taxi2);

    }
}
