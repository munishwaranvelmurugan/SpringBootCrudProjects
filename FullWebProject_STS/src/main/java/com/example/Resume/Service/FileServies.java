package com.example.Resume.Service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileServies {
String FileUploader(String path,MultipartFile file) throws IOException;
}
