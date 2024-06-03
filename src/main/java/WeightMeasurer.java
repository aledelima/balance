public class WeightMeasurer {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a sample weight as a command-line argument.");
            return;
        }

        try {
            // Read the sample weight from the command line argument
            int sampleWeight = Integer.parseInt(args[0]);

            int measuredWeight = Weigher.weigh3(sampleWeight);

            System.out.println("The weight measured for the sample is " + measuredWeight + ".");
        } catch (NumberFormatException e) {
            System.out.println("Invalid sample weight. Please provide a valid integer.");
        }
    }
}