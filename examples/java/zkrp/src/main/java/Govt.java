import com.ing.blockchain.zk.TTPGenerator;
import com.ing.blockchain.zk.components.SecretOrderGroupGenerator;
import com.ing.blockchain.zk.dto.SecretOrderGroup;
import com.ing.blockchain.zk.dto.TTPMessage;

import java.math.BigInteger;

public class Govt { // government or KYC provider
    public static TTPMessage createTrustedMessage(BigInteger committmentValue, SecretOrderGroup orderGroup) {
        TTPMessage ttpMessage = TTPGenerator.generateTTPMessage(committmentValue);
        return ttpMessage;
    }
}
