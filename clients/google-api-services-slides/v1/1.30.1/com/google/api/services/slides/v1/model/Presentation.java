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
 * A Google Slides presentation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Presentation extends com.google.api.client.json.GenericJson {

  /**
   * The layouts in the presentation. A layout is a template that determines how content is arranged
   * and styled on the slides that inherit from that layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Page> layouts;

  static {
    // hack to force ProGuard to consider Page used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Page.class);
  }

  /**
   * The locale of the presentation, as an IETF BCP 47 language tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locale;

  /**
   * The slide masters in the presentation. A slide master contains all common page elements and the
   * common properties for a set of layouts. They serve three purposes:
   *
   * - Placeholder shapes on a master contain the default text styles and shape   properties of all
   * placeholder shapes on pages that use that master. - The master page properties define the
   * common page properties inherited by   its layouts. - Any other shapes on the master slide will
   * appear on all slides using that   master, regardless of their layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Page> masters;

  static {
    // hack to force ProGuard to consider Page used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Page.class);
  }

  /**
   * The notes master in the presentation. It serves three purposes:
   *
   * - Placeholder shapes on a notes master contain the default text styles and   shape properties
   * of all placeholder shapes on notes pages. Specifically,   a `SLIDE_IMAGE` placeholder shape
   * contains the slide thumbnail, and a   `BODY` placeholder shape contains the speaker notes. -
   * The notes master page properties define the common page properties   inherited by all notes
   * pages. - Any other shapes on the notes master will appear on all notes pages.
   *
   * The notes master is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Page notesMaster;

  /**
   * The size of pages in the presentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Size pageSize;

  /**
   * The ID of the presentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String presentationId;

  /**
   * The revision ID of the presentation. Can be used in update requests to assert that the
   * presentation revision hasn't changed since the last read operation. Only populated if the user
   * has edit access to the presentation.
   *
   * The format of the revision ID may change over time, so it should be treated opaquely. A
   * returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and
   * cannot be shared across users. If the revision ID is unchanged between calls, then the
   * presentation has not changed. Conversely, a changed ID (for the same presentation and user)
   * usually means the presentation has been updated; however, a changed ID can also be due to
   * internal factors such as ID format changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * The slides in the presentation. A slide inherits properties from a slide layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Page> slides;

  static {
    // hack to force ProGuard to consider Page used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Page.class);
  }

  /**
   * The title of the presentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The layouts in the presentation. A layout is a template that determines how content is arranged
   * and styled on the slides that inherit from that layout.
   * @return value or {@code null} for none
   */
  public java.util.List<Page> getLayouts() {
    return layouts;
  }

  /**
   * The layouts in the presentation. A layout is a template that determines how content is arranged
   * and styled on the slides that inherit from that layout.
   * @param layouts layouts or {@code null} for none
   */
  public Presentation setLayouts(java.util.List<Page> layouts) {
    this.layouts = layouts;
    return this;
  }

  /**
   * The locale of the presentation, as an IETF BCP 47 language tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocale() {
    return locale;
  }

  /**
   * The locale of the presentation, as an IETF BCP 47 language tag.
   * @param locale locale or {@code null} for none
   */
  public Presentation setLocale(java.lang.String locale) {
    this.locale = locale;
    return this;
  }

  /**
   * The slide masters in the presentation. A slide master contains all common page elements and the
   * common properties for a set of layouts. They serve three purposes:
   *
   * - Placeholder shapes on a master contain the default text styles and shape   properties of all
   * placeholder shapes on pages that use that master. - The master page properties define the
   * common page properties inherited by   its layouts. - Any other shapes on the master slide will
   * appear on all slides using that   master, regardless of their layout.
   * @return value or {@code null} for none
   */
  public java.util.List<Page> getMasters() {
    return masters;
  }

  /**
   * The slide masters in the presentation. A slide master contains all common page elements and the
   * common properties for a set of layouts. They serve three purposes:
   *
   * - Placeholder shapes on a master contain the default text styles and shape   properties of all
   * placeholder shapes on pages that use that master. - The master page properties define the
   * common page properties inherited by   its layouts. - Any other shapes on the master slide will
   * appear on all slides using that   master, regardless of their layout.
   * @param masters masters or {@code null} for none
   */
  public Presentation setMasters(java.util.List<Page> masters) {
    this.masters = masters;
    return this;
  }

  /**
   * The notes master in the presentation. It serves three purposes:
   *
   * - Placeholder shapes on a notes master contain the default text styles and   shape properties
   * of all placeholder shapes on notes pages. Specifically,   a `SLIDE_IMAGE` placeholder shape
   * contains the slide thumbnail, and a   `BODY` placeholder shape contains the speaker notes. -
   * The notes master page properties define the common page properties   inherited by all notes
   * pages. - Any other shapes on the notes master will appear on all notes pages.
   *
   * The notes master is read-only.
   * @return value or {@code null} for none
   */
  public Page getNotesMaster() {
    return notesMaster;
  }

  /**
   * The notes master in the presentation. It serves three purposes:
   *
   * - Placeholder shapes on a notes master contain the default text styles and   shape properties
   * of all placeholder shapes on notes pages. Specifically,   a `SLIDE_IMAGE` placeholder shape
   * contains the slide thumbnail, and a   `BODY` placeholder shape contains the speaker notes. -
   * The notes master page properties define the common page properties   inherited by all notes
   * pages. - Any other shapes on the notes master will appear on all notes pages.
   *
   * The notes master is read-only.
   * @param notesMaster notesMaster or {@code null} for none
   */
  public Presentation setNotesMaster(Page notesMaster) {
    this.notesMaster = notesMaster;
    return this;
  }

  /**
   * The size of pages in the presentation.
   * @return value or {@code null} for none
   */
  public Size getPageSize() {
    return pageSize;
  }

  /**
   * The size of pages in the presentation.
   * @param pageSize pageSize or {@code null} for none
   */
  public Presentation setPageSize(Size pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The ID of the presentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPresentationId() {
    return presentationId;
  }

  /**
   * The ID of the presentation.
   * @param presentationId presentationId or {@code null} for none
   */
  public Presentation setPresentationId(java.lang.String presentationId) {
    this.presentationId = presentationId;
    return this;
  }

  /**
   * The revision ID of the presentation. Can be used in update requests to assert that the
   * presentation revision hasn't changed since the last read operation. Only populated if the user
   * has edit access to the presentation.
   *
   * The format of the revision ID may change over time, so it should be treated opaquely. A
   * returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and
   * cannot be shared across users. If the revision ID is unchanged between calls, then the
   * presentation has not changed. Conversely, a changed ID (for the same presentation and user)
   * usually means the presentation has been updated; however, a changed ID can also be due to
   * internal factors such as ID format changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * The revision ID of the presentation. Can be used in update requests to assert that the
   * presentation revision hasn't changed since the last read operation. Only populated if the user
   * has edit access to the presentation.
   *
   * The format of the revision ID may change over time, so it should be treated opaquely. A
   * returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and
   * cannot be shared across users. If the revision ID is unchanged between calls, then the
   * presentation has not changed. Conversely, a changed ID (for the same presentation and user)
   * usually means the presentation has been updated; however, a changed ID can also be due to
   * internal factors such as ID format changes.
   * @param revisionId revisionId or {@code null} for none
   */
  public Presentation setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * The slides in the presentation. A slide inherits properties from a slide layout.
   * @return value or {@code null} for none
   */
  public java.util.List<Page> getSlides() {
    return slides;
  }

  /**
   * The slides in the presentation. A slide inherits properties from a slide layout.
   * @param slides slides or {@code null} for none
   */
  public Presentation setSlides(java.util.List<Page> slides) {
    this.slides = slides;
    return this;
  }

  /**
   * The title of the presentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the presentation.
   * @param title title or {@code null} for none
   */
  public Presentation setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Presentation set(String fieldName, Object value) {
    return (Presentation) super.set(fieldName, value);
  }

  @Override
  public Presentation clone() {
    return (Presentation) super.clone();
  }

}
