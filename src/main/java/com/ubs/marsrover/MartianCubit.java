package com.ubs.marsrover;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
class MartianCubit {
    private final int xAxis;
    private final int yAxis;

    MartianCubit(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }
}
