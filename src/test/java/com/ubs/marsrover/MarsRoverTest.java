package com.ubs.marsrover;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
    // only one move FRL
    // ignored characters

    @Test
    void shouldLandInInitialMartianCubit() {
        // given
        MarsRover marsRover = new MarsRover();

        // when
        MartianCubit actual = marsRover.land();

        // then
        Assertions.assertThat(actual).isEqualTo(new MartianCubit(0, 0));
    }
}
