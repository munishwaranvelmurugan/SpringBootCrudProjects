package com.example.Resume.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiesImplement implements FileServies {

	@Override
	public String FileUploader(String path, MultipartFile file) throws IOException {
		

		String name = file.getOriginalFilename();
		
		String randomId = UUID.randomUUID().toString();
		String FileName1 = randomId + name.substring(name.lastIndexOf("."));

		String filePath=path+File.separator+FileName1;
//		System.out.println("D:\\Spring Boot\\Holidays\\demo-1\\images\\"+name);

		
		
		File f=new File(path);
		if(!f.exists())
		{
			f.mkdir();
System.out.println("Created");
		}
//		file copy
//		file.transferTo(f);
		Files.copy(
				file.getInputStream(), Paths.get(filePath));
		
//		System.out.println(file.getInputStream());
//		System.out.println(filePath);
//		System.out.println(name);
		
		
		return name;
	}
	
	

}
