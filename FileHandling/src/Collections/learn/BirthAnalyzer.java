package Collections.learn;

import edu.duke.*;

    public class BirthsAnalyzer {
        public void totalBirths("C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2012short.csv",
                                        "C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2013short.csv"
                                        ,"C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2014short.csv"){
            int totalBirths = 0;
            int totalBoys = 0;
            int totalGirls = 0;
            int uniqueBoysNames = 0;
            int uniqueGirlsNames = 0;
            int totalNames = 0;
            StorageResource uniqueNames = new StorageResource();

            for (CSVRecord record : fr.getCSVParser(false)) {
                int numBorn = Integer.parseInt(record.get(2));
                totalBirths += numBorn;
                totalNames++;

                if (record.get(1).equals("M")) {
                    totalBoys += numBorn;
                    if (!uniqueNames.contains(record.get(0))) {
                        uniqueBoysNames++;
                        uniqueNames.add(record.get(0));
                    }
                } else {
                    totalGirls += numBorn;
                    if (!uniqueNames.contains(record.get(0))) {
                        uniqueGirlsNames++;
                        uniqueNames.add(record.get(0));
                    }
                }
            }

            System.out.println("Total births: " + totalBirths);
            System.out.println("Total boys: " + totalBoys);
            System.out.println("Total girls: " + totalGirls);
            System.out.println("Unique boys' names: " + uniqueBoysNames);
            System.out.println("Unique girls' names: " + uniqueGirlsNames);
            System.out.println("Total names: " + totalNames);
        }

        public void testTotalBirths() {
            FileResource fr = new FileResource();
            totalBirths(fr);
        }

        public static void main(String[] args) {
            BirthsAnalyzer analyzer = new BirthsAnalyzer();
            analyzer.testTotalBirths();
        }
    }


