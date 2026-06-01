package utils;

public class CommonUtils {

    // Khóa constructor lại vì đây là class Utils, không cần khởi tạo đối tượng
    private CommonUtils() {}

    public static String normalizeVehicleId(String input) {
        if (input == null || input.trim().isBlank()) {
            return "";
        }

        String cleanStr = input.toUpperCase().replaceAll("\\s+", "");
        return cleanStr;
    }

}
