package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VegRepo extends JpaRepository<Vegetables, Long> {
	public Vegetables findByPid(int pid);

}
