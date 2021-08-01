package com.amela.repository;

import com.amela.model.Blog;
import com.amela.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAllByTitleContaining(String title, Pageable pageable);
}
