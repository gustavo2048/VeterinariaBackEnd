package com.ohMyDog.OhMyDog.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	
	void init() throws IOException;
	public String store(MultipartFile file);
	public Resource loadAsResource(String filename);
	public void deleteAll();
	public Stream<Path> loadAll();
	public String deleteFile(String filename);
}
