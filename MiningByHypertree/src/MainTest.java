import java.io.IOException;

/**
 * Example of how to use the GSPAN algorithm 
 * from the source code and output the result to a file.
 * @author Chao Cheng & Philippe Fournier-Viger 2019
 */
public class MainTest {

	public static void main(String [] arg) throws IOException, ClassNotFoundException{

		// set the input and output file path
		String input = "Data/citeseer.lg";
		String output = ".//output.txt";

		// set the minimum support threshold
		int minSupport = 10;

		/**
		 * set support type
		 * there are four support measures: "MNI", "MI", "MVC", "MIS"
		 */
		String supType = "MIS";
		
		// The maximum number of edges for frequent subgraph patterns
		int maxNumberOfEdges = Integer.MAX_VALUE;
		
		// If true, single frequent vertices will be output
		boolean outputSingleFrequentVertices = false;
		
		// If true, a dot file will be output for visualization using GraphViz
		boolean outputDotFile = false;

		// If true, use hypertree method
		boolean getHypertree = false;
		
		// Apply the algorithm 
		Algo algo = new Algo();
		algo.runAlgorithm(input, output, minSupport, supType, outputSingleFrequentVertices,
				outputDotFile, maxNumberOfEdges, getHypertree);
		
		// Print statistics about the algorithm execution
		algo.printStats();
	}
}
