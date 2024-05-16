public class Converter {
    public double badge_converter(Badge badge, double total, String value) {
        try {
            switch (value) {
                case "ARS":
                    return badge.conversion_rates().ARS() * total;
                case "BOB":
                    return badge.conversion_rates().BOB() * total;
                case "BRL":
                    return badge.conversion_rates().BRL() * total;
                case "CLP":
                    return badge.conversion_rates().CLP() * total;
                case "COP":
                    return badge.conversion_rates().COP() * total;
                case "USD":
                    return badge.conversion_rates().USD() * total;
                case "CRC":
                    return badge.conversion_rates().CRC() * total;
                default:
                    return 1 * total;
            }
        } catch (Exception e) {
            throw new RuntimeException("404\nNOT FOUND\n" + e.getMessage());
        }
    }
}
