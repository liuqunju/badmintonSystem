package com.madequan.badminton.place.test;

import com.madequan.badminton.entity.TPlace;
import com.madequan.badminton.place.util.RandomValue;
import com.madequan.badminton.placeenum.PlaceEnum;
import com.madequan.badminton.service.TPlaceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * @Description:
 * @Date: 2020/06/05/22:17
 */
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:spring-mvc.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PlaceTest {

    @Autowired
    private TPlaceService tPlaceService;

    @Test
    public void addPlace(){
        for (int i = 0; i < 20; i++) {
            TPlace tPlace = new TPlace();
            tPlace.setId(UUID.randomUUID().toString().replace("-", ""));
            tPlace.setPrice(new Random().nextInt(100) );
            tPlace.setAddTime(new Date());
            tPlace.setConsultingTelephone(RandomValue.getTel());
            tPlace.setContent("标准场地" + i);
            tPlace.setGalleryful(String.valueOf(new Random().nextInt(10)));
            tPlace.setPlaceName("标准场地" + i);
            tPlace.setPlaceStatus(PlaceEnum.free.name());
            tPlace.setPrincipal(RandomValue.getChineseName());
            tPlaceService.insert(tPlace);
        }
    }
}
