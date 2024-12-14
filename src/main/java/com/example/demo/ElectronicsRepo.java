package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicsRepo extends JpaRepository<Electronics, Long> {
	public Electronics findByPid(int pid);

}
