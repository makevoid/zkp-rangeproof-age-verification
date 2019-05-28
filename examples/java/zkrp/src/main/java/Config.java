import com.ing.blockchain.zk.TTPGenerator;
import com.ing.blockchain.zk.dto.ClosedRange;
import com.ing.blockchain.zk.dto.TTPMessage;

import java.math.BigInteger;

public class Config {

    private static String[] ageRangeConfig() {
        String ageMin = "18";
        String ageMax = "65";
        String[] ageRange = {ageMin, ageMax};
        return ageRange;
    }

    public static ClosedRange getAgeRange() {
        String[] ageRange = ageRangeConfig();
        String ageMin = ageRange[0];
        String ageMax = ageRange[1];
        return ClosedRange.of(ageMin, ageMax);
    }
    public static ClosedRange getAgeRangeIncorrect() { // use this to trigger the ZeroKnowledgeException on verification
        String[] ageRange = ageRangeConfig();
        String ageMin = "61";
        String ageMax = ageRange[1];
        return ClosedRange.of(ageMin, ageMax);
    }

}
