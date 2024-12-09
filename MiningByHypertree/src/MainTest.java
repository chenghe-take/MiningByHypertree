import java.io.IOException;

public class MainTest {

	public static void main(String [] arg) throws IOException, ClassNotFoundException{

		// set the input and output file path
		String input = "Data/deezer.lg";
		String output = ".//output.txt";

		// set the minimum support threshold
		int minSupport = 20;

		/**
		 * set support type
		 * there are four support measures: "MNI", "MI", "MVC", "MIS"
		 * the MVC and MIS algorithm are an approximate algorithm
		 * the exact algotithms will take too much the runtime
		 */
		String supType = "MNI";
		
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
