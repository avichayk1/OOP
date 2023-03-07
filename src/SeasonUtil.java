    import java.util.Arrays;
    /**
     * A utility class for working with Seasonable objects.
     */
    public class SeasonUtil {
        /**
         * An array of all seasons, in the order they are defined in the Season enum.
         */
        public static final Season[] SEASONS = Season.values();
        /**
         * Sorts an array of Seasonable objects in their current season order.
         *
         * @param seasonables the array of Seasonable objects to be sorted.
         */
        public static void sortSeasonable(Comparable[] seasonables) {
            Arrays.sort(seasonables);
        }

        /**
         * Generates a report of all Seasonable objects in the array.
         *
         * @param seasonables the array of Seasonable objects to report on.
         * @return a string containing a report of all Seasonable objects in the array.
         */
        static String reportAll(Seasonable[] seasonables) {
            String to_return = "";
            for (Seasonable seasonable : seasonables) {
                if(seasonables[seasonables.length -1] == seasonable)
                    to_return += seasonable.toString();
                else
                {
                    to_return += seasonable.toString() + "\n";
                }
            }
            return to_return;
        }
    }