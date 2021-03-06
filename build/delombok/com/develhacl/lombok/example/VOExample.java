// Generated by delombok at Sat Aug 15 19:14:06 JST 2015
package com.develhacl.lombok.example;

import com.develhack.annotation.feature.ExcludedFrom;
import com.develhack.annotation.feature.InitializeFieldsByConstructor;
import com.develhack.annotation.feature.VO;

/**
 * Example for the {@link VO @VO}.
 */
@VO
@InitializeFieldsByConstructor
@java.lang.SuppressWarnings("serial")
public final class VOExample implements java.io.Serializable {
	// All non-transient fields will evaluated by toString(), equals() and hashCode().
	private final String foo;
	private final String bar;
	private transient String baz; // Will not evaluated.
	@ExcludedFrom(VO.class)
	private String qux; // Will not evaluated.
	// Javadoc on field will be used to the @param tag of getter.
	/**
	 * Javadoc on field
	 */
	private String withJavadoc;

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public VOExample(String foo, String bar) {
		this.foo = foo;
		this.bar = bar;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getFoo() {
		return this.foo;
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getBar() {
		return this.bar;
	}

	/**
	 * @return Javadoc on field
	 */
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public String getWithJavadoc() {
		return this.withJavadoc;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof VOExample)) return false;
		final VOExample other = (VOExample)o;
		final java.lang.Object this$foo = this.foo;
		final java.lang.Object other$foo = other.foo;
		if (this$foo == null ? other$foo != null : !this$foo.equals(other$foo)) return false;
		final java.lang.Object this$bar = this.bar;
		final java.lang.Object other$bar = other.bar;
		if (this$bar == null ? other$bar != null : !this$bar.equals(other$bar)) return false;
		final java.lang.Object this$qux = this.qux;
		final java.lang.Object other$qux = other.qux;
		if (this$qux == null ? other$qux != null : !this$qux.equals(other$qux)) return false;
		final java.lang.Object this$withJavadoc = this.withJavadoc;
		final java.lang.Object other$withJavadoc = other.withJavadoc;
		if (this$withJavadoc == null ? other$withJavadoc != null : !this$withJavadoc.equals(other$withJavadoc)) return false;
		return true;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $foo = this.foo;
		result = result * PRIME + ($foo == null ? 0 : $foo.hashCode());
		final java.lang.Object $bar = this.bar;
		result = result * PRIME + ($bar == null ? 0 : $bar.hashCode());
		final java.lang.Object $qux = this.qux;
		result = result * PRIME + ($qux == null ? 0 : $qux.hashCode());
		final java.lang.Object $withJavadoc = this.withJavadoc;
		result = result * PRIME + ($withJavadoc == null ? 0 : $withJavadoc.hashCode());
		return result;
	}
}