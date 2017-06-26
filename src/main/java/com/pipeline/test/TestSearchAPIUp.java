package com.pipeline.test;
import org.junit.Test;

/**
 * Created by heyuzhi on 2017/3/21.
 */
public class TestSearchAPIUp {

    @Test
    public void testSearch() {
        try {
            System.out.println("testSearch");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
    @Test
    public void testUpload() {
        try {
            //System.out.println(searchManager.dataUpload("53533", "datajingdo_m", "user", "[{\"cmd\":\"add\",\"fields\":{\"userid\": \"28394557_100\", \"cid\": \"123\", \"imei\": 123, \"action_type\": \"view\", \"action_num\": \"12\", \"email\": \"123@jd.com\", \"action_detail\": \"19901123\"}}]"));
        System.out.println("testUpload");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testSuggest(){
        try{

            System.out.println("SUggest");
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }


}
