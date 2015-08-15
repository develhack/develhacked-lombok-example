package com.develhacl.lombok.example;

import java.io.InputStream;

import com.develhack.annotation.feature.Accessible;
import com.develhack.annotation.feature.Serializable;

/**
 * Example for the {@link Serializable @Serializable}.
 */
@Serializable
public class SerializableExample { // Will be implemented the java.io.Serializable.

	@Accessible
	private String foo;

	@Accessible
	private transient InputStream bar; // However, You should specify the 'transient' modifier to the unserializable field.
}
