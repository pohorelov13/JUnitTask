package demo;

import demo.test.ArrayHandlerTest;
import demo.test.SimpleMathLibraryTest;
import demo.testHandler.ProjectTestRunner;
import demo.testHandler.TestResultParser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        ProjectTestRunner projectTestRunner = new ProjectTestRunner();
//        projectTestRunner.startTests("demo.test.ArrayHandlerTest", "demo.test.SimpleMathLibraryTest");
//        projectTestRunner.startTestPack("demo.test");
//        projectTestRunner.startTests(ArrayHandlerTest.class, SimpleMathLibraryTest.class);
//        projectTestRunner.startTests("demo.test.ArrayHandlerTest");
//        projectTestRunner.startTests(SimpleMathLibraryTest.class);


        TestResultParser parser = new TestResultParser();
        System.out.println(parser.parse("demo.test.SimpleMathLibraryTest_27_02_2023_15_53_08_134.txt"));
    }
}
