package io.confluent.examples.streams.microservices.domain.beans;

public class OrderId {

  public static String id(long id) {
    return String.valueOf(id);
  }
}