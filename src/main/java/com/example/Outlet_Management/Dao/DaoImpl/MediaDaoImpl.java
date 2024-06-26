package com.example.Outlet_Management.Dao.DaoImpl;

import com.example.Outlet_Management.Dao.MediaDao;
import com.example.Outlet_Management.entity.MhMedia;
import com.example.Outlet_Management.repo.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;


@Repository
public class MediaDaoImpl implements MediaDao {

    @Autowired
    private MediaRepository mediaRepository;


    @Override
    public void saveMedia(MhMedia media) {

        mediaRepository.save(media);
    }

    @Override
    public List<MhMedia> findByEntityId(String id) {

        return mediaRepository.findAllByEntityId(id);
    }


}
