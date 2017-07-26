import com.ajie.data.HandRedBlueData;
import com.ajie.data.RedBlueData;
import com.ajie.service.SkewnessService;
import com.ajie.service.SkewnessServiceImp;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by aJie on 2017/6/15.
 */
public class SkewnessTest {
    private static final int I = 5;

    @Test
    public void testRedBlue() {
        try {
            Map<String, Integer> blueMap = new LinkedHashMap<String, Integer>();
            Map<String, int[]> redDataMap = new LinkedHashMap<String, int[]>();
            RedBlueData redBlueData = new HandRedBlueData();
            redBlueData.initWinningData(blueMap, redDataMap);
            SkewnessService skewnessService = new SkewnessServiceImp();
            skewnessService.blueMaxMin(I, blueMap);
            skewnessService.redMaxMin(I, redDataMap);
            System.out.println("-----------------------------------------------------------------");
            skewnessService.blueOddEven(I, blueMap);
            skewnessService.redOddEven(I, redDataMap);
            System.out.println("-----------------------------------------------------------------");
            skewnessService.redSum(I, redDataMap);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
