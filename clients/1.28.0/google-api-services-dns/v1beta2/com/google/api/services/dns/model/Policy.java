/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dns.model;

/**
 * Model definition for Policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyAlternativeNameServerConfig alternativeNameServerConfig;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableInboundForwarding;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyNetwork> networks;

  /**
   * @return value or {@code null} for none
   */
  public PolicyAlternativeNameServerConfig getAlternativeNameServerConfig() {
    return alternativeNameServerConfig;
  }

  /**
   * @param alternativeNameServerConfig alternativeNameServerConfig or {@code null} for none
   */
  public Policy setAlternativeNameServerConfig(PolicyAlternativeNameServerConfig alternativeNameServerConfig) {
    this.alternativeNameServerConfig = alternativeNameServerConfig;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public Policy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableInboundForwarding() {
    return enableInboundForwarding;
  }

  /**
   * @param enableInboundForwarding enableInboundForwarding or {@code null} for none
   */
  public Policy setEnableInboundForwarding(java.lang.Boolean enableInboundForwarding) {
    this.enableInboundForwarding = enableInboundForwarding;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public Policy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * @param kind kind or {@code null} for none
   */
  public Policy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public Policy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyNetwork> getNetworks() {
    return networks;
  }

  /**
   * @param networks networks or {@code null} for none
   */
  public Policy setNetworks(java.util.List<PolicyNetwork> networks) {
    this.networks = networks;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
