package com.roncoo.eshop.datasync.service.fallback;

import com.roncoo.eshop.datasync.service.EshopProductService;
import org.springframework.stereotype.Component;

/**
 * @Author linjingcheng
 * @data 2020/10/22
 */
@Component
public class EshopProductServiceFallback implements EshopProductService {
    @Override
    public String findBrandById(Long id) {
        return null;
    }

    @Override
    public String findBrandByIds(String ids) {
        return null;
    }

    @Override
    public String findCategoryById(Long id) {
        return null;
    }

    @Override
    public String findProductIntroById(Long id) {
        return null;
    }

    @Override
    public String findProductPropertyById(Long id) {
        return null;
    }

    @Override
    public String findProductById(Long id) {
        return null;
    }

    @Override
    public String findProductSpecificationById(Long id) {
        return null;
    }
}
