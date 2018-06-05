package com.zq.service.impl;

import com.zq.entity.Image;
import com.zq.repository.ImageRepository;
import com.zq.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    ImageRepository imageRepository;

    public Image test() {
        return imageRepository.get(74L);
    }
}
