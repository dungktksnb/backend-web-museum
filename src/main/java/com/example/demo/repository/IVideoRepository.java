package com.example.demo.repository;
import com.example.demo.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IVideoRepository extends JpaRepository<Video,Long> {

}
