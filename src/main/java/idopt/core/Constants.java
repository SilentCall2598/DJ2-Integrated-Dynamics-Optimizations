package idopt.core;

public final class Constants {

    public static final String MOD_ID = "idopt";
    public static final String MOD_NAME = "Integrated Dynamics Optimizations";
    public static final String VERSION = "0.1.0-dev";
    public static final String DEPENDENCIES = "required-after:mixinbooter;"
            + "required-after:integrateddynamics;"
            + "after:integratedtunnels;"
            + "required-after:cyclopscore;"
            + "required-after:commoncapabilities";

    private Constants() {
    }
}
