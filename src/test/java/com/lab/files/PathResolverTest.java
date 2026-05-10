package com.lab.files;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class PathResolverTest {

    @Test
    void joinUsesPlatformSeparator() {
        String expected = Paths.get("data", "report.txt").toString();
        assertTrue(PathResolver.join("data", "report.txt").equals(expected));
    }
}
