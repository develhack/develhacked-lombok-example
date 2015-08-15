package com.develhacl.lombok.example;

import java.math.BigDecimal;

import com.develhack.annotation.feature.ExcludedFrom;
import com.develhack.annotation.feature.Stringable;

/**
 * Example for the {@link Stringable @Stringable}.
 */
// Will evaluate the super#toString() if evaluateSuperclass is true.
@Stringable(evaluateSuperclass = true)
public class StringableExample extends BigDecimal {

	public StringableExample(String paramString) {
		super(paramString);
	}

	// All non-transient fields will evaluated by toString().
	private int foo;
	private Integer bar;
	private transient String baz; // Will not evaluated.

	@ExcludedFrom(Stringable.class)
	private String qux; // Will not evaluated.
}
