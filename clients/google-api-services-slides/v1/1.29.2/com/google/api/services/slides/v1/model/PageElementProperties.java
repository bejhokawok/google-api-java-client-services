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

package com.google.api.services.slides.v1.model;

/**
 * Common properties for a page element.
 *
 * Note: When you initially create a PageElement, the API may modify the values of both `size` and
 * `transform`, but the visual size will be unchanged.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PageElementProperties extends com.google.api.client.json.GenericJson {

  /**
   * The object ID of the page where the element is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageObjectId;

  /**
   * The size of the element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size size;

  /**
   * The transform for the element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AffineTransform transform;

  /**
   * The object ID of the page where the element is located.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageObjectId() {
    return pageObjectId;
  }

  /**
   * The object ID of the page where the element is located.
   * @param pageObjectId pageObjectId or {@code null} for none
   */
  public PageElementProperties setPageObjectId(java.lang.String pageObjectId) {
    this.pageObjectId = pageObjectId;
    return this;
  }

  /**
   * The size of the element.
   * @return value or {@code null} for none
   */
  public Size getSize() {
    return size;
  }

  /**
   * The size of the element.
   * @param size size or {@code null} for none
   */
  public PageElementProperties setSize(Size size) {
    this.size = size;
    return this;
  }

  /**
   * The transform for the element.
   * @return value or {@code null} for none
   */
  public AffineTransform getTransform() {
    return transform;
  }

  /**
   * The transform for the element.
   * @param transform transform or {@code null} for none
   */
  public PageElementProperties setTransform(AffineTransform transform) {
    this.transform = transform;
    return this;
  }

  @Override
  public PageElementProperties set(String fieldName, Object value) {
    return (PageElementProperties) super.set(fieldName, value);
  }

  @Override
  public PageElementProperties clone() {
    return (PageElementProperties) super.clone();
  }

}
