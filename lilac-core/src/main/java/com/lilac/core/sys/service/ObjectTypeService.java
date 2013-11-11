package com.lilac.core.sys.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lilac.core.repository.support.SearchFilter;
import com.lilac.core.service.AbstractService;
import com.lilac.core.sys.entity.ObjectType;
import com.lilac.core.sys.repository.ObjectTypeRepository;

/**
 * @author andy
 * @since 2013-5-16
 */
@Service
@Transactional
public class ObjectTypeService extends AbstractService<ObjectTypeRepository, ObjectType, String> {

    public Page<ObjectType> findAll(Map<String, Object> searchParams, Pageable pageable) {
        final Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
        Specification<ObjectType> spec = new Specification<ObjectType>() {

            @Override
            public Predicate toPredicate(Root<ObjectType> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<Predicate>();
                for (SearchFilter searchFilter : filters.values()) {
                    Expression<Object> fieldExpression = root.get(searchFilter.fieldName);
                    predicates.add(cb.equal(fieldExpression, searchFilter.value));
                }
                if (predicates.isEmpty()) {
                    return cb.and(predicates.toArray(new Predicate[predicates.size()]));
                }
                return cb.conjunction();
            }
        };
        return repository.findAll(spec, pageable);
    }

    /**
     * @param className
     * @return
     */
    public ObjectType findByClassName(String className) {
        return repository.findByClassName(className);
    }

}
