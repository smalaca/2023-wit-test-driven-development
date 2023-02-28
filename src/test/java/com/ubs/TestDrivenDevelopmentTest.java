package com.ubs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TestDrivenDevelopmentTest {
    @Test
    void shouldRecognizeThreePhaseOfTestDrivenDevelopment() {
        TestDrivenDevelopment tdd = new TestDrivenDevelopment();

        List<String> actual = tdd.phases();

        assertThat(actual).containsExactly("RED", "GREEN", "REFACTOR");
    }
}
