package com.develhacl.lombok.example;

import java.math.BigDecimal;

import com.develhack.annotation.feature.Equatable;
import com.develhack.annotation.feature.ExcludedFrom;

/**
 * Example for the {@link Equatable @Equatable}.
 */
// Will evaluate the super#equals() if evaluateSuperclass is true.
@Equatable(evaluateSuperclass = true)
public class EquatableExample extends BigDecimal {

	public EquatableExample(String paramString) {
		super(paramString);
	}

	// All non-transient fields will evaluated by the equals() and hashCode().
	private String foo;
	private String bar;
	private transient String baz; // Will not evaluated.

	@ExcludedFrom(Equatable.class)
	private String qux; // Will not evaluated.

}
