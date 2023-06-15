package com.ubs.marsrover;

class MarsRover {
    private MartianCubit martianCubit;

    void land() {
        martianCubit = new MartianCubit(0, 0);
    }

    MartianCubit position() {
        return martianCubit;
    }

    void move(String f) {
        martianCubit = new MartianCubit(1, 0);
    }
}
