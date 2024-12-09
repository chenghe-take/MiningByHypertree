# Frequent Subgraph Mining in a Single Graph

This repository implements algorithms for mining frequent subgraphs in a single graph in the spanning hypertree setting, utilizing various support measures such as MNI, MI, MVC, and MIS. The program is designed to calculate the frequency of subgraphs within a large graph, and can be run with different support measures and algorithm configurations.

## Requirements

1. **Java 8 or higher** is required to run the program.
2. Ensure that all necessary libraries and dependencies are set up in your project.

## Running the Program

### Step 1: Open the Project in IntelliJ IDEA

If you're using IntelliJ IDEA, simply open the project directory in the IDE. IntelliJ will automatically detect the `.java` files and compile them when you run the program. No need for a manual compilation step.

### Step 2: Run the `MainTest.java`

To run the program, execute the `MainTest.java` file. This file is the entry point for testing the subgraph mining algorithm.

In IntelliJ IDEA:
1. Right-click on the `MainTest.java` file.
2. Select **Run 'MainTest'** from the context menu.

Alternatively, you can use the **Run** button in the IDE toolbar after opening `MainTest.java`.

### Step 3: Configure the Parameters

Before running the program, you can configure the following parameters to customize the mining process:

- **minSupport**: Minimum support threshold for frequent subgraph mining. This is the exact count in the dataset that a subgraph must appear in to be considered frequent.
  
- **supType**: The support type to be used for mining frequent subgraphs. Available options include:
  - `"MNI"`: Minimum-image-based measure.
  - `"MI"`: Minimum instance measure.
  - `"MVC"`: Minimum vertex cover measure(approximate algorithm).
  - `"MIS"`: Minimum independent edge Set (approximate algorithm).
  
- **getHypertree**: A boolean flag (`true`/`false`) that indicates whether to utilize the hypertree framework.

### Details
Exact algorithms for MVC and MIS are in `MaximumIndependentEdge.java` and `MinimumVertexCover.java.` Users can refer to their implementation.

### Example Command

To run the program with a minimum support 20 in the database *Deezer*, using the MNI support measure and the hypertree framework, the command would look like:

```bash
String input = "Data/deezer.lg"
int minSupport = 20
String supType = "MNI"
boolean getHypertree = true

