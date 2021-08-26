package com.exercises.chapters.io.ex32;

import com.exercises.chapters.io.ex18.TextFile;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.ParsingException;
import nu.xom.Serializer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String file = "src\\main\\resources\\Lines.txt";
        String fileXml = "LinesWords.xml";
        Map<String, Integer> map = getCountOfWords(file);

        writeToXml(map, fileXml);
        System.out.println(readFromXml(fileXml));
    }

    public static Map<String, Integer> getCountOfWords(String file) {
        Map<String, Integer> map = new HashMap<>();
        try {
            for (var word : new TextFile(file, "\\W+")) {
                Integer occurrences = map.get(word);
                if (occurrences == null) {
                    map.put(word, 1);
                } else {
                    map.put(word, ++occurrences);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

    public static void writeToXml(Map<String, Integer> map, String fileName) {
        Element root = new Element("words");
        for (var each : map.entrySet()) {
            Element word = new Element(each.getKey());
            word.appendChild(String.valueOf(each.getValue()));
            root.appendChild(word);
        }
        Document doc = new Document(root);
        try {
            format(new BufferedOutputStream(new FileOutputStream(fileName)), doc);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Integer> readFromXml(String fileName) {
        Document doc;
        try {
            doc = new Builder().build(fileName);
        } catch (ParsingException | IOException e) {
            throw new RuntimeException(e);
        }
        Elements elements = doc.getRootElement().getChildElements();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < elements.size(); i++) {
            var element = elements.get(i);
            map.put(element.getQualifiedName(), Integer.valueOf(element.getValue()));
        }
        return map;
    }

    public static void format(OutputStream os, Document doc) throws IOException {
        Serializer serializer = null;
        serializer = new Serializer(os, "ISO-8859-1");
        serializer.setIndent(4);
        serializer.setMaxLength(60);
        serializer.write(doc);
        serializer.flush();
    }
}
