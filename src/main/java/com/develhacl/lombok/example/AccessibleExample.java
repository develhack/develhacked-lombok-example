package com.develhacl.lombok.example;

import com.develhack.annotation.assertion.Nonempty;
import com.develhack.annotation.assertion.Nullable;
import com.develhack.annotation.feature.Access;
import com.develhack.annotation.feature.Accessible;

/**
 * Example for the {@link Accessible @Accessible}.
 */
public class AccessibleExample {

	// Default visibility of accessor is public.
	@Accessible
	private String canAccessFromAnyone;

	// Can specify the visibility of accessor.
	@Accessible(get = Access.PUBLIC, set = Access.DEFAULT)
	private String canWriteFromSamePackageOnly;

	// The field having final modifier is supplemented the getter only.
	@Accessible
	private final String readOnly = "foo";

	// Can combine with the annotations for assertion.
	@Accessible
	@Nullable
	@Nonempty
	private String mustBeNonempty = "bar";

	// Javadoc on field will be used to the @param/@return tag of accessor.
	/** Javadoc on field */
	@Accessible
	private String withJavadoc;
}
