package com.assignment.assignment.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.assignment.entities.Load;
import com.assignment.assignment.loadDao.LoadDao;

@Service
public class servicesImpl implements LoadServices {
	@Autowired
	private LoadDao loaddao;
	
  
	@Override
	public void addLoad(Load load) {
		loaddao.save(load);
	}
//
//	@Override
//	public List<Load> listgetbyId(String id) {//EEEEEEEEERRRRRROOOOOORRRRRRRRR
//        return null;        
//	}

	@Override
	public Load getbyId(int id) {
		Optional<Load> o=loaddao.findById(id);
//		try {
//			o = loaddao.findById(id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if(o.get()==null) {
			return null;
		}
		return o.get();
	}

//	@Override
//	public Load updatebyId(Load load,String id) {
//		loaddao.save(load);
//		return load;                       /////////Confusion
//	}

//	@Override
//	public void deletebyId(String Id) {
//    Load entity=loaddao.getOne(Id);
//    loaddao.delete(entity);}
}
