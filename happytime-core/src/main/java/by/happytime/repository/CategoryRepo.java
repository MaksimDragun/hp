package by.happytime.repository;

import by.happytime.baserepo.BaseRepo;
import by.happytime.domain.Category;

public interface CategoryRepo extends BaseRepo<Category> {
    
    Category findByTitle(String title);
    
    Category findByCode(String code);

}
