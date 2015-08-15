package com.develhacl.lombok.example;

import com.develhack.annotation.feature.ExcludedFrom;
import com.develhack.annotation.feature.InitializeFieldsByConstructor;
import com.develhack.annotation.feature.VO;

/**
 * Example for the {@link VO @VO}.
 */
@VO
@InitializeFieldsByConstructor
public final class VOExample {

	// All non-transient fields will evaluated by toString(), equals() and hashCode().
	private final String foo;
	private final String bar;
	private transient String baz; // Will not evaluated.

	@ExcludedFrom(VO.class)
	private String qux; // Will not evaluated.

	// Javadoc on field will be used to the @param tag of getter.
	/** Javadoc on field */
	private String withJavadoc;
}
