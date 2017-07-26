import com.ajie.entity.SkewnessVo;
import com.ajie.service.RedOddEvenMaxMinUpDownSuggestServiceImp;
import com.ajie.service.SuggestService;
import org.junit.Test;

/**
 * Created by aJie on 2017/6/18.
 */
public class RedTest {
    @Test
    public void testRedOddEvenMaxMinUpDownSuggest() {
        try {
            SuggestService suggestService = new RedOddEvenMaxMinUpDownSuggestServiceImp();
            SkewnessVo skewnessVo = new SkewnessVo();
            skewnessVo.setEvenNum(4);//偶数个数
            skewnessVo.setOddNum(2);//奇数个数
            skewnessVo.setMaxNum(5);//大数个数
            skewnessVo.setMinNum(1);//小数个数
            skewnessVo.setUpOrDown(true);
            suggestService.getSysSuggest(skewnessVo);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
