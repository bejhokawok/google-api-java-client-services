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

package com.google.api.services.run.v1.model;

/**
 * The current state of the Domain Mapping.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoDomainMappingStatus extends com.google.api.client.json.GenericJson {

  /**
   * Array of observed AutoDomainMappingConditions, indicating the current state of the
   * AutoDomainMapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV1Condition> conditions;

  /**
   * ObservedGeneration is the 'Generation' of the AutoDomainMapping that was last processed by the
   * controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer observedGeneration;

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain mapping.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceRecord> resourceRecords;

  /**
   * Array of observed AutoDomainMappingConditions, indicating the current state of the
   * AutoDomainMapping.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV1Condition> getConditions() {
    return conditions;
  }

  /**
   * Array of observed AutoDomainMappingConditions, indicating the current state of the
   * AutoDomainMapping.
   * @param conditions conditions or {@code null} for none
   */
  public AutoDomainMappingStatus setConditions(java.util.List<GoogleCloudRunV1Condition> conditions) {
    this.conditions = conditions;
    return this;
  }

  /**
   * ObservedGeneration is the 'Generation' of the AutoDomainMapping that was last processed by the
   * controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getObservedGeneration() {
    return observedGeneration;
  }

  /**
   * ObservedGeneration is the 'Generation' of the AutoDomainMapping that was last processed by the
   * controller.
   *
   * Clients polling for completed reconciliation should poll until observedGeneration =
   * metadata.generation and the Ready condition's status is True or False.
   * @param observedGeneration observedGeneration or {@code null} for none
   */
  public AutoDomainMappingStatus setObservedGeneration(java.lang.Integer observedGeneration) {
    this.observedGeneration = observedGeneration;
    return this;
  }

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain mapping.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceRecord> getResourceRecords() {
    return resourceRecords;
  }

  /**
   * The resource records required to configure this domain mapping. These records must be added to
   * the domain's DNS configuration in order to serve the application via this domain mapping.
   * @param resourceRecords resourceRecords or {@code null} for none
   */
  public AutoDomainMappingStatus setResourceRecords(java.util.List<ResourceRecord> resourceRecords) {
    this.resourceRecords = resourceRecords;
    return this;
  }

  @Override
  public AutoDomainMappingStatus set(String fieldName, Object value) {
    return (AutoDomainMappingStatus) super.set(fieldName, value);
  }

  @Override
  public AutoDomainMappingStatus clone() {
    return (AutoDomainMappingStatus) super.clone();
  }

}
