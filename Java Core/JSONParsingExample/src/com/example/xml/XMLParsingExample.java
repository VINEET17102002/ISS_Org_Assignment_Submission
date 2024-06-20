package com.example.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLParsingExample {
    public static void main(String[] args) {
        try {
            // Step 1: Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Step 2: Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Step 3: Parse the XML file
            Document document = builder.parse("example.xml");

            // Optional: Normalize the XML structure (optional but recommended)
            document.getDocumentElement().normalize();

            // Step 4: Get the root element
            Element root = document.getDocumentElement();

            // Step 5: Get NodeList of 'employee' elements
            NodeList employeeList = root.getElementsByTagName("employee");

            // Step 6: Iterate over 'employee' elements
            for (int i = 0; i < employeeList.getLength(); i++) {
                Element employeeElement = (Element) employeeList.item(i);

                // Step 7: Get specific child elements by tag name
                String id = employeeElement.getElementsByTagName("id").item(0).getTextContent();
                String name = employeeElement.getElementsByTagName("name").item(0).getTextContent();
                String salary = employeeElement.getElementsByTagName("salary").item(0).getTextContent();

                // Step 8: Print employee details
                System.out.println("Employee ID: " + id);
                System.out.println("Employee Name: " + name);
                System.out.println("Employee Salary: " + salary);
                System.out.println("--------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
