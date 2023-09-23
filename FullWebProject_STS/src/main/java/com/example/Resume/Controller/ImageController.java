package com.example.Resume.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.Resume.Service.FileServies;


@RestController
@RequestMapping("/file")
public class ImageController {

	@Autowired
	private FileServies fileServies;
//	@Value("${project.image}")
	private String path="images";
	
	@PostMapping("/upload")
	public ModelAndView fileUpload(
		@RequestParam("file")MultipartFile file,Model model){
			String fileName;
			try {
				fileName = fileServies.FileUploader( path,file );
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
//				return new ResponseEntity<>(new FileResponse(null,"Image is unsuccessfu lly uploaded!!"),
				return new ModelAndView("UploadImg","Status","Unsucess");	
			}
			
			model.addAttribute("Status","Image Is Uploaded Successfully");
//			return new ResponseEntity<>(new FileResponse(fileName,"Image is successfully uploaded!!"),
//					HttpStatus.OK);
			
			return new ModelAndView("UploadImg","Status","Sucess");
			 
	}
	
}
