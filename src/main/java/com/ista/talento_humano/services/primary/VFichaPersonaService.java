package com.ista.talento_humano.services.primary;
import com.ista.talento_humano.model.primary.vfichapersona;

import java.util.List;

public interface VFichaPersonaService extends GenericService<vfichapersona,Long>{
public List<vfichapersona>buscarID(Long id);
}
