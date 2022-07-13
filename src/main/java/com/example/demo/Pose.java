package com.example.demo;


import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.spring.data.firestore.Document;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Example POJO to demonstrate Spring Cloud GCP Spring Data Firestore operations. */

public class Pose {
private String id;
private String name;
private String urlname;
private String breath;
private String  posture;
private String query;
private String response;

public String getResponse() {
    return response;
}
public void setResponse(String response) {
    this.response = response;
}

public String getQuery() {
    return query;
}
public void setQuery(String query) {
    this.query = query;
}

public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}

public String getUrlname() {
    return urlname;
}
public void setUrlname(String urlname) {
    this.urlname = urlname;
}

public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getBreath() {
    return breath;
}
public void setBreath(String breath) {
    this.breath = breath;
}
public String getPosture() {
    return posture;
}
public void setPosture(String posture) {
    this.posture = posture;
}
  @Override
  public String toString() {
    return "{'name':'" + urlname + "','fields':{'name':{'stringValue':'" + name + "'},'breath':{'stringValue':'" + breath + "'},'posture':{'stringValue':'" + posture + "'}}}";
  } 
}