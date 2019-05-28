import com.ing.blockchain.zk.RangeProof;
import com.ing.blockchain.zk.dto.BoudotRangeProof;
import com.ing.blockchain.zk.dto.ClosedRange;
import com.ing.blockchain.zk.dto.TTPMessage;

public class Service { // website or similar web service acting as final verifier of the ZKP
    public static void validateAgeProof(BoudotRangeProof rangeProof, TTPMessage message, ClosedRange ageRange) {
        RangeProof.validateRangeProof(rangeProof, message.getCommitment(), ageRange);
    }
}
