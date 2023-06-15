package com.ubs.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    // only one move F R L
    // ignored characters

    @Test
    void shouldLandInInitialMartianCubit() {
        // given
        MarsRover marsRover = new MarsRover();

        // when
        marsRover.land();

        // then
        Assertions.assertThat(marsRover.position()).isEqualTo(new MartianCubit(0, 0));
    }

    @Test
    void shouldMoveForward() {
        MarsRover marsRover = new MarsRover();
        marsRover.land();

        marsRover.move("F");

        Assertions.assertThat(marsRover.position()).isEqualTo(new MartianCubit(1, 0));
    }
}
