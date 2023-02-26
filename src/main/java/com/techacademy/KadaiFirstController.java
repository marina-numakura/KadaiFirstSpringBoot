package com.techacademy;

import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{yyyymmdd}")
    public String dispDayOfWeek(@PathVariable String yyyymmdd) {

        String year = yyyymmdd.substring(0,4); //年（yyyyを抜いた変数　0～4番目）
        String month = yyyymmdd.substring(4,6); //月（mmを抜いた変数　5～6番目）
        String day = yyyymmdd.substring(6,8); //日（ddを抜いた変数　7～8番目）

        int yyyy = Integer.parseInt(year);
        int mm = Integer.parseInt(month);
        int dd = Integer.parseInt(day);

        //曜日を取得
        LocalDate date = LocalDate.of(yyyy,mm,dd);
        final var week = date.getDayOfWeek();
        System.out.println(week);

        return "実行結果：" + week;

    }

    @GetMapping("/plus/{val1}/{val2}")
    public String calcPlus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return "計算結果：" + res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public String calcMinus(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return "計算結果：" + res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public String calcTimes(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return "計算結果：" + res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public String calcDivide(@PathVariable int val1,@PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return "計算結果：" + res;
    }
}
