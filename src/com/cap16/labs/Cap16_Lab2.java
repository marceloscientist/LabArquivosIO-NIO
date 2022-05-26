package com.cap16.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {
	public static void main(String[] args) {
		String PASTA_ORIGEM = "C:\\Users\\Marcelo\\eclipse-workspace\\LabArquivosIO-NIO\\Mp3";
		String PASTA_BACKUP = "C:\\Users\\Marcelo\\eclipse-workspace\\LabArquivosIO-NIO\\BACKUP\\Mp3";
		
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_BACKUP);
		
		try {
			if(!Files.exists(backup)) {
				Files.createDirectories(backup);
			}
			
			try (Stream<Path> streamOrigem = Files.list(origem)) {
				streamOrigem.forEach(p -> {
					try {
						Files.copy(p, backup.resolve(p.getFileName()));
					} catch (IOException e) {
						System.out.println(e.getMessage());
					}
				});
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
