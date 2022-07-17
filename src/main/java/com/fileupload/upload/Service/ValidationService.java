package com.fileupload.upload.Service;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class ValidationService {
    private final static String FILE_PATTERN = "([^\\\\s]+(\\\\.(?i)(jpe?g|png|bmp|pdf|txt))$)";
    private final static Pattern pattern = Pattern.compile(FILE_PATTERN);

    public boolean isValidFile(String filename) {
        return pattern.matcher(filename).matches();
    }
}
