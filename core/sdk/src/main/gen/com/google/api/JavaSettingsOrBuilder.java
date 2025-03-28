// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/client.proto
// Protobuf Java Version: 4.28.3

package com.google.api;

public interface JavaSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.JavaSettings)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The package name to use in Java. Clobbers the java_package option
   * set in the protobuf. This should be used **only** by APIs
   * who have already set the language_settings.java.package_name" field
   * in gapic.yaml. API teams should use the protobuf java_package option
   * where possible.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * library_package: com.google.cloud.pubsub.v1
   * </pre>
   *
   * <code>string library_package = 1 [json_name = "libraryPackage"];</code>
   * @return The libraryPackage.
   */
  java.lang.String getLibraryPackage();
  /**
   * <pre>
   * The package name to use in Java. Clobbers the java_package option
   * set in the protobuf. This should be used **only** by APIs
   * who have already set the language_settings.java.package_name" field
   * in gapic.yaml. API teams should use the protobuf java_package option
   * where possible.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * library_package: com.google.cloud.pubsub.v1
   * </pre>
   *
   * <code>string library_package = 1 [json_name = "libraryPackage"];</code>
   * @return The bytes for libraryPackage.
   */
  com.google.protobuf.ByteString
      getLibraryPackageBytes();

  /**
   * <pre>
   * Configure the Java class name to use instead of the service's for its
   * corresponding generated GAPIC client. Keys are fully-qualified
   * service names as they appear in the protobuf (including the full
   * the language_settings.java.interface_names" field in gapic.yaml. API
   * teams should otherwise use the service name as it appears in the
   * protobuf.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * service_class_names:
   * - google.pubsub.v1.Publisher: TopicAdmin
   * - google.pubsub.v1.Subscriber: SubscriptionAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; service_class_names = 2 [json_name = "serviceClassNames"];</code>
   */
  int getServiceClassNamesCount();
  /**
   * <pre>
   * Configure the Java class name to use instead of the service's for its
   * corresponding generated GAPIC client. Keys are fully-qualified
   * service names as they appear in the protobuf (including the full
   * the language_settings.java.interface_names" field in gapic.yaml. API
   * teams should otherwise use the service name as it appears in the
   * protobuf.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * service_class_names:
   * - google.pubsub.v1.Publisher: TopicAdmin
   * - google.pubsub.v1.Subscriber: SubscriptionAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; service_class_names = 2 [json_name = "serviceClassNames"];</code>
   */
  boolean containsServiceClassNames(
      java.lang.String key);
  /**
   * Use {@link #getServiceClassNamesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getServiceClassNames();
  /**
   * <pre>
   * Configure the Java class name to use instead of the service's for its
   * corresponding generated GAPIC client. Keys are fully-qualified
   * service names as they appear in the protobuf (including the full
   * the language_settings.java.interface_names" field in gapic.yaml. API
   * teams should otherwise use the service name as it appears in the
   * protobuf.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * service_class_names:
   * - google.pubsub.v1.Publisher: TopicAdmin
   * - google.pubsub.v1.Subscriber: SubscriptionAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; service_class_names = 2 [json_name = "serviceClassNames"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getServiceClassNamesMap();
  /**
   * <pre>
   * Configure the Java class name to use instead of the service's for its
   * corresponding generated GAPIC client. Keys are fully-qualified
   * service names as they appear in the protobuf (including the full
   * the language_settings.java.interface_names" field in gapic.yaml. API
   * teams should otherwise use the service name as it appears in the
   * protobuf.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * service_class_names:
   * - google.pubsub.v1.Publisher: TopicAdmin
   * - google.pubsub.v1.Subscriber: SubscriptionAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; service_class_names = 2 [json_name = "serviceClassNames"];</code>
   */

  /* nullable */
java.lang.String getServiceClassNamesOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Configure the Java class name to use instead of the service's for its
   * corresponding generated GAPIC client. Keys are fully-qualified
   * service names as they appear in the protobuf (including the full
   * the language_settings.java.interface_names" field in gapic.yaml. API
   * teams should otherwise use the service name as it appears in the
   * protobuf.
   *
   * Example of a YAML configuration::
   *
   * publishing:
   * java_settings:
   * service_class_names:
   * - google.pubsub.v1.Publisher: TopicAdmin
   * - google.pubsub.v1.Subscriber: SubscriptionAdmin
   * </pre>
   *
   * <code>map&lt;string, string&gt; service_class_names = 2 [json_name = "serviceClassNames"];</code>
   */

  java.lang.String getServiceClassNamesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 3 [json_name = "common"];</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <pre>
   * Some settings.
   * </pre>
   *
   * <code>.google.api.CommonLanguageSettings common = 3 [json_name = "common"];</code>
   * @return The common.
   */
  com.google.api.CommonLanguageSettings getCommon();
}
