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
 * Model definition for OperationManagedZoneContext.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationManagedZoneContext extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZone newValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedZone oldValue;

  /**
   * @return value or {@code null} for none
   */
  public ManagedZone getNewValue() {
    return newValue;
  }

  /**
   * @param newValue newValue or {@code null} for none
   */
  public OperationManagedZoneContext setNewValue(ManagedZone newValue) {
    this.newValue = newValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ManagedZone getOldValue() {
    return oldValue;
  }

  /**
   * @param oldValue oldValue or {@code null} for none
   */
  public OperationManagedZoneContext setOldValue(ManagedZone oldValue) {
    this.oldValue = oldValue;
    return this;
  }

  @Override
  public OperationManagedZoneContext set(String fieldName, Object value) {
    return (OperationManagedZoneContext) super.set(fieldName, value);
  }

  @Override
  public OperationManagedZoneContext clone() {
    return (OperationManagedZoneContext) super.clone();
  }

}
