import com.ing.blockchain.zk.dto.ClosedRange;
import com.ing.blockchain.zk.dto.Commitment;
import com.ing.blockchain.zk.dto.SecretOrderGroup;
import com.ing.blockchain.zk.util.ExportUtil;

import java.math.BigInteger;

public class Eth { // government or KYC provider
  public static byte[] exportSolidity(SecretOrderGroup group, BigInteger committmentValue) {
    Commitment committment = new Commitment(group, committmentValue);
    byte[] solidityCommitment = ExportUtil.exportForEVM(committment);
    System.out.println("Ethereum solidity output:");
    System.out.println(solidityCommitment);
    return solidityCommitment;
  }
}

