package restfullclient;

import StringPackage.StringOperationClient;

public class RestFullClient {
    public static void main(String[] args) {
        StringOperationClient client = new StringOperationClient();
        
        // Test the uppercase method
        String upperCaseResult = client.toUppercaseMethod("mumbai university");
        System.out.println("Uppercase: " + upperCaseResult);
        
        // Test the lowercase method
        String lowerCaseResult = client.toLowercaseMethod("MUMBAI UNIVERSITY");
        System.out.println("Lowercase: " + lowerCaseResult);
    }
}
