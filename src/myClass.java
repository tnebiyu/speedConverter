public class myClass {
    public static void main(String[] args) {

      printConversion(12.56);
    }
        public static long toMilesPerHour(double kilometersPerHour) {
            long milesPerHour;
            if (kilometersPerHour < 0) {
                milesPerHour = -1;
            } else {
                //1 miles per hour is 1.609 kms per hour.
                milesPerHour = Math.round(kilometersPerHour / 1.609);
            }

            return milesPerHour;
        }

        public static void printConversion(double kilometersPerHour) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            if (milesPerHour == -1) {
                System.out.println("Invalid Value");
            } else {
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }
    }
