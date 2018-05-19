package com.ocean.coderepos.stormdrpc;

import org.apache.storm.ILocalDRPC;
import org.apache.storm.drpc.DRPCSpout;

public class BaseDRPCSpout extends DRPCSpout {
    public BaseDRPCSpout(String function) {
        super(function);
    }

    public BaseDRPCSpout(String function, ILocalDRPC drpc) {
        super(function, drpc);
    }
}
