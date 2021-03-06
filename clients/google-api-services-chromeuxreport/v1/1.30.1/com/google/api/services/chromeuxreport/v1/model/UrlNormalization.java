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

package com.google.api.services.chromeuxreport.v1.model;

/**
 * Object representing the normalization actions taken to normalize a url to achieve a higher chance
 * of successful lookup. These are simple automated changes that are taken when looking up the
 * provided `url_patten` would be known to fail. Complex actions like following redirects are not
 * handled.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome UX Report API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UrlNormalization extends com.google.api.client.json.GenericJson {

  /**
   * The URL after any normalization actions. This is a valid user experience URL that could
   * reasonably be looked up.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String normalizedUrl;

  /**
   * The original requested URL prior to any normalization actions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String originalUrl;

  /**
   * The URL after any normalization actions. This is a valid user experience URL that could
   * reasonably be looked up.
   * @return value or {@code null} for none
   */
  public java.lang.String getNormalizedUrl() {
    return normalizedUrl;
  }

  /**
   * The URL after any normalization actions. This is a valid user experience URL that could
   * reasonably be looked up.
   * @param normalizedUrl normalizedUrl or {@code null} for none
   */
  public UrlNormalization setNormalizedUrl(java.lang.String normalizedUrl) {
    this.normalizedUrl = normalizedUrl;
    return this;
  }

  /**
   * The original requested URL prior to any normalization actions.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginalUrl() {
    return originalUrl;
  }

  /**
   * The original requested URL prior to any normalization actions.
   * @param originalUrl originalUrl or {@code null} for none
   */
  public UrlNormalization setOriginalUrl(java.lang.String originalUrl) {
    this.originalUrl = originalUrl;
    return this;
  }

  @Override
  public UrlNormalization set(String fieldName, Object value) {
    return (UrlNormalization) super.set(fieldName, value);
  }

  @Override
  public UrlNormalization clone() {
    return (UrlNormalization) super.clone();
  }

}
