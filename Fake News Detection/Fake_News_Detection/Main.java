import weka.core.*;
import weka.core.converters.ArffLoader;
import weka.classifiers.*;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Evaluation;

import java.io.*;

public class FakeNewsDetector {

    public static void main(String[] args) {
        try {
            // Load the ARFF file containing training data
            ArffLoader loader = new ArffLoader();
            loader.setSource(new File("training_data.arff"));
            Instances trainingData = loader.getDataSet();
            trainingData.setClassIndex(trainingData.numAttributes() - 1);

            // Create and build the NaiveBayes classifier
            NaiveBayes naiveBayes = new NaiveBayes();
            naiveBayes.buildClassifier(trainingData);

            // Load the ARFF file containing test data
            loader.setSource(new File("test_data.arff"));
            Instances testData = loader.getDataSet();
            testData.setClassIndex(testData.numAttributes() - 1);

            // Evaluate the classifier
            Evaluation eval = new Evaluation(trainingData);
            eval.evaluateModel(naiveBayes, testData);

            // Output evaluation results
            System.out.println(eval.toSummaryString("\nResults\n======\n", false));

            // Classify some new instances (sentences)
            Instance newSentence1 = new DenseInstance(2);
            newSentence1.setDataset(trainingData);
            newSentence1.setValue(0, "This is a genuine news article.");
            newSentence1.setMissing(1); // We don't have a class label for this instance
            double prediction1 = naiveBayes.classifyInstance(newSentence1);
            System.out.println("Prediction for sentence 1: " + trainingData.classAttribute().value((int) prediction1));

            Instance newSentence2 = new DenseInstance(2);
            newSentence2.setDataset(trainingData);
            newSentence2.setValue(0, "This news is definitely fake.");
            newSentence2.setMissing(1); // We don't have a class label for this instance
            double prediction2 = naiveBayes.classifyInstance(newSentence2);
            System.out.println("Prediction for sentence 2: " + trainingData.classAttribute().value((int) prediction2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
