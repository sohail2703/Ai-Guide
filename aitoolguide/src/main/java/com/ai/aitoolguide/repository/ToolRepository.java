package com.ai.aitoolguide.repository;
 
import com.ai.aitoolguide.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
 
public interface ToolRepository extends JpaRepository<Tool, Long> {
 
    List<Tool> findByCategoryId(Long categoryId);
 
    List<Tool> findByNameContainingIgnoreCase(String name);
 
}