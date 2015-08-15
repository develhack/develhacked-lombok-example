package com.develhacl.lombok.example;

import com.develhack.annotation.assertion.Nonnull;
import com.develhack.annotation.feature.Utility;

/**
 * Example for the {@link Utility @Utility}.
 */
@Utility
public class UtilityExample { // Will be set the final modifier, and will be supplemented the uncallable constructor.

	public static void foo(@Nonnull String bar) {
		System.out.println(bar);
	}
}
