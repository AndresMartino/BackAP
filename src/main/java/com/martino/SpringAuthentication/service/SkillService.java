package com.martino.SpringAuthentication.service;

import com.martino.SpringAuthentication.domain.Skill;
import com.martino.SpringAuthentication.repository.SkillRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill addSkill(Skill skill){
        return skillRepository.save(skill);
    }
    public Skill updateSkill(Skill skill){
        return skillRepository.save(skill);
    }
    public List<Skill> findAllSkills(){
        return skillRepository.findAll();
    }
    public void deleteSkill(Long id){
        skillRepository.deleteById(id);
    }

}