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
 * A List describes the look and feel of bullets belonging to paragraphs associated with a list. A
 * paragraph that is part of a list has an implicit reference to that list's ID.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class List extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String listId;

  /**
   * A map of nesting levels to the properties of bullets at the associated level. A list has at
   * most nine levels of nesting, so the possible values for the keys of this map are 0 through 8,
   * inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, NestingLevel> nestingLevel;

  static {
    // hack to force ProGuard to consider NestingLevel used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NestingLevel.class);
  }

  /**
   * The ID of the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getListId() {
    return listId;
  }

  /**
   * The ID of the list.
   * @param listId listId or {@code null} for none
   */
  public List setListId(java.lang.String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * A map of nesting levels to the properties of bullets at the associated level. A list has at
   * most nine levels of nesting, so the possible values for the keys of this map are 0 through 8,
   * inclusive.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, NestingLevel> getNestingLevel() {
    return nestingLevel;
  }

  /**
   * A map of nesting levels to the properties of bullets at the associated level. A list has at
   * most nine levels of nesting, so the possible values for the keys of this map are 0 through 8,
   * inclusive.
   * @param nestingLevel nestingLevel or {@code null} for none
   */
  public List setNestingLevel(java.util.Map<String, NestingLevel> nestingLevel) {
    this.nestingLevel = nestingLevel;
    return this;
  }

  @Override
  public List set(String fieldName, Object value) {
    return (List) super.set(fieldName, value);
  }

  @Override
  public List clone() {
    return (List) super.clone();
  }

}
