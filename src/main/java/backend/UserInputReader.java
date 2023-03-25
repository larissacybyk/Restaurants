package backend;

import java.io.*;
import java.util.*;

public class UserInputReader {
    private final String filename;
    public double waiterSalary;
    public double bartenderSalary;
    public double managerSalary;
    public double cookSalary;
    public double avgCriticCheck;
    public double avgBarCheck;
    public double avgFirstTimeCheck;
    public double avgDiscountedCheck;
    public double avgNormalCheck;

    private BufferedReader bufferedReader;

    public UserInputReader(String filename) {
        if (!filename.toLowerCase().endsWith(".csv")) {
            throw new IllegalArgumentException("Error: cannot open non csv file " + filename + " Follow template for details on formatting.");
        }
        this.filename = filename;
    }

    private void readFile() {
        try {
            generateBufferedReader();
            getParametersFromFile();
            bufferedReader.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void generateBufferedReader() throws FileNotFoundException {
        FileReader filereader = new FileReader(filename);
        bufferedReader = new BufferedReader(filereader);
    }

    private void getParametersFromFile() throws IOException {
        for(String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
            try {
                getParameter(line);
            }
            catch (IndexOutOfBoundsException | IllegalArgumentException ignored) {
            }
        }
    }

    private void getParameter(String line) {
        String[] lineSplitOnCommas = line.strip().split(",");
        String arg1 = lineSplitOnCommas[0].strip();
        if (arg1.equals("waiterSalary")) {
            waiterSalary = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("bartenderSalary")) {
            bartenderSalary = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("managerSalary")) {
            managerSalary = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("cookSalary")) {
            cookSalary = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("avgCriticCheck")) {
            avgCriticCheck = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("avgBarCheck")) {
            avgBarCheck = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("avgFirstTimeCheck")) {
            avgFirstTimeCheck = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("avgDiscountedCheck")) {
            avgDiscountedCheck = Double.parseDouble(lineSplitOnCommas[1].strip());
        } else if (arg1.equals("reservations")) {



            
        } else if (arg1.equals("avgNormalCheck")) {
            avgNormalCheck = Double.parseDouble(lineSplitOnCommas[1].strip());
        }
    }

}
