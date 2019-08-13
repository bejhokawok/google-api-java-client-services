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

package com.google.api.services.compute.model;

/**
 * Policy for retention of scheduled snapshots.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Maximum age of the snapshot that is allowed to be kept.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxRetentionDays;

  /**
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onSourceDiskDelete;

  /**
   * Maximum age of the snapshot that is allowed to be kept.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxRetentionDays() {
    return maxRetentionDays;
  }

  /**
   * Maximum age of the snapshot that is allowed to be kept.
   * @param maxRetentionDays maxRetentionDays or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicyRetentionPolicy setMaxRetentionDays(java.lang.Integer maxRetentionDays) {
    this.maxRetentionDays = maxRetentionDays;
    return this;
  }

  /**
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnSourceDiskDelete() {
    return onSourceDiskDelete;
  }

  /**
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * @param onSourceDiskDelete onSourceDiskDelete or {@code null} for none
   */
  public ResourcePolicySnapshotSchedulePolicyRetentionPolicy setOnSourceDiskDelete(java.lang.String onSourceDiskDelete) {
    this.onSourceDiskDelete = onSourceDiskDelete;
    return this;
  }

  @Override
  public ResourcePolicySnapshotSchedulePolicyRetentionPolicy set(String fieldName, Object value) {
    return (ResourcePolicySnapshotSchedulePolicyRetentionPolicy) super.set(fieldName, value);
  }

  @Override
  public ResourcePolicySnapshotSchedulePolicyRetentionPolicy clone() {
    return (ResourcePolicySnapshotSchedulePolicyRetentionPolicy) super.clone();
  }

}