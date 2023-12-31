package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class DemoApplicationTests {

    @Test
    void shouldCaptureInfoLog(CapturedOutput capturedOutput) {
        assertThat(capturedOutput.getOut()).contains("Hello info");
    }

    @Test
    void shouldCaptureErrorLog(CapturedOutput capturedOutput) {
        assertThat(capturedOutput.getOut()).contains("Hello error");
    }

    @Test
    void shouldCaptureDebugLog(CapturedOutput capturedOutput) {
        assertThat(capturedOutput.getOut()).contains("Hello debug");
    }
}
