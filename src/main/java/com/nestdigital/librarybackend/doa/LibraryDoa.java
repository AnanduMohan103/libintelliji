package com.nestdigital.librarybackend.doa;

import com.nestdigital.librarybackend.model.LibraryModel;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDoa extends CrudRepository<LibraryModel,Integer> {
}
