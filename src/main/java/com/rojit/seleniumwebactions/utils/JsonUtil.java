package com.rojit.seleniumwebactions.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonUtil {
    private JsonNode rootNode;
    public JsonUtil(String filePath) { ObjectMapper mapper = new ObjectMapper(); try { rootNode = mapper.readTree(new File(filePath)); } catch (IOException e) { e.printStackTrace(); } }
    public JsonNode getNode(String nodeName) { if (rootNode != null) return rootNode.get(nodeName); return null; }
}
