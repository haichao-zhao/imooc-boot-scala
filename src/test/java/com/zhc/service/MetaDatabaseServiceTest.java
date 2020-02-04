package com.zhc.service;

import com.zhc.domain.MetaDatabase;
import com.zhc.repository.MetaDatabaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MetaDatabaseServiceTest {

    @Autowired
    private MetaDatabaseRepository metaDatabaseRepository;

    @Test
    public void testSave(){
        MetaDatabase metaDatabase = new MetaDatabase();

        metaDatabase.setName("default");
        metaDatabase.setLocation("hdfs://localhost:8020/user/hive/warehouse");

        metaDatabaseRepository.save(metaDatabase);

    }

    @Test
    public void testQuery(){
        Iterable<MetaDatabase> all = metaDatabaseRepository.findAll();
        for (MetaDatabase metaDatabase : all) {
            System.out.println(metaDatabase);
        }
    }
}
