package com.usa.misiontic.masterclass3.service;

import com.usa.misiontic.masterclass3.entities.Toool;
import com.usa.misiontic.masterclass3.repository.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToolService {

    @Autowired
    private ToolRepository repositorioHerramienta;

    public List<Toool> getAll(){
        return repositorioHerramienta.getAll();
    }
    public Optional<Toool> getTool(int id){
        return repositorioHerramienta.getTool(id);
    }
    public Toool save(Toool p){
        if(p.getIdtools()!=null){
            return repositorioHerramienta.save(p);
        }else{
            Optional<Toool> e = repositorioHerramienta.getTool(p.getIdtools());
            if(e.isPresent()){
                return p;
            }else{
                return repositorioHerramienta.save(p);
            }
        }
    }
    public Toool update(Toool p){
        if(p.getIdtools()!=null){
            Optional<Toool> q = repositorioHerramienta.getTool(p.getIdtools());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                repositorioHerramienta.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Toool>p= repositorioHerramienta.getTool(id);
        if(p.isPresent()){
            repositorioHerramienta.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
