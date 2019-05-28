import com.ing.blockchain.zk.RangeProof;
import com.ing.blockchain.zk.dto.BoudotRangeProof;
import com.ing.blockchain.zk.dto.ClosedRange;
import com.ing.blockchain.zk.dto.TTPMessage;

public class User { // needs to keep the secret secret and prove to the verifier he knows it
    public static BoudotRangeProof generateRangeProof(TTPMessage message, ClosedRange ageRange) {
        return RangeProof.calculateRangeProof(message, ageRange);
    }
}
