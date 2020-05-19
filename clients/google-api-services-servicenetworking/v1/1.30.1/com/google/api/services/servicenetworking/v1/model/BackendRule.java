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

package com.google.api.services.servicenetworking.v1.model;

/**
 * A backend rule provides configuration for an individual API element.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendRule extends com.google.api.client.json.GenericJson {

  /**
   * The address of the API backend.
   *
   * The scheme is used to determine the backend protocol and security. The following schemes are
   * accepted:
   *
   *    SCHEME        PROTOCOL    SECURITY    http://       HTTP        None    https://      HTTP
   * TLS    grpc://       gRPC        None    grpcs://      gRPC        TLS
   *
   * It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting
   * behaviors across platforms.
   *
   * If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with
   * TLS
   *
   * For HTTP backends, use protocol to specify the protocol version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The number of seconds to wait for a response from a request. The default varies based on the
   * request protocol and deployment environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double deadline;

  /**
   * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization"
   * HTTP header will be preserved. If the header is used to carry the original token and is
   * expected by the backend, this field must be set to true to preserve the header.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableAuth;

  /**
   * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be
   * added in the HTTP "authorization" header, and sent to the backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jwtAudience;

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minDeadline;

  /**
   * The number of seconds to wait for the completion of a long running operation. The default is no
   * deadline.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double operationDeadline;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pathTranslation;

  /**
   * The protocol used for sending a request to the backend. The supported values are "http/1.1" and
   * "h2".
   *
   * The default value is inferred from the scheme in the address field:
   *
   *    SCHEME        PROTOCOL    http://       http/1.1    https://      http/1.1    grpc://
   * h2    grpcs://      h2
   *
   * For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved
   * performance.
   *
   * Configuring this field to non-default values is only supported for secure HTTP backends. This
   * field will be ignored for all other backends.
   *
   * See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml
   * #alpn-protocol-ids for more details on the supported values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String protocol;

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * The address of the API backend.
   *
   * The scheme is used to determine the backend protocol and security. The following schemes are
   * accepted:
   *
   *    SCHEME        PROTOCOL    SECURITY    http://       HTTP        None    https://      HTTP
   * TLS    grpc://       gRPC        None    grpcs://      gRPC        TLS
   *
   * It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting
   * behaviors across platforms.
   *
   * If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with
   * TLS
   *
   * For HTTP backends, use protocol to specify the protocol version.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address of the API backend.
   *
   * The scheme is used to determine the backend protocol and security. The following schemes are
   * accepted:
   *
   *    SCHEME        PROTOCOL    SECURITY    http://       HTTP        None    https://      HTTP
   * TLS    grpc://       gRPC        None    grpcs://      gRPC        TLS
   *
   * It is recommended to explicitly include a scheme. Leaving out the scheme may cause constrasting
   * behaviors across platforms.
   *
   * If the port is unspecified, the default is: - 80 for schemes without TLS - 443 for schemes with
   * TLS
   *
   * For HTTP backends, use protocol to specify the protocol version.
   * @param address address or {@code null} for none
   */
  public BackendRule setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * The number of seconds to wait for a response from a request. The default varies based on the
   * request protocol and deployment environment.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDeadline() {
    return deadline;
  }

  /**
   * The number of seconds to wait for a response from a request. The default varies based on the
   * request protocol and deployment environment.
   * @param deadline deadline or {@code null} for none
   */
  public BackendRule setDeadline(java.lang.Double deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization"
   * HTTP header will be preserved. If the header is used to carry the original token and is
   * expected by the backend, this field must be set to true to preserve the header.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableAuth() {
    return disableAuth;
  }

  /**
   * When disable_auth is true, a JWT ID token won't be generated and the original "Authorization"
   * HTTP header will be preserved. If the header is used to carry the original token and is
   * expected by the backend, this field must be set to true to preserve the header.
   * @param disableAuth disableAuth or {@code null} for none
   */
  public BackendRule setDisableAuth(java.lang.Boolean disableAuth) {
    this.disableAuth = disableAuth;
    return this;
  }

  /**
   * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be
   * added in the HTTP "authorization" header, and sent to the backend.
   * @return value or {@code null} for none
   */
  public java.lang.String getJwtAudience() {
    return jwtAudience;
  }

  /**
   * The JWT audience is used when generating a JWT ID token for the backend. This ID token will be
   * added in the HTTP "authorization" header, and sent to the backend.
   * @param jwtAudience jwtAudience or {@code null} for none
   */
  public BackendRule setJwtAudience(java.lang.String jwtAudience) {
    this.jwtAudience = jwtAudience;
    return this;
  }

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinDeadline() {
    return minDeadline;
  }

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * @param minDeadline minDeadline or {@code null} for none
   */
  public BackendRule setMinDeadline(java.lang.Double minDeadline) {
    this.minDeadline = minDeadline;
    return this;
  }

  /**
   * The number of seconds to wait for the completion of a long running operation. The default is no
   * deadline.
   * @return value or {@code null} for none
   */
  public java.lang.Double getOperationDeadline() {
    return operationDeadline;
  }

  /**
   * The number of seconds to wait for the completion of a long running operation. The default is no
   * deadline.
   * @param operationDeadline operationDeadline or {@code null} for none
   */
  public BackendRule setOperationDeadline(java.lang.Double operationDeadline) {
    this.operationDeadline = operationDeadline;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPathTranslation() {
    return pathTranslation;
  }

  /**
   * @param pathTranslation pathTranslation or {@code null} for none
   */
  public BackendRule setPathTranslation(java.lang.String pathTranslation) {
    this.pathTranslation = pathTranslation;
    return this;
  }

  /**
   * The protocol used for sending a request to the backend. The supported values are "http/1.1" and
   * "h2".
   *
   * The default value is inferred from the scheme in the address field:
   *
   *    SCHEME        PROTOCOL    http://       http/1.1    https://      http/1.1    grpc://
   * h2    grpcs://      h2
   *
   * For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved
   * performance.
   *
   * Configuring this field to non-default values is only supported for secure HTTP backends. This
   * field will be ignored for all other backends.
   *
   * See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml
   * #alpn-protocol-ids for more details on the supported values.
   * @return value or {@code null} for none
   */
  public java.lang.String getProtocol() {
    return protocol;
  }

  /**
   * The protocol used for sending a request to the backend. The supported values are "http/1.1" and
   * "h2".
   *
   * The default value is inferred from the scheme in the address field:
   *
   *    SCHEME        PROTOCOL    http://       http/1.1    https://      http/1.1    grpc://
   * h2    grpcs://      h2
   *
   * For secure HTTP backends (https://) that support HTTP/2, set this field to "h2" for improved
   * performance.
   *
   * Configuring this field to non-default values is only supported for secure HTTP backends. This
   * field will be ignored for all other backends.
   *
   * See https://www.iana.org/assignments/tls-extensiontype-values/tls-extensiontype-values.xhtml
   * #alpn-protocol-ids for more details on the supported values.
   * @param protocol protocol or {@code null} for none
   */
  public BackendRule setProtocol(java.lang.String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public BackendRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public BackendRule set(String fieldName, Object value) {
    return (BackendRule) super.set(fieldName, value);
  }

  @Override
  public BackendRule clone() {
    return (BackendRule) super.clone();
  }

}
