package com.usa.misiontic.masterclass3.repository;

import com.usa.misiontic.masterclass3.entities.Toool;
import com.usa.misiontic.masterclass3.repository.crudRepository.ToolCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ToolRepository {
    @Autowired
    private ToolCrudRepository ToolCrudRepository;

    public List<Toool> getAll(){
        return (List<Toool>) ToolCrudRepository.findAll();
    }

    public Optional<Toool> getTool(int id){
        return ToolCrudRepository.findById(id);
    }
    public Toool save(Toool c){
        return ToolCrudRepository.save(c);
    }
    public void delete(Toool c){
        ToolCrudRepository.delete(c);
    }

}
