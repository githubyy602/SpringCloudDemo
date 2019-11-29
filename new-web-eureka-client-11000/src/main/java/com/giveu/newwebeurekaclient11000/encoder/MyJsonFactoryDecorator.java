package com.giveu.newwebeurekaclient11000.encoder;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import net.logstash.logback.decorate.JsonFactoryDecorator;
import org.springframework.stereotype.Component;

/**
 * @author 539892
 * @email yangyu3@giveu.cn
 * @date 2019/11/29 17:57
 * @description
 */
@Component
public class MyJsonFactoryDecorator implements JsonFactoryDecorator {

    @Override
    public MappingJsonFactory decorate(MappingJsonFactory factory) {
        // 禁用对非ascii码进行escape编码的特性
        factory.disable(JsonGenerator.Feature.ESCAPE_NON_ASCII);
        return factory;
    }

}