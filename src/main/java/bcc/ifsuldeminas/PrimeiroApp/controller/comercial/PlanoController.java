package bcc.ifsuldeminas.PrimeiroApp.controller.comercial;

import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.comercial.Plano;
import bcc.ifsuldeminas.PrimeiroApp.model.entities.telefonia.repository.PlanoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/plano")
public class PlanoController {
    public PlanoController(PlanoRepository planoRepository) {
        this.planoRepository = planoRepository;
    }

    private PlanoRepository planoRepository;

    @PostMapping
    public Plano create(@RequestBody Plano plano){
        this.planoRepository.save(plano);
        return plano;
    }

    @GetMapping("/{id}")
    public Plano read(@PathVariable Long id){
        Optional opt = this.planoRepository.findById(id);
        if(opt.isPresent()){
            return (Plano)opt.get();
        }else{
            return null;
        }
    }

    @GetMapping
    public List<Plano> read(){
        return this.planoRepository.findAll();
    }

    @PutMapping("/{id}")
    public Plano update(@PathVariable Long id, @RequestBody Plano plano){
        Optional opt = this.planoRepository.findById(id);
        if(opt.isPresent()){
            Plano planoOriginal = (Plano)opt.get();
            planoOriginal.setNome(plano.getNome());
            planoOriginal.setValorPorMinuto(plano.getValorPorMinuto());
            this.planoRepository.save(planoOriginal);
            return planoOriginal;
        }else{
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.planoRepository.deleteById(id);
    }
}
