package com.example.yagolxyz.config;

import com.example.yagolxyz.entity.Category;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author yagol
 * @date 2022/5/24
 */
@Configuration
public class MyWebMvcConfigSupport extends WebMvcConfigurationSupport {
    @Override
    public FormattingConversionService mvcConversionService() {
        FormattingConversionService f = super.mvcConversionService();
        f.addConverter(
                new Converter<String, Category>() {
                    @Override
                    public Category convert(String source) {
                        try {
                            return Category.valueOf(source.toUpperCase());
                        } catch (Exception e) {
                            return null;
                        }
                    }
                }
        );
        return super.mvcConversionService();
    }
}
