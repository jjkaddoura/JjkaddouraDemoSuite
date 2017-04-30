package edu.ucsb.cs.cs190i.jjkaddoura.masterdetaildemo;

/**
 * Created by Samuel on 4/20/2017.
 */

public class FragmentFactory {
    public static SavableFragment createFragment(String fragment) {
        switch (fragment) {
            case "Example":
                return new ExampleFragment();
            default:
                return null;
        }
    }
}
