package com.example.demo.service;

import com.example.demo.entity.Local;
import com.example.demo.repository.LocalRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalServiceImpl implements LocalService {

    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }

    
    @Override
    public Local saveLocal(Local local) {
        return localRepository.save(local);

    }

    public Local updateLocal(Long id, Local local) {
        Local localDb = localRepository.findById(id).get();
        
        if(Objects.nonNull(local.getCode())&&!"".equalsIgnoreCase(local.getCode())){
            localDb.setCode(local.getCode());
        }
        if(Objects.nonNull(local.getFloor())&&!"".equalsIgnoreCase(local.getFloor())){
            localDb.setFloor(local.getFloor());
        }
        if(Objects.nonNull(local.getNombre())&&!"".equalsIgnoreCase(local.getNombre())){
            localDb.setNombre(local.getNombre());
        }
        return localRepository.save(localDb);
    }

 
    public void deleteLocal(Long id) {
        localRepository.deleteById(id);

    }

}
