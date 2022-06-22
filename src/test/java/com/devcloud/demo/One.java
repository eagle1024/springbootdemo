import apoc.util.FileUtils;
import apoc.result.MapResult;
import apoc.result.NodeResult;
import apoc.util.FileUtils;
import apoc.util.Util;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import org.neo4j.procedure.*;
import org.w3c.dom.CharacterData;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class Xml {
    public static final XMLInputFactory FACTORY = XMLInputFactory.newFactory();
    private static final XMLInputFactory FACTORY = XMLInputFactory.newFactory();
    @Context
    public GraphDatabaseService db;

    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(true);
        documentBuilderFactory.setIgnoringElementContentWhitespace(true);
        documentBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl",true);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        documentBuilder.setEntityResolver((publicId,systemId)->new InputSource(new StringReader("")));
        FileUtils.checkReadAllowed(url);
        url = FileUtils.changeFileUrlIfImportDirectoryConstrained(url);
    }
}
