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

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Model definition for GoogleCloudDatacatalogV1beta1FieldTypeEnumType.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1FieldTypeEnumType extends com.google.api.client.json.GenericJson {

  /**
   * The set of allowed values for this enum. This set must not be empty, the display names of the
   * values in this set must not be empty and the display names of the values must be case-
   * insensitively unique within this set. The order of items in this list is preserved. This field
   * can be used to Required on create; optional on update. The set of allowed values for this enum.
   * This set must not be empty, the display names of the values in this set must not be empty and
   * the display names of the values must be case-insensitively unique within this set. Currently,
   * enum values can only be added to the list of allowed values. Deletion and renaming of enum
   * values are not supported. Can have up to 500 allowed values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue> allowedValues;

  /**
   * The set of allowed values for this enum. This set must not be empty, the display names of the
   * values in this set must not be empty and the display names of the values must be case-
   * insensitively unique within this set. The order of items in this list is preserved. This field
   * can be used to Required on create; optional on update. The set of allowed values for this enum.
   * This set must not be empty, the display names of the values in this set must not be empty and
   * the display names of the values must be case-insensitively unique within this set. Currently,
   * enum values can only be added to the list of allowed values. Deletion and renaming of enum
   * values are not supported. Can have up to 500 allowed values.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue> getAllowedValues() {
    return allowedValues;
  }

  /**
   * The set of allowed values for this enum. This set must not be empty, the display names of the
   * values in this set must not be empty and the display names of the values must be case-
   * insensitively unique within this set. The order of items in this list is preserved. This field
   * can be used to Required on create; optional on update. The set of allowed values for this enum.
   * This set must not be empty, the display names of the values in this set must not be empty and
   * the display names of the values must be case-insensitively unique within this set. Currently,
   * enum values can only be added to the list of allowed values. Deletion and renaming of enum
   * values are not supported. Can have up to 500 allowed values.
   * @param allowedValues allowedValues or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1FieldTypeEnumType setAllowedValues(java.util.List<GoogleCloudDatacatalogV1beta1FieldTypeEnumTypeEnumValue> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1FieldTypeEnumType set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1FieldTypeEnumType) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1FieldTypeEnumType clone() {
    return (GoogleCloudDatacatalogV1beta1FieldTypeEnumType) super.clone();
  }

}
