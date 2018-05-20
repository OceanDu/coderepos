package com.ocean.coderepos.stormdrpc;


import backtype.storm.drpc.DRPCSpout;

public class BaseDRPCSpout extends DRPCSpout {

    public BaseDRPCSpout(String function) {
        super(function);
    }
}
