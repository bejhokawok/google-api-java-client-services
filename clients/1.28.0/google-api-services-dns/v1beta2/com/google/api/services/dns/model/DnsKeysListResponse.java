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
 * Model definition for DnsKeysListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DnsKeysListResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DnsKey> dnsKeys;

  static {
    // hack to force ProGuard to consider DnsKey used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DnsKey.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResponseHeader header;

  /**
   * Type of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<DnsKey> getDnsKeys() {
    return dnsKeys;
  }

  /**
   * @param dnsKeys dnsKeys or {@code null} for none
   */
  public DnsKeysListResponse setDnsKeys(java.util.List<DnsKey> dnsKeys) {
    this.dnsKeys = dnsKeys;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ResponseHeader getHeader() {
    return header;
  }

  /**
   * @param header header or {@code null} for none
   */
  public DnsKeysListResponse setHeader(ResponseHeader header) {
    this.header = header;
    return this;
  }

  /**
   * Type of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of resource.
   * @param kind kind or {@code null} for none
   */
  public DnsKeysListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public DnsKeysListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public DnsKeysListResponse set(String fieldName, Object value) {
    return (DnsKeysListResponse) super.set(fieldName, value);
  }

  @Override
  public DnsKeysListResponse clone() {
    return (DnsKeysListResponse) super.clone();
  }

}
