package org.evomaster.e2etests.spring.examples.positiveinteger;

import com.foo.rest.examples.spring.positiveinteger.PIController;
import org.evomaster.e2etests.spring.examples.SpringTestBase;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class PITestBase extends SpringTestBase {


    @BeforeAll
    public static void initClass() throws Exception {

        PIController controller = new PIController();
        SpringTestBase.initClass(controller);
    }
}
