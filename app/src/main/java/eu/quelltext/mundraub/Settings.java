package eu.quelltext.mundraub;

import eu.quelltext.mundraub.error.Logger;

public class Settings {

    public static final String INVALID_HASH = "0000000000000000000000000000000000000000";
    public static final String COMMIT_HASH = "4e515be42c9453bf9d25849afda2436f659a67a3";

    public static String getShortHash(){
        return COMMIT_HASH.substring(0, 7);
    }

    public static boolean isRelease() {
        return !COMMIT_HASH.equals(INVALID_HASH);
    }

    public static void print() {
        Logger.Log log = Logger.newFor("Settings");
        log.d("BuildConfig.VERSION_NAME", BuildConfig.VERSION_NAME);
        log.d("BuildConfig.DEBUG", Boolean.toString(BuildConfig.DEBUG));
        log.d("BuildConfig.VERSION_CODE", Integer.toString(BuildConfig.VERSION_CODE));
        log.d("COMMIT_HASH", COMMIT_HASH);
    }
}
