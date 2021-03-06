// Generated by delombok at Sat Aug 15 19:14:06 JST 2015
package com.develhacl.lombok.example;

import com.develhack.annotation.assertion.Nonempty;
import com.develhack.annotation.assertion.Nullable;
import com.develhack.annotation.feature.Access;
import com.develhack.annotation.feature.Accessible;
import com.develhack.annotation.feature.DTO;
import com.develhack.annotation.feature.ExcludedFrom;
// Can specify the default visibility of the accessors.

/**
 * Example for the {@link DTO @DTO}.
 */
@DTO(set = Access.PROTECTED)
@java.lang.SuppressWarnings("serial")
public class DTOExample implements java.io.Serializable {

	// Will be implemented the java.io.Serializable.
	// Will be supplemented the accessors for all non-transient fields.
	private String foo;
	private final String bar = "bar";
	private transient String baz; // Will be supplemented no accessor.
	@ExcludedFrom(DTO.class)
	private String qux; // Will be supplemented no accessor.
	// Can override the visibility by the @Accessible.
	@Accessible(set = Access.NONE)
	private String readOnly;
	// Can combine with the annotations for assertion.
	@Nullable
	@Nonempty
	private String mustBeNonempty = "bar";
	// Javadoc on field will be used to the @param/@return tag of accessor.
	/**
	 * Javadoc on field
	 */
	private String withJavadoc;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getReadOnly() {
		return this.readOnly;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getFoo() {
		return this.foo;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected void setFoo(String foo) {
		this.foo = foo;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getBar() {
		return this.bar;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getMustBeNonempty() {
		return this.mustBeNonempty;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected void setMustBeNonempty(@Nullable @Nonempty String mustBeNonempty) {
		com.develhack.Conditions.checkNonemptyIfNonnull("mustBeNonempty", mustBeNonempty);
		this.mustBeNonempty = mustBeNonempty;
	}

	/**
	 * @return Javadoc on field
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getWithJavadoc() {
		return this.withJavadoc;
	}

	/**
	 * @param withJavadoc Javadoc on field
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	protected void setWithJavadoc(String withJavadoc) {
		this.withJavadoc = withJavadoc;
	}
}