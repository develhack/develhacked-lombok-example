package com.develhacl.lombok.example;

import java.time.LocalDateTime;

import com.develhack.annotation.assertion.FiniteNumber;
import com.develhack.annotation.assertion.GreaterThan;
import com.develhack.annotation.assertion.InRange;
import com.develhack.annotation.assertion.Nonempty;
import com.develhack.annotation.assertion.Nonnull;
import com.develhack.annotation.assertion.Nullable;
import com.develhack.annotation.assertion.ValidNumber;

/**
 * Example for annotations that contained in the {@code com.develhack.annotation.assertion} package.
 */
public class AssertionsExample extends Thread {

	/**
	 * Default constructor.
	 */
	public AssertionsExample() {}

	/**
	 * An example of the annotations on constructor arguments.
	 *
	 * @param target must be non-null
	 * @param name must be non-empty
	 */
	public AssertionsExample(@Nonnull Runnable target, @Nonempty String name) {
		super(target, name);
	}

	/**
	 * An example of the {@code @Nonnull}.
	 *
	 * @param arg must be non-null
	 */
	public void nonnull(@Nonnull String arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @Nonempty}.
	 *
	 * @param arg must be non-empty
	 */
	public void nonempty(@Nonempty String arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the combination of {@code @Nonempty} and {@code @Nullable}.
	 *
	 * @param arg must be non-empty but may be null
	 */
	public void nonemptyWithNullable(@Nonempty @Nullable String arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @ValidNumber}.
	 *
	 * @param arg must be valid number
	 */
	public void validNumber(@ValidNumber Double arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @FiniteNumber}.
	 *
	 * @param arg must be finite number
	 */
	public void finiteNumber(@FiniteNumber Double arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @GreaterThan} having literal value.
	 *
	 * @param arg must be greater than {@literal 1}
	 */
	public void greaterThanLiteralValue(@GreaterThan("1") int arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @GreaterThan} having constant value.
	 *
	 * @param arg must be greater than {@link Integer#MIN_VALUE}
	 */
	public void greaterThanConstantValue(@GreaterThan("Integer.MIN_VALUE") int arg) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @GreaterThan} having variable value.
	 *
	 * @param arg must be greater than the {@code threshold}
	 * @param threshold lower threshold of the {@code arg}
	 */
	public void greaterThanVariableValue(@GreaterThan("threshold") int arg, int threshold) {
		System.out.println(arg);
	}

	/**
	 * An example of the {@code @InRange} having constant value.
	 *
	 * @param arg must be in the range of from {@literal 2015-01-01T12:34:16} to {@literal 2015-12-31T12:34:15}
	 */
	public void inRangeOfLocalDateTime(@InRange(from = "2015-01-01T12:34:16", to = "2015-12-31T12:34:15") LocalDateTime arg) {
		System.out.println(arg);
	}
}
