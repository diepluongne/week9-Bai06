package com.lab.files;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Nối segment đường dẫn theo cách đa nền tảng (thay cho chuỗi có dấu / hoặc \ cứng).
 */
public final class PathResolver {

    private PathResolver() {
    }

    public static String join(String first, String second) {
        Path path = Paths.get(first, second);
        return path.toString();
    }
}
