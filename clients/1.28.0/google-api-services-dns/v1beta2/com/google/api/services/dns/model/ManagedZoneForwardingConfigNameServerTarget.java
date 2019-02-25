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
 * Model definition for ManagedZoneForwardingConfigNameServerTarget.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZoneForwardingConfigNameServerTarget extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv4Address;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneForwardingConfigNameServerTarget".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv4Address() {
    return ipv4Address;
  }

  /**
   * @param ipv4Address ipv4Address or {@code null} for none
   */
  public ManagedZoneForwardingConfigNameServerTarget setIpv4Address(java.lang.String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneForwardingConfigNameServerTarget".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZoneForwardingConfigNameServerTarget".
   * @param kind kind or {@code null} for none
   */
  public ManagedZoneForwardingConfigNameServerTarget setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public ManagedZoneForwardingConfigNameServerTarget set(String fieldName, Object value) {
    return (ManagedZoneForwardingConfigNameServerTarget) super.set(fieldName, value);
  }

  @Override
  public ManagedZoneForwardingConfigNameServerTarget clone() {
    return (ManagedZoneForwardingConfigNameServerTarget) super.clone();
  }

}
