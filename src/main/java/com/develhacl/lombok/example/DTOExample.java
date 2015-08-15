package com.develhacl.lombok.example;

import com.develhack.annotation.assertion.Nonempty;
import com.develhack.annotation.assertion.Nullable;
import com.develhack.annotation.feature.Access;
import com.develhack.annotation.feature.Accessible;
import com.develhack.annotation.feature.DTO;
import com.develhack.annotation.feature.ExcludedFrom;

/**
 * Example for the {@link DTO @DTO}.
 */
// Can specify the default visibility of the accessors.
@DTO(set = Access.PROTECTED)
public class DTOExample { // Will be implemented the java.io.Serializable.

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
	/** Javadoc on field */
	private String withJavadoc;

}
