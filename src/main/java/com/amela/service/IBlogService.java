package com.amela.service;

import com.amela.model.Blog;
import com.amela.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService extends IGeneralService<Blog> {
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
}
