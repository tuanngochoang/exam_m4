package com.codegym.service;

import com.codegym.entity.Video;

import java.util.List;
import java.util.Optional;

public interface VideoService {
    List<Video> getAllVideo();
    Optional<Video> findById(Long id);
    void updateVideo(Video video);
    void deleteVideo(Long id);
}
