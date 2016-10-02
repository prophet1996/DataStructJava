/**
 * Created by PROPHET on 02-10-2016.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class MALRunner {
    public static void main(String[] args){
        Result  result= JUnitCore.runClasses(MyArrayListTest.class);
        for(Failure fail:result.getFailures()){
            System.out.println(fail.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
