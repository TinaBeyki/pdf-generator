import java.util.ResourceBundle;

public class ResourceBundleFa {

    private static ResourceBundle getBundle() {
        return ResourceBundle.getBundle("file");
    }
    public static String showErrorMessage(String key) {
        return getBundle().getString(key);
    }
}
