package com.fileupload.upload.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/")
public class FileUploadController {

    @RequestMapping(RequestMethod.POST, "/upload")
    String uploadFile(@RequestBody("file") MultipartFile file) {

    }
}
