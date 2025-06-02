package com.dam.algasensors.temperature.monitoring.api.config.jpa;

import io.hypersistence.tsid.TSID;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TSIDToLongJPAAttributeConverter implements AttributeConverter<TSID, Long> {

    @Override
    public Long convertToDatabaseColumn(TSID tsid) {
        return tsid != null ? tsid.toLong() : null;
    }

    @Override
    public TSID convertToEntityAttribute(Long dbData) {
        return dbData != null ? TSID.from(dbData) : null;
    }
}
