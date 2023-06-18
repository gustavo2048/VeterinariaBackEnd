package com.ohMyDog.OhMyDog.Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ohMyDog.OhMyDog.Service.StorageService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("media")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class MediaController {

	@Autowired
	StorageService fileService;
	
	@PostMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile multipartFile ){
		String path = fileService.store(multipartFile);
		String url = ServletUriComponentsBuilder.fromHttpUrl("http://localhost:8080").path("/media/").path(path).toUriString();
		return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("url",url , "path", path) ); 
	}
	
	@GetMapping("{filename}")
	public ResponseEntity<?> getFile(@PathVariable String filename){
		Resource file = fileService.loadAsResource(filename);
		try {
			String contentType = Files.probeContentType(file.getFile().toPath());
			return ResponseEntity.ok().header(HttpHeaders.CONTENT_TYPE, contentType).body(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  ResponseEntity.status(HttpStatus.CREATED).body("Error");
	}
}
