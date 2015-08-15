package com.develhacl.lombok.example;

import com.develhack.annotation.feature.Access;
import com.develhack.annotation.feature.ExcludedFrom;
import com.develhack.annotation.feature.InitializeFieldsByConstructor;

/**
 * Example for the {@link InitializeFieldsByConstructorExample @InitializeFieldsByConstructorExample}.
 */
// Will be supplemented the constructor that takes arguments for initializing the all non-transient
// and non initialized final field if the allFieldsInitializer is not Access.NONE.
@InitializeFieldsByConstructor(allFieldsInitializer = Access.PROTECTED)
public class InitializeFieldsByConstructorExample {

	private String foo;
	private final String bar;
	private final String baz = "baz"; // Will not initialized by constructor.
	private transient String qux; // Will not initialized by constructor.

	@ExcludedFrom(InitializeFieldsByConstructor.class)
	private transient String quux; // Will not initialized by constructor.

	// Javadoc on field will be used to the @param tag of constructor.
	/** Javadoc on field */
	private String withJavadoc;
}
