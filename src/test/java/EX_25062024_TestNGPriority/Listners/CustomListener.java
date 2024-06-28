package EX_25062024_TestNGPriority.Listners;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomListener  implements IExecutionListener, ISuiteListener {

    @Override
    public void onExecutionStart() {
        System.out.println("onExecutionStart");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("onExecutionFinish");
    }
}
